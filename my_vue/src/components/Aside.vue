<template>
    <!--左侧导航-->
    <el-menu :default-openeds="['1']" style="min-height: 100vh; overflow-x: hidden;"
             background-color="rgb(48, 65, 86)"
             text-color="#fff"
             active-text-color="#ffd04b"
             :collapse-transition="false"
             :collapse="isCollapse"
             router
    >
        <div style="height: 60px;line-height: 60px;text-align: center;">
            <img src="../assets/logo.png" alt="" style="width: 20px;position: relative;top:5px;margin-right: 5px"/>
            <b style="color: #fff" v-show="logoTextShow">后台管理系统</b>
        </div>
        <el-menu-item  index="/">
            <template slot="title"><i class="el-icon-house"></i>
                <span slot="title">主页</span>
            </template>
        </el-menu-item >

        <el-submenu index="2">
            <template slot="title"><i class="el-icon-menu"></i>
                <span slot="title">系统管理</span>
            </template>
            <el-menu-item index="/user"><i class="el-icon-s-custom"/>用户管理</el-menu-item>
            <el-menu-item index="/food"><i class="el-icon-sugar"/>商品管理</el-menu-item>
            <el-menu-item index="/order"><i class="el-icon-truck"/>订单管理</el-menu-item>
            <el-menu-item index="/file"><i class="el-icon-tickets"/>文件管理</el-menu-item>
        </el-submenu>
    </el-menu>
</template>

<script>
    export default {
        name: "Aside",
        props: {
            isCollapse: Boolean,
            logoTextShow: Boolean,
        }
    }
</script>

<style scoped>

</style>