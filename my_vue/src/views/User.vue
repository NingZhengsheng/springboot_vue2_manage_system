<template>
    <div>
        <!--搜索框-->
        <div style="padding: 10px 0;">
            <el-input style="width: 200px;" placeholder="请输入名称" suffix-icon="el-icon-search" v-model="username" ></el-input>
            <!--<el-input style="width: 200px;" placeholder="请输入邮箱" suffix-icon="el-icon-message" class="ml-5"></el-input>-->
            <!--<el-input style="width: 200px;" placeholder="请输入地址" suffix-icon="el-icon-position"  class="ml-5"></el-input>-->
            <el-button class="ml-5" type="primary" @click="searchHand">搜索</el-button>
            <el-button  type="warning" @click="reset">重置</el-button>
        </div>
        <!--新增-->
        <div style="margin: 10px 0">
            <el-button type="primary" @click="handleAdd">新增 <i class="el-icon-circle-plus-outline"></i></el-button>
            <el-popconfirm class="ml-5" confirm-button-text='确定' cancel-button-text='我再想想' icon="el-icon-info" icon-color="red" title="确定删除吗？" @confirm="handleBatchDelete">
                <el-button type="danger" slot="reference">批量删除 <i class="el-icon-remove-outline"></i></el-button>
            </el-popconfirm>
            <el-upload name="multipartFile" action="http://localhost:9090/user/import"
                       :on-success="handleExcelImportSuccess" :limit="1" :show-file-list="false"
                       accept="xlsx" style="display: inline-block">
                <el-button type="primary" class="ml-5">导入 <i class="el-icon-download"></i></el-button>
            </el-upload>
            <el-button type="primary" @click="expfun" class="ml-5">导出 <i class="el-icon-upload2"></i></el-button>
        </div>

        <!--  -->
        <el-table :data="tableData" border stripe header-cell-class-name="tableHeaderBg" @selection-change="handleSelectionChange">
            <!--复选框-->
            <el-table-column type="selection" width="45"></el-table-column>
            <!--每行数据-->
            <el-table-column prop="id" label="编号" width="60"></el-table-column>
            <el-table-column prop="username" label="用户名" width="120"></el-table-column>
            <el-table-column prop="nickname" label="昵称"></el-table-column>
            <el-table-column prop="email" label="邮箱"></el-table-column>
            <el-table-column prop="phone" label="电话"></el-table-column>
            <el-table-column prop="address" label="地址"></el-table-column>
            <el-table-column prop="op" label="操作" width="250" align="center">
                <template slot-scope="scope">
                    <el-button type="success" @click="handleEdit(scope.row)">编辑 <i class="el-icon-edit-outline"></i></el-button>
                    <el-popconfirm class="ml-5" confirm-button-text='确定' cancel-button-text='我再想想'
                                   icon="el-icon-info" icon-color="red" title="确定删除吗？" @confirm="handleDelete(scope.row.id)">
                        <el-button type="danger" slot="reference">删除 <i class="el-icon-delete"></i></el-button>
                    </el-popconfirm>
                </template>
            </el-table-column>
        </el-table>

        <!--分页-->
        <div style="padding: 10px 0;">
            <el-pagination
                    @size-change="handleSizeChange"
                    @current-change="handleCurrentChange"
                    :page-sizes="[5, 10, 15, 20]"
                    :current-page="pageIndex"
                    :page-size="pageSize"
                    layout="total, sizes, prev, pager, next, jumper"
                    :total="total">
            </el-pagination>
        </div>

        <!--新增用户弹窗-->
        <el-dialog title="用户信息" :visible.sync="dialogFormVisible" width="35%">
            <el-form label-width="100px" size="small">
                <el-form-item label="用户名"><el-input v-model="form.username" autocomplete="off"></el-input></el-form-item>
                <el-form-item label="昵称"><el-input v-model="form.nickname" autocomplete="off"></el-input></el-form-item>
                <el-form-item label="邮箱"><el-input v-model="form.email" autocomplete="off"></el-input></el-form-item>
                <el-form-item label="电话"><el-input v-model="form.phone" autocomplete="off"></el-input></el-form-item>
                <el-form-item label="地址"><el-input v-model="form.address" autocomplete="off"></el-input></el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click="dialogFormVisible = false">取 消</el-button>
                <el-button type="primary" @click="savaUser">确 定</el-button>
            </div>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        name: "User",
        data(){
            const item = {
                username: 'ning',
                nickname: '战胜',
                email: 'ning@123',
                phone: '123456789',
                address: '上海市普陀区金沙江路 1518 弄'
            };
            return {
                tableData: Array(10).fill(item),
                total: 100,//记录总数
                pageIndex: 1,//分页编号
                pageSize: 5,//分页大小
                // collapseBtnClass:'el-icon-s-fold',
                // isCollapse:false,//导航栏是否打开
                // sideWidth:200,
                // logoTextShow:true,//logo文本是否显示
                dialogFormVisible: false, //新增弹窗是否展示
                form: {},//用户表单信息
                multipleSelection: [],//复选框选择内容
                username: "",//用户名与空间绑定
            }
        },
        created(){
            this.loadPage();//分页加载数据
        },
        methods:{
            loadPage(){
                // 2.使用 axios 请求后端数据
                this.request.get("/user/page",{
                    params: {
                        pageIndex: this.pageIndex,
                        pageSize: this.pageSize,
                        username: this.username
                    }
                }).then(res => {
                    console.log(res);
                    this.tableData = res.records;
                    this.total = res.total;
                });
            },
            searchHand(){
                this.pageIndex = 1;
                this.loadPage();
            },
            handleSizeChange(pageSize){
                console.log(`每页 ${pageSize} 条`);
                this.pageSize = pageSize;
                this.loadPage();//分页加载数据
            },
            handleCurrentChange(pageIndex){
                console.log(`当前页: ${pageIndex}`);
                this.pageIndex = pageIndex;
                this.loadPage();//分页加载数据
            },
            reset(){//重置按钮
                this.username = "";
                this.loadPage();
            },
            handleAdd(){//新增用户按钮
                this.dialogFormVisible =  true;
                this.form = {};//置空form表单
            },
            savaUser(){//新增用户
                this.request.post("/user",this.form).then(res => {
                    if(res){
                        this.$message.success("保存成功！");
                        this.loadPage();
                    }
                    else this.$message.error("保存失败！");
                });
                this.dialogFormVisible =  false;
            },
            handleEdit(row){//编辑用户
                this.form = row;
                this.dialogFormVisible = true;
            },
            handleDelete(id){//删除用户
                this.request.delete("/user/"+id).then(res => {
                    if(res){
                        this.$message.success("删除成功！");
                        this.loadPage();
                    }
                    else this.$message.error("删除失败！");
                });
            },
            handleSelectionChange(val){//复选框选择事件
                this.multipleSelection = val;
            },
            handleBatchDelete(){//批量删除
                let ids = this.multipleSelection.map(v => v.id);//将对象数组 取出属性数组[1,2,3..]
                this.request.post("/user/del/batch",ids).then(res => {
                    if(res){
                        this.$message.success("批量删除成功！");
                        this.pageIndex=1;
                        this.loadPage();
                    }
                    else this.$message.error("批量删除失败！");
                });
            },
            expfun(){//导出表格
                window.open("http://localhost:9090/user/export");
            },
            handleExcelImportSuccess(){//导入Excel文件
                this.$message.success("文件导入成功！");
                this.loadPage();
            }
        }
    }
</script>

<style>
    .tableHeaderBg{
        background: #eee!important;
    }
</style>