<template>
    <div>
        <!--搜索框-->
        <div style="padding: 10px 0;">
            <el-input style="width: 200px;" placeholder="请输入文件名称" suffix-icon="el-icon-search" v-model="filename" ></el-input>
            <el-button class="ml-5" type="primary" @click="searchHand">搜索</el-button>
            <el-button  type="warning" @click="reset">重置</el-button>
        </div>

        <!--新增-->
        <div style="margin: 10px 0">
            <el-upload name="multipartFile" action="http://localhost:9090/file/upload" :on-success="handleFileUploadSuccess" :show-file-list="false"  style="display: inline-block">
                <el-button type="primary" class="ml-5">上传文件</el-button>
            </el-upload>
            <el-popconfirm class="ml-5" confirm-button-text='确定' cancel-button-text='我再想想' icon="el-icon-info" icon-color="red" title="确定删除吗？" @confirm="handleBatchDelete">
                <el-button type="danger" slot="reference">批量删除 <i class="el-icon-remove-outline"></i></el-button>
            </el-popconfirm>
        </div>

        <!-- 主体部分：表格数据 -->
        <el-table :data="tableData" border stripe header-cell-class-name="tableHeaderBg" @selection-change="handleSelectionChange">
            <!--复选框-->
            <el-table-column type="selection" width="45"></el-table-column>
            <!--每行数据-->
            <el-table-column prop="id" label="编号" width="60"></el-table-column>
            <el-table-column prop="filename" label="文件名称" ></el-table-column>
            <el-table-column prop="type" label="文件类型"></el-table-column>
            <el-table-column prop="size" label="文件大小(kb)"></el-table-column>
            <el-table-column prop="url" label="下载">
                <template slot-scope="scope">
                    <el-button type="primary" @click="downloadHand(scope.row.url)">下载</el-button>
                    <img src=""/>
                </template>

            </el-table-column>
            <el-table-column prop="enable" label="启用">
                <template slot-scope="scope">
                    <el-switch v-model="scope.row.enable" @change="changeEnable(scope.row)" active-color="#13ce66" inactive-color="#ccc"></el-switch>
                </template>
            </el-table-column>
            <el-table-column prop="op" label="操作" width="250" align="center">
                <template slot-scope="scope">
                    <el-button type="primary" @click="downloadHand(scope.row.url)">下载</el-button>
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
    </div>
</template>

<script>
    export default {
        name: "File",
        data(){
            const item = {
                filename: '图片1',
                type: 'png',
                size: '256',
                url: 'http://localhost/file/test.png',
                enable: '1'
            };
            return {
                tableData: Array(10).fill(item),
                filename: "",
                multipleSelection: [],
                total: 100,//记录总数
                pageIndex: 1,//分页编号
                pageSize: 5,//分页大小
            }
        },
        created() {
            this.loadPage();//分页加载数据
        },
        methods:{
            loadPage(){
                // 2.使用 axios 请求后端数据
                this.request.get("/file/page",{
                    params: {
                        pageIndex: this.pageIndex,
                        pageSize: this.pageSize,
                        filename: this.filename
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
                this.filename = "";
                this.loadPage();
            },
            handleDelete(id){//删除文件
                this.request.delete("/file/"+id).then(res => {
                    if(res.code==200){
                        this.$message.success(res.msg);
                        this.loadPage();
                    } else this.$message.error(res.msg);
                });
            },
            handleSelectionChange(val){//复选框选择事件
                this.multipleSelection = val;
            },
            handleBatchDelete(){//批量删除
                let ids = this.multipleSelection.map(v => v.id);//将对象数组 取出属性数组[1,2,3..]
                this.request.post("/file/del/batch",ids).then(res => {
                    if(res){
                        this.$message.success("批量删除成功！");
                        this.pageIndex=1;
                        this.loadPage();
                    }
                    else this.$message.error("批量删除失败！");
                });
            },
            handleFileUploadSuccess(res){//文件上传成功返回
                console.log("文件上传返回结果：",res);
                this.loadPage();
            },
            downloadHand(fileUrl){//下载文件
                window.open(fileUrl);
            },
            changeEnable(row){//更新文件
                this.request.post("/file/update",row).then(res => {
                    if(res.code==200){
                        this.$message.success(res.msg);
                        this.pageIndex=1;
                        this.loadPage();
                    } else this.$message.error(res.msg);
                });
            }
        }
    }
</script>

<style scoped>

</style>