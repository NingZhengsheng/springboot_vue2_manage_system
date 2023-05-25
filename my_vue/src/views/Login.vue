<template>
    <div class="wrapper">
        <div style="margin: 200px auto;background-color: #fff;width: 350px;padding: 20px;border-radius: 10px">
            <div style="margin: 20px 0; text-align: center; font-size: 24px" ><b>登 录</b>
                <el-form :model="user"  :rules="rules" ref="ruleForm" >
                    <el-form-item prop="username" style="margin: 20px 0;">
                        <el-input size="medium" prefix-icon="el-icon-user" v-model="user.username" ></el-input>
                    </el-form-item>
                    <el-form-item prop="password"style="margin: 20px 0;">
                        <el-input size="medium" prefix-icon="el-icon-lock" v-model="user.password" show-password></el-input>
                    </el-form-item>

                    <el-form-item style="margin: 10px 0; text-align: center;">
                        <el-button type="primary" size="small" autocomplete="off" @click="login">登录</el-button>
                        <el-button type="warning" size="small" autocomplete="off" @click= "$router.push('/register')">注册</el-button>
                    </el-form-item>
                </el-form>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Login",
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
                }
            }
        },
        methods: {
            login(){//用户登录
                this.$refs["ruleForm"].validate((valid) => {
                    if (valid) {//校验成功
                        this.request.post("/user/login",this.user).then(res => {
                            console.log(res);
                            if(res.code == 200){
                                localStorage.setItem("user",JSON.stringify(res.data));//登录成功后，将用户信息存入浏览器
                                this.$router.push("/");
                                this.$message.success("登录成功");
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