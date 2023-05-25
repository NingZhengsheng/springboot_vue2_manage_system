import Vue from 'vue'
import VueRouter from 'vue-router'
import store from "@/store" //引入

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import('../views/SysManage.vue'),
    redirect: "/mainHome",
    children:[
        {path:'mainHome', name: '后台主页', component: ()=>import("../views/MainHome.vue")},
        {path:'user', name: '用户管理', component: ()=>import("../views/User.vue")},
        {path:'personInfo', name: '个人信息', component: ()=>import("../views/PersonInfo.vue")},
        {path:'file', name: '文件管理', component: ()=>import("../views/File.vue")},
    ]
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue'),
  },
  {
      path: '/register',
      name: 'Register',
      component: () => import('../views/Register.vue'),
  },
  {
    path: '/about',
    name: 'about',
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

// 设置路由守卫
router.beforeEach((to,from,next) => {
  localStorage.setItem("currentPathName",to.name);
  store.commit("setPath");//触发store的数据更新
  next();//放行路由
});

export default router
