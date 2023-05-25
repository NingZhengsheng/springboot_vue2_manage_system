<template>
  <el-container style="min-height:100vh; border: 1px solid #eee">
    <!--左侧导航-->
    <el-aside :width="sideWidth+'px'" style="background-color: rgb(238, 241, 246);height: 100%;">
      <Aside :isCollapse="isCollapse" :logoTextShow="logoTextShow"/>
    </el-aside>

    <!--右边主体内容-->
    <el-container>
      <el-header style="border-bottom: 1px solid #ccc; ">
        <Header :collapseBtnClass="collapseBtnClass" :user="user" @asideCollapse="collapse"/>
      </el-header>

      <el-main>
        <!-- 表示当前页面的子路由会在 router-view 里面展示  -->
        <router-view @refreshUser="getUser"/>
      </el-main>

    </el-container>

  </el-container>
</template>



<script>
// @ is an alias to /src
import Aside from "../components/Aside";
import Header from "../components/Header"
import User from "./User"

export default {
  name: 'HomeView',
  components: {Aside,Header,User},
  data(){
      return {
          collapseBtnClass:'el-icon-s-fold',
          isCollapse:false,//导航栏是否打开
          sideWidth:200,
          logoTextShow:true,//logo文本是否显示
          user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
      }
  },
    methods: {
        collapse(){
            this.isCollapse = !this.isCollapse;
            if(this.isCollapse){
                this.sideWidth = 64;
                this.collapseBtnClass = "el-icon-s-unfold";
                this.logoTextShow = false;
            }else{
                this.sideWidth = 200;
                this.collapseBtnClass = "el-icon-s-fold";
                this.logoTextShow = true;
            }
        },

        //通过PersonInfo子组件 触发 父组件中的@asideCollapse="collapse"
        getUser(){
            this.request.get("http://localhost:9090/user/"+this.user.id).then(res => {
                this.user = res.data;
            })
        }
    }
}
</script>