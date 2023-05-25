<template>
    <div style="font-size: 12px ; line-height: 60px;display: flex;">
        <div style="flex: 1;">
            <span :class="collapseBtnClass" style="margin-right: 15px; font-size: 18px;" @click="collapse"></span>
            <!--Breadcrumb 页屑-->
            <el-breadcrumb separator="/" style="display: inline-block;">
                <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
                <el-breadcrumb-item>{{currentPathName}}</el-breadcrumb-item>
            </el-breadcrumb>
        </div>
        <el-dropdown style="width: 100px;cursor: pointer;">
            <div style="display: inline-block;">
                <!--头像-->
                <img :src="user.avatar" style="width: 30px; border-radius: 50%;position: relative; top:10px; right: 5px;"/>
                <span>{{user.nickname}}</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
            </div>
            <el-dropdown-menu slot="dropdown" style="width: 100px; text-align: center">
                <el-dropdown-item ><router-link style="text-decoration: none" to="/personInfo">个人信息</router-link></el-dropdown-item>
                <el-dropdown-item>
                    <span style="text-decoration: none" @click="logout">退出</span>
                </el-dropdown-item>
            </el-dropdown-menu>
        </el-dropdown>
    </div>
</template>

<script>
    export default {
        name: "Header",
        data(){
            return {
                // user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
            }
        },
        props: {
            collapseBtnClass: String,
            user: Object,
        },
        computed: {
            currentPathName(){
                return this.$store.state.currentPathName;//需要监听的数据
            }
        },
        methods:{
            collapse(){//【点击收缩展开按钮函数】
                console.log("点击收缩按钮");
                this.$emit("asideCollapse");
            },
            logout(){
                this.$router.push("/login");
                localStorage.removeItem("user");
                this.$message.success("退出成功");
            }
        }
    }
</script>

<style scoped>

</style>