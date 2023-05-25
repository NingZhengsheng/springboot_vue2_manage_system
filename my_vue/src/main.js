import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import './assets/global.css'
import request from "./utils/request";
import store from "@/store" //引入

Vue.config.productionTip = false;
Vue.use(ElementUI,{size:"mini"});//使用ElementUI
Vue.prototype.request = request;//vue main 注册request，使用./utils/request

new Vue({
  router,
  store,//store
  render: h => h(App)
}).$mount('#app');
