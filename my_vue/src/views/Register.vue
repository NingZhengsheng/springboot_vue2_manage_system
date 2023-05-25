<template>
    <div class="wrapper">
        <div style="margin: 200px auto;background-color: #fff;width: 350px;padding: 20px;border-radius: 10px">
            <div style="margin: 20px 0; text-align: center; font-size: 24px" ><b>注 册</b>
                <el-form :model="user"  :rules="rules" ref="ruleForm" >
                    <el-form-item prop="username" style="margin: 15px 0;">
                        <el-input placeholder="请输入账号" size="medium" prefix-icon="el-icon-user" v-model="user.username" ></el-input>
                    </el-form-item>
                    <el-form-item prop="password"style="margin: 15px 0;">
                        <el-input placeholder="请输入密码" size="medium" prefix-icon="el-icon-lock" v-model="user.password" show-password></el-input>
                    </el-form-item>
                    <el-form-item prop="confirmPassword"style="margin: 15px 0;">
                        <el-input placeholder="请确认密码" size="medium" prefix-icon="el-icon-lock" v-model="user.confirmPassword" show-password></el-input>
                    </el-form-item>
                    <el-form-item style="margin: 10px 0; text-align: center;">
                        <el-button type="primary" size="small" autocomplete="off" @click="register">注册</el-button>
                        <el-button type="warning" size="small" autocomplete="off" @click= "$router.push('/login')">返回登录</el-button>
                    </el-form-item>
                </el-form>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data(){
            return{
                user: {},
                rules: {
                    username: [
                        { required: true, message: '请输入用户名', trigger: 'blur' },
                        { min: 3, max: 10, message: '长度在 3 到 10 个字符', trigger: 'blur' }
                    ],
                    password: [
                        { required: true, message: '请输入密码', trigger: 'blur' },
                        { min: 3, max: 10, message: '长度在 3 到 10 个字符', trigger: 'blur' }
                    ],
                    confirmPassword: [
                        { required: true, message: '请确认密码', trigger: 'blur' },
                        { min: 3, max: 10, message: '长度在 3 到 10 个字符', trigger: 'blur' }
                    ],
                }
            }
        },
        methods: {
            register(){//用户注册
                this.$refs["ruleForm"].validate((valid) => {
                    if (valid) {//校验成功
                        if(this.user.password !== this.user.confirmPassword){
                            this.$message.error("两次密码不一致");
                            return false;
                        }
                        this.request.post("/user/register",this.user).then(res => {
                            console.log(res);
                            if(res.code == 200){
                                this.$router.push("/login");
                                this.$message.success("注册成功");
                            }else{
                                this.$message.error(res.msg);
                            }
                        });
                    }
                });
            }
        }
    }
</script>

<style>
    .wrapper{
        height: 100vh;
        background-image: linear-gradient(to bottom right,#FC466B,#3F5EFB);
        overflow: hidden;
    }
</style>