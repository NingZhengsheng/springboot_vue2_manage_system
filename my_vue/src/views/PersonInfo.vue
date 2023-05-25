<template>
    <el-card style="width: 500px; padding: 20px">
        <el-form label-width="100px" size="small">
            <el-upload
                    style="text-align: center;margin:10px"
                    name="multipartFile"
                    class="avatar-uploader"
                    action="http://localhost:9090/file/upload"
                    :show-file-list="false"
                    :on-success="handleAvatarSuccess">
                <img v-if="form.avatar" :src="form.avatar" class="avatar">
                <i v-else class="el-icon-plus avatar-uploader-icon"></i>
            </el-upload>
            <el-form-item label="用户名"><el-input v-model="form.username" autocomplete="off" disabled=""></el-input></el-form-item>
            <el-form-item label="昵称"><el-input v-model="form.nickname" autocomplete="off"></el-input></el-form-item>
            <el-form-item label="邮箱"><el-input v-model="form.email" autocomplete="off"></el-input></el-form-item>
            <el-form-item label="电话"><el-input v-model="form.phone" autocomplete="off"></el-input></el-form-item>
            <el-form-item label="地址"><el-input type="textarea" v-model="form.address" autocomplete="off"></el-input></el-form-item>
            <el-form-item>
                <el-button type="primary" @click="savaUser">确 定</el-button>
            </el-form-item>
        </el-form>
    </el-card>
</template>

<script>
    export default {
        name: "PersonInfo",
        data(){
            return {
                form: {},
                user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
            }
        },
        created(){
            this.getUser().then(res => {
                console.log("用户信息：",res);
                this.form  = res;
            })
        },
        methods: {
            async getUser(){
                return (await this.request.get("http://localhost:9090/user/"+this.user.id)).data;
            },
            savaUser(){//修改用户信息
                this.request.post("/user",this.form).then(res => {
                    if(res.code == 200){
                        this.$message.success("保存成功！");
                        this.getUser().then(res => {
                            res.token = JSON.parse(localStorage.getItem("user")).token;
                            localStorage.setItem("user",JSON.stringify(res));//将当前用户信息重新存储
                        });

                        //触发父级更新User的方法 refreshUser()
                        this.$emit("refreshUser");
                    }
                    else this.$message.error("保存失败！");
                });
            },
            handleAvatarSuccess(res){//用户头像上传成功函数
                console.log("上传个人头像返回结果：",res)
                this.form.avatar = res;
            }
        }
    }
</script>

<style>
    .avatar-uploader .el-upload {
        border: 1px dashed #d9d9d9;
        border-radius: 6px;
        cursor: pointer;
        position: relative;
        overflow: hidden;
    }
    .avatar-uploader .el-upload:hover {
        border-color: #409EFF;
    }
    .avatar-uploader-icon {
        font-size: 28px;
        color: #8c939d;
        width: 178px;
        height: 178px;
        line-height: 178px;
        text-align: center;
    }
    .avatar {
        width: 178px;
        height: 178px;
        display: block;
    }
</style>