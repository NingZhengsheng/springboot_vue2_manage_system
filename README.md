<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**

- [一、创建Vue项目](#%E4%B8%80%E5%88%9B%E5%BB%BAvue%E9%A1%B9%E7%9B%AE)
  - [1.1 安装Node.js和Vue](#11-%E5%AE%89%E8%A3%85nodejs%E5%92%8Cvue)
  - [1.2 创建Vue项目](#12-%E5%88%9B%E5%BB%BAvue%E9%A1%B9%E7%9B%AE)
  - [1.3 运行Vue项目](#13-%E8%BF%90%E8%A1%8Cvue%E9%A1%B9%E7%9B%AE)
  - [1.4 安装 element-ui](#14-%E5%AE%89%E8%A3%85-element-ui)
- [二、创建springboot项目](#%E4%BA%8C%E5%88%9B%E5%BB%BAspringboot%E9%A1%B9%E7%9B%AE)
  - [2.1 新建](#21-%E6%96%B0%E5%BB%BA)
  - [2.2 选择需要的依赖包](#22-%E9%80%89%E6%8B%A9%E9%9C%80%E8%A6%81%E7%9A%84%E4%BE%9D%E8%B5%96%E5%8C%85)
  - [2.3 创建完成](#23-%E5%88%9B%E5%BB%BA%E5%AE%8C%E6%88%90)
    - [2.3.1 配置阿里云镜像仓库](#231-%E9%85%8D%E7%BD%AE%E9%98%BF%E9%87%8C%E4%BA%91%E9%95%9C%E5%83%8F%E4%BB%93%E5%BA%93)
    - [2.3.2 配置数据库和端口号](#232-%E9%85%8D%E7%BD%AE%E6%95%B0%E6%8D%AE%E5%BA%93%E5%92%8C%E7%AB%AF%E5%8F%A3%E5%8F%B7)
  - [2.4 启动测试](#24-%E5%90%AF%E5%8A%A8%E6%B5%8B%E8%AF%95)
- [三、数据库 MyBatis](#%E4%B8%89%E6%95%B0%E6%8D%AE%E5%BA%93-mybatis)
  - [3.1 创建数据库和表](#31-%E5%88%9B%E5%BB%BA%E6%95%B0%E6%8D%AE%E5%BA%93%E5%92%8C%E8%A1%A8)
  - [3.2 使用MyBatis](#32-%E4%BD%BF%E7%94%A8mybatis)
  - [3.3 测试](#33-%E6%B5%8B%E8%AF%95)
- [四、模板：MyBatis 增删改查（User）](#%E5%9B%9B%E6%A8%A1%E6%9D%BFmybatis-%E5%A2%9E%E5%88%A0%E6%94%B9%E6%9F%A5user)
  - [4.1 基本结构与配置yml](#41-%E5%9F%BA%E6%9C%AC%E7%BB%93%E6%9E%84%E4%B8%8E%E9%85%8D%E7%BD%AEyml)
  - [4.2 实体类（entity）](#42-%E5%AE%9E%E4%BD%93%E7%B1%BBentity)
  - [4.3 DAO层（mapper）](#43-dao%E5%B1%82mapper)
  - [4.4 服务层（Service）](#44-%E6%9C%8D%E5%8A%A1%E5%B1%82service)
  - [4.5 控制层（Controller）](#45-%E6%8E%A7%E5%88%B6%E5%B1%82controller)
  - [4.6 结合Vue实现分页功能](#46-%E7%BB%93%E5%90%88vue%E5%AE%9E%E7%8E%B0%E5%88%86%E9%A1%B5%E5%8A%9F%E8%83%BD)
- [五、模板Mybatis-Puls 增删改查（User）](#%E4%BA%94%E6%A8%A1%E6%9D%BFmybatis-puls-%E5%A2%9E%E5%88%A0%E6%94%B9%E6%9F%A5user)
  - [5.1 安装使用](#51-%E5%AE%89%E8%A3%85%E4%BD%BF%E7%94%A8)
  - [5.2 配置MybatisPuls](#52-%E9%85%8D%E7%BD%AEmybatispuls)
  - [5.3 DAO层（mapper）](#53-dao%E5%B1%82mapper)
  - [5.4 服务层（Service）](#54-%E6%9C%8D%E5%8A%A1%E5%B1%82service)
  - [5.5 控制层（controller）](#55-%E6%8E%A7%E5%88%B6%E5%B1%82controller)
  - [5.6 结合Vue（axios）实现增删改查](#56-%E7%BB%93%E5%90%88vueaxios%E5%AE%9E%E7%8E%B0%E5%A2%9E%E5%88%A0%E6%94%B9%E6%9F%A5)
    - [5.6.1 安装axios](#561-%E5%AE%89%E8%A3%85axios)
    - [5.6.2 创建一个 request.js工具包](#562-%E5%88%9B%E5%BB%BA%E4%B8%80%E4%B8%AA-requestjs%E5%B7%A5%E5%85%B7%E5%8C%85)
    - [5.6.3 配置 main.js](#563-%E9%85%8D%E7%BD%AE-mainjs)
    - [5.6.4  Home.vue页面（5.7进行分解）](#564--homevue%E9%A1%B5%E9%9D%A257%E8%BF%9B%E8%A1%8C%E5%88%86%E8%A7%A3)
    - [5.6.5 效果展示](#565-%E6%95%88%E6%9E%9C%E5%B1%95%E7%A4%BA)
  - [5.7 对vue页面进行分解](#57-%E5%AF%B9vue%E9%A1%B5%E9%9D%A2%E8%BF%9B%E8%A1%8C%E5%88%86%E8%A7%A3)
    - [5.7.1 路由配置 router/index.js](#571-%E8%B7%AF%E7%94%B1%E9%85%8D%E7%BD%AE-routerindexjs)
    - [5.7.2 主界面 SysManage.vue](#572-%E4%B8%BB%E7%95%8C%E9%9D%A2-sysmanagevue)
    - [5.7.3 左侧导航栏 Aside.vue](#573-%E5%B7%A6%E4%BE%A7%E5%AF%BC%E8%88%AA%E6%A0%8F-asidevue)
    - [5.7.4 头部 Header.vue](#574-%E5%A4%B4%E9%83%A8-headervue)
    - [5.7.3 用户管理界面User.vue](#573-%E7%94%A8%E6%88%B7%E7%AE%A1%E7%90%86%E7%95%8C%E9%9D%A2uservue)
- [六、Mybatis-plus代码生成器](#%E5%85%ADmybatis-plus%E4%BB%A3%E7%A0%81%E7%94%9F%E6%88%90%E5%99%A8)
  - [6.1 导入依赖](#61-%E5%AF%BC%E5%85%A5%E4%BE%9D%E8%B5%96)
  - [6.2 编写生成器工具](#62-%E7%BC%96%E5%86%99%E7%94%9F%E6%88%90%E5%99%A8%E5%B7%A5%E5%85%B7)
  - [6.3 自定义生成模板](#63-%E8%87%AA%E5%AE%9A%E4%B9%89%E7%94%9F%E6%88%90%E6%A8%A1%E6%9D%BF)
  - [6.3 运行查看结果](#63-%E8%BF%90%E8%A1%8C%E6%9F%A5%E7%9C%8B%E7%BB%93%E6%9E%9C)
- [七、实现头部面包屑](#%E4%B8%83%E5%AE%9E%E7%8E%B0%E5%A4%B4%E9%83%A8%E9%9D%A2%E5%8C%85%E5%B1%91)
  - [7.1 安装 vuex](#71-%E5%AE%89%E8%A3%85-vuex)
  - [7.2 创建 src/store/index.js](#72-%E5%88%9B%E5%BB%BA-srcstoreindexjs)
  - [7.3 引入 vuex](#73-%E5%BC%95%E5%85%A5-vuex)
  - [7.4 vue界面展示](#74-vue%E7%95%8C%E9%9D%A2%E5%B1%95%E7%A4%BA)
- [八、实现Excel的导入导出](#%E5%85%AB%E5%AE%9E%E7%8E%B0excel%E7%9A%84%E5%AF%BC%E5%85%A5%E5%AF%BC%E5%87%BA)
  - [8.1 服务器端](#81-%E6%9C%8D%E5%8A%A1%E5%99%A8%E7%AB%AF)
  - [8.2 前端vue](#82-%E5%89%8D%E7%AB%AFvue)
- [九、自定义异常处理（登录与注册）](#%E4%B9%9D%E8%87%AA%E5%AE%9A%E4%B9%89%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E7%99%BB%E5%BD%95%E4%B8%8E%E6%B3%A8%E5%86%8C)
  - [9.1 自定义服务器异常处理](#91-%E8%87%AA%E5%AE%9A%E4%B9%89%E6%9C%8D%E5%8A%A1%E5%99%A8%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86)
    - [9.1.1 统一返回格式](#911-%E7%BB%9F%E4%B8%80%E8%BF%94%E5%9B%9E%E6%A0%BC%E5%BC%8F)
    - [9.1.2 自定义异常类](#912-%E8%87%AA%E5%AE%9A%E4%B9%89%E5%BC%82%E5%B8%B8%E7%B1%BB)
    - [9.1.3 全局异常捕获](#913-%E5%85%A8%E5%B1%80%E5%BC%82%E5%B8%B8%E6%8D%95%E8%8E%B7)
  - [9.2 登录](#92-%E7%99%BB%E5%BD%95)
  - [9.3 注册](#93-%E6%B3%A8%E5%86%8C)
  - [9.4 修改个人信息](#94-%E4%BF%AE%E6%94%B9%E4%B8%AA%E4%BA%BA%E4%BF%A1%E6%81%AF)
- [十、JWT实现Token登录拦截](#%E5%8D%81jwt%E5%AE%9E%E7%8E%B0token%E7%99%BB%E5%BD%95%E6%8B%A6%E6%88%AA)
  - [10.1 springboot后端](#101-springboot%E5%90%8E%E7%AB%AF)
    - [10.1.1 依赖导入 pom.xml](#1011-%E4%BE%9D%E8%B5%96%E5%AF%BC%E5%85%A5-pomxml)
    - [10.1.2 TokenUtils工具类](#1012-tokenutils%E5%B7%A5%E5%85%B7%E7%B1%BB)
    - [10.1.3 TokenInterdeptor 拦截器](#1013-tokeninterdeptor-%E6%8B%A6%E6%88%AA%E5%99%A8)
    - [10.1.4 将拦截器注入springboot](#1014-%E5%B0%86%E6%8B%A6%E6%88%AA%E5%99%A8%E6%B3%A8%E5%85%A5springboot)
  - [10.2 前端vue](#102-%E5%89%8D%E7%AB%AFvue)
    - [10.2.1 修改工具包request.js](#1021-%E4%BF%AE%E6%94%B9%E5%B7%A5%E5%85%B7%E5%8C%85requestjs)
- [十一、文件上传](#%E5%8D%81%E4%B8%80%E6%96%87%E4%BB%B6%E4%B8%8A%E4%BC%A0)
  - [11.1 数据库（files表）](#111-%E6%95%B0%E6%8D%AE%E5%BA%93files%E8%A1%A8)
  - [11.2 文件管理后端spring_boot](#112-%E6%96%87%E4%BB%B6%E7%AE%A1%E7%90%86%E5%90%8E%E7%AB%AFspring_boot)
    - [11.2.1 Dao层](#1121-dao%E5%B1%82)
    - [11.2.2 Service层](#1122-service%E5%B1%82)
    - [11.2.3 Controller层](#1123-controller%E5%B1%82)
  - [11.3 文件管理前端Vue](#113-%E6%96%87%E4%BB%B6%E7%AE%A1%E7%90%86%E5%89%8D%E7%AB%AFvue)
  - [11.4 个人头像修改(header组件头像不会同步变)](#114-%E4%B8%AA%E4%BA%BA%E5%A4%B4%E5%83%8F%E4%BF%AE%E6%94%B9header%E7%BB%84%E4%BB%B6%E5%A4%B4%E5%83%8F%E4%B8%8D%E4%BC%9A%E5%90%8C%E6%AD%A5%E5%8F%98)
  - [11.4 头像修改(header组件头像同步变)](#114-%E5%A4%B4%E5%83%8F%E4%BF%AE%E6%94%B9header%E7%BB%84%E4%BB%B6%E5%A4%B4%E5%83%8F%E5%90%8C%E6%AD%A5%E5%8F%98)
- [附录1、使用Swagger3](#%E9%99%84%E5%BD%951%E4%BD%BF%E7%94%A8swagger3)
  - [1 导入依赖](#1-%E5%AF%BC%E5%85%A5%E4%BE%9D%E8%B5%96)
  - [2 配置](#2-%E9%85%8D%E7%BD%AE)
  - [3 使用](#3-%E4%BD%BF%E7%94%A8)
- [附录2、常见bug](#%E9%99%84%E5%BD%952%E5%B8%B8%E8%A7%81bug)
  - [错误: 找不到或无法加载主类 com.example.demo.DemoApplication](#%E9%94%99%E8%AF%AF-%E6%89%BE%E4%B8%8D%E5%88%B0%E6%88%96%E6%97%A0%E6%B3%95%E5%8A%A0%E8%BD%BD%E4%B8%BB%E7%B1%BB-comexampledemodemoapplication)
  - [Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.](#failed-to-configure-a-datasource-url-attribute-is-not-specified-and-no-embedded-datasource-could-be-configured)
  - [Invalid bound statement (not found): com.example.demo.mapper.UserMapper.findAll](#invalid-bound-statement-not-found-comexampledemomapperusermapperfindall)
  - [跨域问题](#%E8%B7%A8%E5%9F%9F%E9%97%AE%E9%A2%98)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

> 1. 下载好IDEA开发工具（IntelliJ IDEA）；
> 2. Mysql数据库（Navicat for MySQL）；

# 一、创建Vue项目
## 1.1 安装Node.js和Vue
> 参考blog：[https://blog.csdn.net/dd2016124/article/details/127540862](https://blog.csdn.net/dd2016124/article/details/127540862)
> **Node.js 官网下载地址** [Download | Node.js](https://nodejs.org/en/download/)
> **安装Vue：**命令行 - npm install -g @vue/cli
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683115980527-a01fd22f-b8d1-4903-9f83-abcf3ef078c1.png#averageHue=%23171514&clientId=u13d0c50a-48a7-4&from=paste&height=60&id=ua9e79d8f&originHeight=75&originWidth=434&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=7015&status=done&style=none&taskId=u0840f62c-9ef4-4344-866c-eb373d07540&title=&width=347.2)
> 卸载vuecli 的命令sudo npm uninstall vue-cli -g

## 1.2 创建Vue项目
> 1. **创建vue：**vue create test_vue
> 
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116030132-69d91d9c-4af4-4aee-893c-0a785688a53d.png#averageHue=%231d1a18&clientId=u13d0c50a-48a7-4&from=paste&height=40&id=uea365e5b&originHeight=50&originWidth=506&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=6369&status=done&style=none&taskId=u6ac98580-45c4-496f-b9bb-bb6acf9ae90&title=&width=404.8)
> 2. 选择配置
> 
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116101977-92875707-f365-4180-9aac-16cd41451d4f.png#averageHue=%23201817&clientId=u13d0c50a-48a7-4&from=paste&height=112&id=uca839b6f&originHeight=140&originWidth=466&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=11991&status=done&style=none&taskId=ua2af4aeb-fb11-4b40-a871-e3f128e6284&title=&width=372.8)
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116238237-a9f2a51d-b058-4f8d-b317-667970444336.png#averageHue=%23181615&clientId=u13d0c50a-48a7-4&from=paste&height=224&id=u26b5f692&originHeight=280&originWidth=900&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=31033&status=done&style=none&taskId=u8340907c-7a0e-4e14-a336-e7853bbb43d&title=&width=720)
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116265681-eb676fe5-66cd-4bdd-9b1d-8583b013563b.png#averageHue=%23282625&clientId=u13d0c50a-48a7-4&from=paste&height=122&id=u52279af7&originHeight=153&originWidth=751&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=16189&status=done&style=none&taskId=u62544226-13da-499b-9dc2-33bbecffda3&title=&width=600.8)
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116282000-f358ae66-32e4-481a-a8e0-c5aa3bb0ca39.png#averageHue=%231f1c1b&clientId=u13d0c50a-48a7-4&from=paste&height=110&id=uaf5b0968&originHeight=137&originWidth=1130&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=22384&status=done&style=none&taskId=u8b44df65-a9d5-4fd2-abb7-69edeffbea2&title=&width=904)
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116311619-6d4535d0-be81-4f22-8add-5c2928715619.png#averageHue=%231c1816&clientId=u13d0c50a-48a7-4&from=paste&height=145&id=ub4b6e96d&originHeight=181&originWidth=1050&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=31339&status=done&style=none&taskId=u40c93e40-be8c-466b-a2d4-537c9324c24&title=&width=840)
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116328406-6c39fb0e-726d-4651-975f-e4350ba4a01e.png#averageHue=%231a1715&clientId=u13d0c50a-48a7-4&from=paste&height=131&id=u8bb2c604&originHeight=164&originWidth=1051&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=31683&status=done&style=none&taskId=ufc3a81d5-10fd-4714-904c-34fdebfcead&title=&width=840.8)
> 3. 创建完成
> 
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116526994-faa6683d-0fed-44ed-b499-98499925daa2.png#averageHue=%2312100f&clientId=u13d0c50a-48a7-4&from=paste&height=345&id=udf21c1da&originHeight=431&originWidth=608&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=37232&status=done&style=none&taskId=u3340ba06-ece2-4b04-8769-aebc1915945&title=&width=486.4)

## 1.3 运行Vue项目
> 在项目文件夹下使用：**npm run serve** 命令运行项目；
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116645411-b5ea1bed-2b47-4426-840c-cd285f078670.png#averageHue=%231a1919&clientId=u13d0c50a-48a7-4&from=paste&height=163&id=u9af999de&originHeight=204&originWidth=517&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=16272&status=done&style=none&taskId=uca5ee92b-815c-4a3e-82c6-52c9ee9f8c8&title=&width=413.6)
> ![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683116678139-55f11a46-bc66-4f7d-9670-4bc16cf5c2fd.png#averageHue=%23fefefe&clientId=u13d0c50a-48a7-4&from=paste&height=774&id=u65f39e26&originHeight=968&originWidth=1901&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=84812&status=done&style=none&taskId=uc746a352-3ab4-4932-8568-4dfa6bf63e0&title=&width=1520.8)

## 1.4 安装 element-ui 
> 在项目文件夹下使用：**npm i element-ui -S**

```java
// 在 main.js 中引入
Vue.config.productionTip = false;
Vue.use(ElementUI,{size:"mini"});//使用ElementUI
```

# 二、创建springboot项目
## 2.1 新建
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682928356240-a1a29984-fb4b-4fbd-b7f7-6c3dc97ed652.png#averageHue=%233c4042&clientId=u55fc8a1e-d5a3-4&from=paste&height=681&id=u61227d98&originHeight=851&originWidth=1269&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=59239&status=done&style=none&taskId=u48bcc52a-1b83-4665-a0a0-764b8e70375&title=&width=1015.2)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682928437948-ca0f26a1-cbd4-4d61-b158-b5d1036b937b.png#averageHue=%233d4143&clientId=u55fc8a1e-d5a3-4&from=paste&height=681&id=u5ec7da0f&originHeight=851&originWidth=1269&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=36805&status=done&style=none&taskId=u9fcc904e-0581-4508-93d4-c6aeb1a226c&title=&width=1015.2)
## 2.2 选择需要的依赖包
> 注意：这些选择和在 pom.xml中通过代码添加效果是一样的！

![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682928456029-7ea28d78-3f14-490c-aaa8-92e273e93460.png#averageHue=%233c4044&clientId=u55fc8a1e-d5a3-4&from=paste&height=681&id=ua7aa2810&originHeight=851&originWidth=1269&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=54007&status=done&style=none&taskId=u805a1894-1c7f-4d39-a3bc-0d7189b1dd5&title=&width=1015.2)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682928468688-29514e25-e1c3-4a2c-aebb-bfd55d466569.png#averageHue=%233d4145&clientId=u55fc8a1e-d5a3-4&from=paste&height=681&id=u9eef449a&originHeight=851&originWidth=1269&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=76411&status=done&style=none&taskId=ubd837bb7-20e0-4c02-8f8f-d1c4a3f7bc3&title=&width=1015.2)
> 注意：这里**选择低版本的springboot**，当我创建3.0以上的时候出现 “错误: 找不到或无法加载主类 com.example.demo.DemoApplication”

![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682928620859-1cfa0137-e963-41ba-9000-220ee2c6b7c7.png#averageHue=%233c4043&clientId=u55fc8a1e-d5a3-4&from=paste&height=681&id=uc9160800&originHeight=851&originWidth=1269&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=81322&status=done&style=none&taskId=u9b7541fc-7032-4e7b-adbc-ad012f11dce&title=&width=1015.2)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682928648890-3111009e-4d36-4005-9280-318ef26e03db.png#averageHue=%233c4042&clientId=u55fc8a1e-d5a3-4&from=paste&height=681&id=u61ca062a&originHeight=851&originWidth=1269&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=22507&status=done&style=none&taskId=u1970f9e3-cacc-41d4-9621-cd852d07a77&title=&width=1015.2)
## 2.3 创建完成
### 2.3.1 配置阿里云镜像仓库
```cpp
<!--配置阿里云仓库-->
<repositories>
    <repository>
        <id>aliyun</id>
        <url>https://maven.aliyun.com/repository/public</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </repository>
</repositories>
<pluginRepositories>
    <pluginRepository>
        <id>aliyun-plugin</id>
        <url>https://maven.aliyun.com/repository/public</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </pluginRepository>
</pluginRepositories>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1682929341462-96774a17-da74-4fcb-a58f-a2c62baff841.png#averageHue=%23c1a561&clientId=u55fc8a1e-d5a3-4&from=paste&height=824&id=u9a5db8bb&originHeight=1030&originWidth=1920&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=158135&status=done&style=none&taskId=u3cbd963c-c12f-4b4f-b58b-e8a60892c65&title=&width=1536)
### 2.3.2 配置数据库和端口号
```cpp
//application.properties文件
#配置数据库
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/springboot_vue?serverTimezone=GMT%2b8
spring.datasource.username=root
spring.datasource.password=123456
#配置端口
server.port=9090
```
将application.properties文件重命名为application.yml
```cpp
#配置数据库
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/springboot_vue?serverTimezone=GMT%2b8
    username: root
    password: 123456

#配置端口
server:
  port: 9090
```


## 2.4 启动测试
> 在 resources -> templates 下创建一个 index.html 文件，然后启动项目，在浏览器访问[localhost:9090/](http://localhost:9090/)


# 三、数据库 MyBatis
## 3.1 创建数据库和表
> 数据库：springboot_vue
> 数据表：user(id,username,password,nickname,email,phone,address,create_time)

![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683007524450-ecde5e31-9399-43e6-92c4-304335d2461e.png#averageHue=%23f5f4f3&clientId=u99cb1fa1-7266-4&from=paste&height=268&id=u082989a3&originHeight=335&originWidth=823&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=26472&status=done&style=none&taskId=u67e97dcb-ab47-4054-99ee-0d0973e7294&title=&width=658.4)
## 3.2 使用MyBatis
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683009639316-c15b8f94-b72b-4ff5-b4c5-8613dd2568c4.png#averageHue=%23606e3d&clientId=u99cb1fa1-7266-4&from=paste&height=466&id=u8aa675cd&originHeight=582&originWidth=1344&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=118045&status=done&style=none&taskId=u13bb6873-5f1c-4c80-988f-b0331270912&title=&width=1075.2)
创建实体类：
```java
// entity -> User.java
package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data//使用@Data可以省略get和set方法
@NoArgsConstructor//创建无参构造方法
@AllArgsConstructor//创建有参构造方法
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
}

```
创建dao层的数据库操作：（sql语句可以通过注解，也可以通过编写对应的.xml文件进行操作，二者选其一）
```java
//mapper -> UserMapper.java
package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper//将bean注入springboot
public interface UserMapper {
    @Select("SELECT * from user")
    List<User> findAll();
}
```
创建控制层Controller：
```java
// controller -> UserController.java
package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
*  @RestController是@Controller和@ResponseBody的结合体
 * @Controller类中的方法可以直接通过返回String跳转到jsp、ftl、html等模版页面
 * @ResponseBody注解，也可以返回实体对象
*/
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/")
    public List<User> index(){
        return userMapper.findAll();
    }
}
```
## 3.3 测试 
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683010007269-80b01fc2-4668-4b8f-94b8-e716175e566a.png#averageHue=%23f9f3e0&clientId=u99cb1fa1-7266-4&from=paste&height=101&id=u9f36c666&originHeight=126&originWidth=1044&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=8295&status=done&style=none&taskId=u261e354a-00a2-4696-bf0c-43f9fcf69f3&title=&width=835.2)

# 四、模板：MyBatis 增删改查（User）
## 4.1 基本结构与配置yml
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683017412024-de9fe225-d777-41a5-b963-5557a9a07e21.png#averageHue=%23796e47&clientId=u99cb1fa1-7266-4&from=paste&height=670&id=ufd693233&originHeight=837&originWidth=1570&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=172070&status=done&style=none&taskId=ue73f6a85-0efc-4494-9ab0-a4babefb9f8&title=&width=1256)
配置.yml文件
```yaml
# 1.配置数据库
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/springboot_vue?serverTimezone=GMT%2b8
    username: root
    password: 123456

# 2.配置端口
server:
  port: 9090

# 3.配置 mybatis(不然springboot找不到mybatis对应的.xml文件)
mybatis:
  #  mapper-locations: com.example.demo.dao.*.xml
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.example.demo.entity
  configuration:
  	log-impl: org.apache.ibatis.logging.stdout.StdOutImpl #打印出sql执行的结果
```
## 4.2 实体类（entity）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683017736298-9d016e79-49e1-4104-980c-63364d5c6d01.png#averageHue=%23283742&clientId=u99cb1fa1-7266-4&from=paste&height=46&id=eo11Q&originHeight=58&originWidth=302&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=2341&status=done&style=none&taskId=udf86b63f-f15f-4a11-85d7-edc86347177&title=&width=241.6)
```java
package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//使用@Data可以省略get和set方法
@NoArgsConstructor//创建无参构造方法
@AllArgsConstructor//创建有参构造方法
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
}
```
## 4.3 DAO层（mapper）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683017654951-4d24f11e-10da-4adb-a9d4-e6bfd0d2b858.png#averageHue=%233e4245&clientId=u99cb1fa1-7266-4&from=paste&height=46&id=Rm20W&originHeight=58&originWidth=230&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=2404&status=done&style=none&taskId=u448efb1d-0c99-478e-b22b-c5b6887b64a&title=&width=184)![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683017662217-879788a5-a0f4-4f5d-8e99-623d6ee5971b.png#averageHue=%233d4144&clientId=u99cb1fa1-7266-4&from=paste&height=70&id=TmIAD&originHeight=88&originWidth=331&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=4050&status=done&style=none&taskId=u1cd7e2c5-fdfe-47d9-8ce0-63dd92e4eee&title=&width=264.8)
UserMapper.java
```java
package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
/* UserMapper.java 与 UserMapper.xml相对应，接口声明，在xml中具体实现；
    为了让springboot项目能够找到对应的xml文件，需要在.yml配置文件中进行相应的配置；
    还需要在xml文件中添加<mapper namespace="com.example.demo.mapper.UserMapper">找到接口文件
* */

@Mapper//将bean注入springboot
public interface UserMapper {
    List<User> findAll();//查询所有用户列表
    int insert(User user);//新增用户
    int update(User user);//更新用户
    int delete(@Param("id") Integer id);//删除用户
}
```
UserMapper.xml
```java
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.example.demo.mapper.UserMapper">

    <!--获取用户列表-->
    <select id="findAll" resultType="User">
		SELECT * from user
	</select>

    <!-- 增加用户 -->
    <insert id="insert" parameterType="User">
        insert into user(username,password,nickname,email,phone,address)
        values(#{username},#{password},#{nickname},#{email},#{phone},#{address})
	</insert>

    <!--更新用户信息-->
    <update id="update">
        update user
        <set>
            <if test="username != null">
                username = #{username},
            </if>
            <if test="nickname != null">
                nickname = #{nickname},
            </if>
            <if test="email != null">
                email = #{email},
            </if>
            <if test="phone != null">
                phone = #{phone},
            </if>
            <if test="address != null">
                address = #{address}
            </if>
        </set>
        <where>
            id = #{id}
        </where>
    </update>

    <!--删除用户-->
    <delete id="delete" parameterType="Integer">
        delete from user where id = #{id}
    </delete>

</mapper>
```
## 4.4 服务层（Service）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683017633331-dd658e57-237b-42bc-95f0-3b950fda9036.png#averageHue=%233d4244&clientId=u99cb1fa1-7266-4&from=paste&height=47&id=TF1gU&originHeight=59&originWidth=290&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=2316&status=done&style=none&taskId=ufd4a332e-2314-4a63-9a30-0f93014872e&title=&width=232)
```java
package com.example.demo.service;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //查询所有用户
    public List<User> findAll(){
        return userMapper.findAll();
    }
    //新增和更新用户信息
    public boolean save(User user){
        if(user.getId() == null){//如果user没有id 那么就新增
            return userMapper.insert(user);
        }else{//否则更新
            return userMapper.update(user);
        }
    }
    //删除用户
    public boolean deleteById(Integer id) {
        return userMapper.delete(id);
    }
}
```
## 4.5 控制层（Controller）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683017600267-96e5ef0f-c2e7-4ae9-ba5f-870500a404b0.png#averageHue=%232b3944&clientId=u99cb1fa1-7266-4&from=paste&height=52&id=u7b5725b6&originHeight=65&originWidth=292&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=2869&status=done&style=none&taskId=ucd864d8f-7e40-47d6-8c88-92f890b22ce&title=&width=233.6)
```java
package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //查询User所有的记录
    @GetMapping("")
    public List<User> index(){
        return userService.findAll();
    }

    //User插入和更新
    @PostMapping("")
    public boolean sava(@RequestBody User user){
        return userService.save(user);
    }

    //User删除
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return userService.deleteById(id);
    }
}

```
## 4.6 结合Vue实现分页功能
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683083911991-22981fd2-18b7-4950-b60a-33927505519e.png#averageHue=%23fcfafa&clientId=u13d0c50a-48a7-4&from=paste&height=573&id=u217d99e6&originHeight=716&originWidth=1914&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=62404&status=done&style=none&taskId=u5e500dff-aaf8-45b2-81d3-5e438b2d365&title=&width=1531.2)
**springboot后端实现：**
```java
// 【控制层：UserController.java】
//分页查询
@GetMapping("/page")
public Map<String,Object> findByPage(@RequestParam Integer pageIndex,@RequestParam Integer pageSize){
    List<User> users = userService.findByPage((pageIndex-1)*pageSize,pageSize);
    Integer total = userService.totalNum();
    Map<String,Object> res = new HashMap<>();
    res.put("data",users);
    res.put("total",total);
    return res;
}

// 【服务层：UserService.java】
//分页查找
public List<User> findByPage(Integer pageIndex,Integer pageSize) {
    return userMapper.findByPage(pageIndex,pageSize);
}

//【DAO层：UserMapper.java 和 UserMapper.xml】
public interface UserMapper {
    List<User> findByPage(@Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize);//分页查找
    int totalNum();//查询记录总数
}

<!--分页查找-->
<select id="findByPage" resultType="User">
    SELECT * from user limit #{pageIndex},#{pageSize}
</select>

<!--查询记录总数-->
<select id="totalNum" resultType="Integer">
    SELECT count(*) from user
</select>
```
**vue前端实现：**
```java
<template>
  <el-container style="min-height:100vh; border: 1px solid #eee">

    <!--左侧导航-->
    <el-aside :width="sideWidth+'px'" style="background-color: rgb(238, 241, 246);height: 100%;">
      <el-menu :default-openeds="['1', '3']" style="min-height: 100vh; overflow-x: hidden;"
               background-color="rgb(48, 65, 86)"
               text-color="#fff"
               active-text-color="#ffd04b"
               :collapse-transition="false"
               :collapse="isCollapse"
      >
        <div style="height: 60px;line-height: 60px;text-align: center;">
          <img src="../assets/logo.png" alt="" style="width: 20px;position: relative;top:5px;margin-right: 5px"/>
          <b style="color: #fff" v-show="logoTextShow">后台管理系统</b>
        </div>
        <el-submenu index="1">
          <template slot="title"><i class="el-icon-message"></i>
            <span slot="title">导航一</span>
          </template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="1-1">选项1</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group title="分组2">
            <el-menu-item index="1-3">选项3</el-menu-item>
          </el-menu-item-group>
          <el-submenu index="1-4">
            <template slot="title">选项4</template>
            <el-menu-item index="1-4-1">选项4-1</el-menu-item>
          </el-submenu>
        </el-submenu>
        <el-submenu index="2">
          <template slot="title"><i class="el-icon-menu"></i>
            <span slot="title">导航二</span>
          </template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="2-1">选项1</el-menu-item>
            <el-menu-item index="2-2">选项2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="3">
          <template slot="title"><i class="el-icon-setting"></i>
            <span slot="title">导航三</span>
          </template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="3-1">选项1</el-menu-item>
            <el-menu-item index="3-2">选项2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
      </el-menu>
    </el-aside>

    <!--右边主体内容-->
    <el-container>
      <el-header style="font-size: 12px ; border-bottom: 1px solid #ccc; line-height: 60px;display: flex;">
        <div style="flex: 1;font-size: 20px;">
          <span :class="collapseBtnClass" style="margin-right: 15px" @click="collapse"></span>
        </div>
        <el-dropdown style="width: 70px;cursor: pointer;">
          <span>王小虎</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>个人信息</el-dropdown-item>
            <el-dropdown-item>退出</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>

      </el-header>

      <el-main>
        <!--Breadcrumb 页屑-->
        <div style="margin-bottom: 30px">
          <el-breadcrumb separator="/">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item><a href="/">用户管理</a></el-breadcrumb-item>
          </el-breadcrumb>
        </div>

        <!--搜索框-->
        <div style="padding: 10px 0;">
          <el-input style="width: 200px;" placeholder="请输入名称" suffix-icon="el-icon-search" v-model="username" ></el-input>
          <!--<el-input style="width: 200px;" placeholder="请输入邮箱" suffix-icon="el-icon-message" class="ml-5"></el-input>-->
          <!--<el-input style="width: 200px;" placeholder="请输入地址" suffix-icon="el-icon-position"  class="ml-5"></el-input>-->
          <el-button class="ml-5" type="primary">搜索</el-button>
        </div>
        <!--新增-->
        <div style="margin: 10px 0">
          <el-button type="primary">新增 <i class="el-icon-circle-plus-outline"></i></el-button>
          <el-button type="danger">批量删除 <i class="el-icon-remove-outline"></i></el-button>
          <el-button type="primary">导入 <i class="el-icon-download"></i></el-button>
          <el-button type="primary">导出 <i class="el-icon-upload2"></i></el-button>
        </div>

        <el-table :data="tableData" border stripe header-cell-class-name="tableHeaderBg">
          <el-table-column prop="id" label="编号" width="60"></el-table-column>
          <el-table-column prop="username" label="用户名" width="120"></el-table-column>
          <el-table-column prop="nickname" label="昵称"></el-table-column>
          <el-table-column prop="email" label="邮箱"></el-table-column>
          <el-table-column prop="phone" label="电话"></el-table-column>
          <el-table-column prop="address" label="地址"></el-table-column>
          <el-table-column prop="op" label="操作">
            <template>
              <el-button type="success">编辑 <i class="el-icon-edit-outline"></i></el-button>
              <el-button type="danger">删除 <i class="el-icon-delete"></i></el-button>
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
      </el-main>
    </el-container>


  </el-container>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
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
          total: 100,
          pageIndex: 1,
          pageSize: 5,
          collapseBtnClass:'el-icon-s-fold',
          isCollapse:false,
          sideWidth:200,
          logoTextShow:true,

          username: "111",
      }
  },
  created(){
      this.loadPage();//分页加载数据
  },
  methods:{
      collapse(){//【点击收缩展开按钮函数】
          this.isCollapse = !this.isCollapse;
          if(this.isCollapse){//收缩
              this.sideWidth = 64;
              this.collapseBtnClass = 'el-icon-s-unfold';
              this.logoTextShow = false;
          } else{//展开
              this.sideWidth = 200;
              this.collapseBtnClass = 'el-icon-s-fold';
              this.logoTextShow = true;
          }
      },
      loadPage(){
          //使用原始的请求后端数据方法
          fetch("http://localhost:9090/user/page?pageIndex="+this.pageIndex+"&pageSize="+this.pageSize).then(res => res.json()).then(res => {
              console.log(res);
              this.tableData = res.data;
              this.total = res.total
          });
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
      }
  }
}
</script>

<style>
  .tableHeaderBg{
    background: #eee!important;
  }
</style>
```

# 五、模板Mybatis-Puls 增删改查（User）
[MyBatis-Plus](https://www.baomidou.com/)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683114628123-5815aa52-ce7a-4b6b-8c36-c49b57911d0a.png#averageHue=%23fcf9f9&clientId=u13d0c50a-48a7-4&from=paste&height=561&id=ueb82db3b&originHeight=701&originWidth=1912&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=75535&status=done&style=none&taskId=u9ee9361d-bb22-4280-9b52-b915da86f2d&title=&width=1529.6)
## 5.1 安装使用
```java
//在pom.xml中引入依赖
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.5.1</version>
</dependency>
```
## 5.2 配置MybatisPuls
MybatisPulsConfig.java
```java
//MybatisPulsConfig.java
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@MapperScan("com.example.demo.mapper")//扫描后原来mapper文件里的@Mapper就可以不用了
public class MybatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 向MyBatis-Plus的过滤器链中添加分页拦截器，需要设置数据库类型（主要用于分页方言）
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
```
application.yml
```yaml
# 1.配置数据库
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/springboot_vue?serverTimezone=GMT%2b8
    username: root
    password: 123456


# 2.配置端口
server:
  port: 9090


# 3.配置 mybatis(不然springboot找不到mybatis对应的.xml文件)
mybatis:
  mapper-locations: classpath:mapper/*.xml

# 4. 配置 mybatis-plus
mybatis-plus:
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.example.demo.entity
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl #打印出sql执行的结果

```
## 5.3 DAO层（mapper）
UserMapper.java
```java
package com.example.demo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
public interface UserMapper extends BaseMapper<User> {
}
```
## 5.4 服务层（Service）
UserService.java
```java
package com.example.demo.service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper,User> {
    //mybatis-plus 查询所有用户
    public List<User> findAllUser(){
        return list();
    }

    //mybatis-plus 新增或者更新用户
    public boolean saveOrUpdateUser(User user){
        return saveOrUpdate(user);
    }

    //mybatis-plus 删除用户
    public boolean deleteById(Integer id) {
        return removeById(id);
    }

    //mybatis-plus 分页查找
    public IPage<User> findByPage(Integer pageIndex,Integer pageSize,String username,String address) {
        IPage<User> page = new Page<>(pageIndex,pageSize);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if(!"".equals(username)) queryWrapper.like("username",username);//用于模糊查询
        if(!"".equals(address)) queryWrapper.like("address",address);
        return page(page,queryWrapper);
    }

    // mybatis-plus 批量删除
    public boolean batchDelete(List<Integer> ids){
        return removeBatchByIds(ids);
    }
}
```
## 5.5 控制层（controller）
UserController.java
```java
package com.example.demo.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //mybatis-plus 查询User所有的记录
    @GetMapping("")
    public List<User> index(){
        return userService.findAllUser();
    }

    //mybatis-plus  分页查询
    @GetMapping("/page")
    public IPage<User> findByPage(@RequestParam Integer pageIndex,
                                  @RequestParam Integer pageSize,
                                  @RequestParam(defaultValue = "") String username,
                                  @RequestParam(defaultValue = "") String address){
        return userService.findByPage(pageIndex,pageSize,username,address);
    }

    //mybatis-plus  User插入和更新
    @PostMapping("")
    public boolean savaOrUpdateUser(@RequestBody User user){
        return userService.saveOrUpdateUser(user);
    }

    //mybatis-plus  User删除
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return userService.deleteById(id);
    }

    //mybatis-plus  User批量删除
    @PostMapping("/del/batch")
    public boolean batchDelete(@RequestBody List<Integer> ids){
        return userService.batchDelete(ids);
    }
}
```
## 5.6 结合Vue（axios）实现增删改查
### 5.6.1 安装axios
> **安装axios：**npm i axios -S

### 5.6.2 创建一个 request.js工具包
> 在src下创建一个utils文件夹，然后再创建一个 request.js

```java
import axios from 'axios'

//1.创建
const request = axios.create({
    /*   注意！！ 这里是全局统一加上了 '/api' 前缀，也就是说所有接口都会加上'/api'前缀在，
        页面里面写接口的时候就不要加 '/api'了，
        否则会出现2个'/api'，类似 '/api/api/user'这样的报错，切记！！！
    */
    baseURL: 'http://localhost:9090',
    timeout: 5000
})

//2.设置请求
// request 拦截器
// 可以自请求发送前对请求做一些处理，比如统一加token，对请求参数统一加密
request.interceptors.request.use(config => {
    config.headers['Content-Type'] = 'application/json;charset=utf-8';

    // config.headers['token'] = user.token;  // 设置请求头
    return config
}, error => {
    return Promise.reject(error)
});

//3. 处理响应结果
// response 拦截器
// 可以在接口响应后统一处理结果
request.interceptors.response.use(
    response => {
        let res = response.data;
        // 如果是返回的文件
        if (response.config.responseType === 'blob') {
            return res
        }
        // 兼容服务端返回的字符串数据
        if (typeof res === 'string') {
            res = res ? JSON.parse(res) : res
        }
        return res;
    },
    error => {
        console.log('err' + error) // for debug
        return Promise.reject(error)
    }
)

export default request
```
### 5.6.3 配置 main.js
```java
import request from "./utils/request";

Vue.config.productionTip = false;
Vue.use(ElementUI,{size:"mini"});//使用ElementUI
Vue.prototype.request = request;//vue main 注册request，使用./utils/request
```
### 5.6.4  Home.vue页面（5.7进行分解）
```java
<template>
  <el-container style="min-height:100vh; border: 1px solid #eee">

    <!--左侧导航-->
    <el-aside :width="sideWidth+'px'" style="background-color: rgb(238, 241, 246);height: 100%;">
      <el-menu :default-openeds="['1', '3']" style="min-height: 100vh; overflow-x: hidden;"
               background-color="rgb(48, 65, 86)"
               text-color="#fff"
               active-text-color="#ffd04b"
               :collapse-transition="false"
               :collapse="isCollapse"
      >
        <div style="height: 60px;line-height: 60px;text-align: center;">
          <img src="../assets/logo.png" alt="" style="width: 20px;position: relative;top:5px;margin-right: 5px"/>
          <b style="color: #fff" v-show="logoTextShow">后台管理系统</b>
        </div>
        <el-submenu index="1">
          <template slot="title"><i class="el-icon-message"></i>
            <span slot="title">导航一</span>
          </template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="1-1">选项1</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group title="分组2">
            <el-menu-item index="1-3">选项3</el-menu-item>
          </el-menu-item-group>
          <el-submenu index="1-4">
            <template slot="title">选项4</template>
            <el-menu-item index="1-4-1">选项4-1</el-menu-item>
          </el-submenu>
        </el-submenu>
        <el-submenu index="2">
          <template slot="title"><i class="el-icon-menu"></i>
            <span slot="title">导航二</span>
          </template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="2-1">选项1</el-menu-item>
            <el-menu-item index="2-2">选项2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
        <el-submenu index="3">
          <template slot="title"><i class="el-icon-setting"></i>
            <span slot="title">导航三</span>
          </template>
          <el-menu-item-group>
            <template slot="title">分组一</template>
            <el-menu-item index="3-1">选项1</el-menu-item>
            <el-menu-item index="3-2">选项2</el-menu-item>
          </el-menu-item-group>
        </el-submenu>
      </el-menu>
    </el-aside>

    <!--右边主体内容-->
    <el-container>
      <el-header style="font-size: 12px ; border-bottom: 1px solid #ccc; line-height: 60px;display: flex;">
        <div style="flex: 1;font-size: 20px;">
          <span :class="collapseBtnClass" style="margin-right: 15px" @click="collapse"></span>
        </div>
        <el-dropdown style="width: 70px;cursor: pointer;">
          <span>王小虎</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>个人信息</el-dropdown-item>
            <el-dropdown-item>退出</el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>

      </el-header>

      <el-main>
        <!--Breadcrumb 页屑-->
        <div style="margin-bottom: 30px">
          <el-breadcrumb separator="/">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item><a href="/">用户管理</a></el-breadcrumb-item>
          </el-breadcrumb>
        </div>

        <!--搜索框-->
        <div style="padding: 10px 0;">
          <el-input style="width: 200px;" placeholder="请输入名称" suffix-icon="el-icon-search" v-model="username" ></el-input>
          <!--<el-input style="width: 200px;" placeholder="请输入邮箱" suffix-icon="el-icon-message" class="ml-5"></el-input>-->
          <!--<el-input style="width: 200px;" placeholder="请输入地址" suffix-icon="el-icon-position"  class="ml-5"></el-input>-->
          <el-button class="ml-5" type="primary" @click="loadPage">搜索</el-button>
          <el-button  type="warning" @click="reset">重置</el-button>
        </div>
        <!--新增-->
        <div style="margin: 10px 0">
          <el-button type="primary" @click="handleAdd">新增 <i class="el-icon-circle-plus-outline"></i></el-button>
          <el-popconfirm class="ml-5" confirm-button-text='确定' cancel-button-text='我再想想' icon="el-icon-info" icon-color="red" title="确定删除吗？" @confirm="handleBatchDelete">
            <el-button type="danger" slot="reference">批量删除 <i class="el-icon-remove-outline"></i></el-button>
          </el-popconfirm>
            <el-button type="primary" class="ml-5">导入 <i class="el-icon-download"></i></el-button>
          <el-button type="primary">导出 <i class="el-icon-upload2"></i></el-button>
        </div>

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


        <!--弹窗-->
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


      </el-main>
    </el-container>


  </el-container>
</template>



<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
export default {
  name: 'HomeView',
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
          collapseBtnClass:'el-icon-s-fold',
          isCollapse:false,//导航栏是否打开
          sideWidth:200,
          logoTextShow:true,//logo文本是否显示
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
      collapse(){//【点击收缩展开按钮函数】
          this.isCollapse = !this.isCollapse;
          if(this.isCollapse){//收缩
              this.sideWidth = 64;
              this.collapseBtnClass = 'el-icon-s-unfold';
              this.logoTextShow = false;
          } else{//展开
              this.sideWidth = 200;
              this.collapseBtnClass = 'el-icon-s-fold';
              this.logoTextShow = true;
          }
      },
      loadPage(){
          // //1. 使用原始的请求后端数据方法
          // fetch("http://localhost:9090/user/page?pageIndex="+this.pageIndex+"&pageSize="+this.pageSize).then(res => res.json()).then(res => {
          //     console.log(res);
          //     this.tableData = res.data;
          //     this.total = res.total
          // });

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
      }
  }
}
</script>

<style>
  .tableHeaderBg{
    background: #eee!important;
  }
</style>

```
### 5.6.5 效果展示
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683115349448-00c99061-278d-46b4-b0e7-efb94586b1c5.png#averageHue=%23e6c48e&clientId=u13d0c50a-48a7-4&from=paste&height=581&id=ub9edc9e2&originHeight=726&originWidth=1891&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=75450&status=done&style=none&taskId=u3a54bb66-d1c5-4561-84b7-9959fc7052b&title=&width=1512.8)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683115360790-7e9d86e6-9599-4ab5-ad98-00b47c0db840.png#averageHue=%23a5a4a4&clientId=u13d0c50a-48a7-4&from=paste&height=573&id=u8a4bc836&originHeight=716&originWidth=1894&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=72734&status=done&style=none&taskId=u0fe70a94-1c61-403f-b804-eaa5e761a19&title=&width=1515.2)

## 5.7 对vue页面进行分解
### 5.7.1 路由配置 router/index.js
```java
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
    ]
  },
  {
    path: '/Login',
    name: 'Login',
    component: () => import('../views/Login.vue'),
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

// // 设置路由守卫
// router.beforeEach((to,from,next) => {
//   localStorage.setItem("currentPathName",to.name);
//   store.commit("setPath");//触发store的数据更新
//   next();//放行路由
// });

export default router
```
### 5.7.2 主界面 SysManage.vue
```vue
<template>
  <el-container style="min-height:100vh; border: 1px solid #eee">
    <!--左侧导航-->
    <el-aside :width="sideWidth+'px'" style="background-color: rgb(238, 241, 246);height: 100%;">
      <Aside :isCollapse="isCollapse" :logoTextShow="logoTextShow"/>
    </el-aside>

    <!--右边主体内容-->
    <el-container>
      <el-header style="border-bottom: 1px solid #ccc; ">
        <Header :collapseBtnClass="collapseBtnClass" :isCollapse="isCollapse"/>
      </el-header>

      <!-- 表示当前页面的子路由会在 router-view 里面展示  -->
      <el-main>
        <router-view/>
      </el-main>

    </el-container>

  </el-container>
</template>


<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
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
        }
    }
}
</script>
```
### 5.7.3 左侧导航栏 Aside.vue
```vue
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
            <el-menu-item index="/user">用户管理</el-menu-item>
            <el-menu-item index="/food">商品管理</el-menu-item>
            <el-menu-item index="/order">订单管理</el-menu-item>
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
```
### 5.7.4 头部 Header.vue
```vue
<template>
    <div style="font-size: 12px ; line-height: 60px;display: flex;">
        <div style="flex: 1;">
            <span :class="collapseBtnClass" style="margin-right: 15px; font-size: 18px;" @click="collapse"></span>
            <!--Breadcrumb 页屑-->
            <el-breadcrumb separator="/" style="display: inline-block;">
                <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
                <el-breadcrumb-item>用户管理</el-breadcrumb-item>
            </el-breadcrumb>
        </div>
        <el-dropdown style="width: 100px;cursor: pointer;">
            <div style="display: inline-block;">
                <!--头像-->
                <img :src="" style="width: 30px; border-radius: 50%;position: relative; top:10px; right: 5px;"/>
                <span>战胜</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
            </div>
            <el-dropdown-menu slot="dropdown" style="width: 100px; text-align: center">
                <el-dropdown-item>个人信息</el-dropdown-item>
                <el-dropdown-item>
                    <router-link to="/login" style="text-decoration: none">退出</router-link>
                </el-dropdown-item>
            </el-dropdown-menu>
        </el-dropdown>
    </div>
</template>

<script>
    export default {
        name: "Header",
        props: {
            collapseBtnClass: String,
            isCollapse: Boolean,
        },
        computed: {
            currentPathName(){
                return this.$store.state.currentPathName;//需要监听的数据
            }
        },
        methods:{
        }
    }
</script>

<style scoped>

</style>
```
### 5.7.3 用户管理界面User.vue
```vue
<template>
    <div>
        <!--搜索框-->
        <div style="padding: 10px 0;">
            <el-input style="width: 200px;" placeholder="请输入名称" suffix-icon="el-icon-search" v-model="username" ></el-input>
            <!--<el-input style="width: 200px;" placeholder="请输入邮箱" suffix-icon="el-icon-message" class="ml-5"></el-input>-->
            <!--<el-input style="width: 200px;" placeholder="请输入地址" suffix-icon="el-icon-position"  class="ml-5"></el-input>-->
            <el-button class="ml-5" type="primary" @click="loadPage">搜索</el-button>
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

        <!--弹窗-->
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
```


# 六、Mybatis-plus代码生成器
> 注意：在运行生成器之前，请把项目代码进行备份一下，因为运行生成器代码后，原来的文件将会被覆盖掉！

## 6.1 导入依赖
```java
<!--Mybatis-plus代码生成器-->
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-generator</artifactId>
    <version>3.5.1</version>
</dependency>
<dependency>
    <groupId>org.apache.velocity</groupId>
    <artifactId>velocity</artifactId>
    <version>1.7</version>
</dependency>
```
## 6.2 编写生成器工具
```java
package com.example.demo.utils;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import java.util.Collections;

/**
 * mybatis-plus代码生成器
 */
public class CodeGenerator {
    public static void main(String[] args) {
        generate();
    }
    private static void generate(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/springboot_vue?serverTimezone=GMT%2b8", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("战胜") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:/项目文件/springboot-vue/demo1/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.demo") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:/项目文件/springboot-vue/demo1/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();
                    builder.mapperBuilder().enableMapperAnnotation();//添加@Mapper注解
                    builder.controllerBuilder().enableHyphenStyle()//开启驼峰转字符
                            .enableRestStyle();//开启生成@RestController控制器
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("sys_", "c_"); // 设置过滤表前缀
                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
```
## 6.3 自定义生成模板
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683166495457-1282c56d-4bb8-462e-9997-351879e0dc76.png#averageHue=%234a483f&clientId=ua1656178-973a-4&from=paste&height=457&id=u5d963ee2&originHeight=764&originWidth=651&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=68143&status=done&style=none&taskId=u4191f736-32b3-4bde-b09d-315c38706cf&title=&width=389.79998779296875)
自定义controller.java模板
```java
package ${package.Controller};

//添加自己模板中需要的头文件
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import $!{package.Service}.$!{table.serviceName};
import ${package.Entity}.${entity};

#if(${restControllerStyle})
import org.springframework.web.bind.annotation.RestController;
#else
import org.springframework.stereotype.Controller;
#end
#if(${superControllerClassPackage})
import ${superControllerClassPackage};
#end
/**
 * <p>
 * $!{table.comment} 前端控制器
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
#if(${restControllerStyle})
@RestController
#else
@Controller
#end
@RequestMapping("#if(${package.ModuleName})/${package.ModuleName}#end/#if(${controllerMappingHyphenStyle})${controllerMappingHyphen}#else${table.entityPath}#end")
#if(${kotlin})
class ${table.controllerName}#if(${superControllerClass}) : ${superControllerClass}()#end

#else
#if(${superControllerClass})
public class ${table.controllerName} extends ${superControllerClass} {
#else
public class ${table.controllerName} {
#end

    //添加控制层类的逻辑代码函数
    @Resource
    private ${table.serviceName} ${table.entityPath}Service;

    //查询User所有的记录
    @GetMapping("")
    public List<${entity}> findAll(){
        return ${table.entityPath}Service.list();
    }

    //插入和更新
    @PostMapping("")
    public boolean saveOrUpdate(@RequestBody ${entity} ${table.entityPath}){
        return ${table.entityPath}Service.saveOrUpdate(${table.entityPath});
    }

    //删除
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return ${table.entityPath}Service.removeById(id);
    }

    //根据id查询
    @GetMapping("/{id}")
    public ${entity} findById(@PathVariable Integer id){
        return ${table.entityPath}Service.getById(id);
    }

    //分页查询
    @GetMapping("/page")
    public Page<${entity}> findByPage(@RequestParam Integer pageIndex,@RequestParam Integer pageSize){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //queryWrapper.orderByDesc("id");
        return ${table.entityPath}Service.page(new Page(pageIndex,pageSize),queryWrapper);
    }

    // 批量删除
    @PostMapping("/del/batch")
    public boolean batchDelete(@RequestBody List<Integer> ids){
        return ${table.entityPath}Service.removeByIds(ids);
    }
}
#end
```

## 6.3 运行查看结果
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683165902447-f3c73afd-456b-4367-8dca-e9dbf07e65c5.png#averageHue=%233e4348&clientId=ua1656178-973a-4&from=paste&height=616&id=u8df4efc5&originHeight=770&originWidth=430&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=40491&status=done&style=none&taskId=uc77e1225-cb46-4bab-b211-b78f40cc5c0&title=&width=344)![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683166071720-c200b848-cf09-4dda-87f7-0bd9120a6a76.png#averageHue=%233b4044&clientId=ua1656178-973a-4&from=paste&height=617&id=ud4738391&originHeight=820&originWidth=423&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=45543&status=done&style=none&taskId=u97a590a8-5cf9-43d0-828d-50170e91fa3&title=&width=318.3999938964844)
实体类：User.java
```java
package com.example.demo.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
/**
 * @author 战胜
 * @since 2023-05-04
 */
@Getter
@Setter
  @ApiModel(value = "User对象", description = "")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String phone;
    private String address;
    private LocalDateTime createTime;
}
```
Dao层：UserMapper.java
```java
package com.example.demo.mapper;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
/**
 * @author 战胜
 * @since 2023-05-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
```
Dao层：UserMapper.xml
```java
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.example.demo.mapper.UserMapper">
</mapper>
```
Service层接口类：IUserService.java
```java
package com.example.demo.service;
import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * <p>
 *  服务类
 * </p>
 * @author 战胜
 * @since 2023-05-04
 */
public interface IUserService extends IService<User> {
}
```
Service层实现类：UserServiceImpl.java
```java
package com.example.demo.service.impl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
/**
 * <p>
 *  服务实现类
 * </p>
 * @author 战胜
 * @since 2023-05-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
```
控制层：UserController.java
```java
package com.example.demo.controller;
//添加自己模板中需要的头文件
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;
import com.example.demo.service.IUserService;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.RestController;
/**
 * <p>
 *  前端控制器
 * </p>
 * @author 战胜
 * @since 2023-05-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //添加控制层类的逻辑代码函数
    @Resource
    private IUserService userService;

    //查询User所有的记录
    @GetMapping("")
    public List<User> findAll(){
        return userService.list();
    }

    //插入和更新
    @PostMapping("")
    public boolean saveOrUpdate(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

    //删除
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
    }

    //根据id查询
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.getById(id);
    }

    //分页查询
    @GetMapping("/page")
    public Page<User> findByPage(@RequestParam Integer pageIndex,@RequestParam Integer pageSize){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //queryWrapper.orderByDesc("id");
        return userService.page(new Page(pageIndex,pageSize),queryWrapper);
    }

    // 批量删除
    @PostMapping("/del/batch")
    public boolean batchDelete(@RequestBody List<Integer> ids){
        return userService.removeByIds(ids);
    }
}
```
# 七、实现头部面包屑
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683186392225-3a7a6c39-f87b-4c0d-b391-bba10f600203.png#averageHue=%23fcf8f8&clientId=ua1656178-973a-4&from=paste&height=482&id=uf5ec3304&originHeight=602&originWidth=1879&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=68358&status=done&style=none&taskId=uf449ee99-87a6-4927-8208-8b70ab79c99&title=&width=1503.2)
## 7.1 安装 vuex
> 使用：npm -i vuex -S 进行安装
> 查看所有版本：npm view vuex versions --json
> 安装指定版本：npm install vuex@3.6.2 （报错unable to resolve dependency tree后使用该命令）

## 7.2 创建 src/store/index.js
```java
import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)
const store = new Vuex.Store({
    state: {
      currentPathName: ""
    },
    mutations: {
      setPath(state){
          state.currentPathName = localStorage.getItem("currentPathName");
      }
    }
});
export default store
```
## 7.3 引入 vuex
在 main.js 中引入：
```java
import store from "@/store" //引入

...

new Vue({
  router,
  store,//引入store
  render: h => h(App)
}).$mount('#app');
```
在router/index.js 中引入：
```java
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
    ]
  },
  {
    path: '/Login',
    name: 'Login',
    component: () => import('../views/Login.vue'),
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

```
## 7.4 vue界面展示
```vue
<!--Breadcrumb 页屑-->
<el-breadcrumb separator="/" style="display: inline-block;">
  <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
  <el-breadcrumb-item>{{currentPathName}}</el-breadcrumb-item>
</el-breadcrumb>

export default {
  ...
  computed: {
    currentPathName(){
      return this.$store.state.currentPathName;//需要监听的数据
    }
  },
  ...
}
```
# 八、实现Excel的导入导出
## 8.1 服务器端
```java
    //【实现表格导出excel功能】
    @GetMapping("/export")
    public void export(HttpServletResponse response) throws Exception{
        //1.从数据库查询出所有的数据
        List<User> list = userService.list();

        //通过工具类创建 writer 写出到磁盘的路径
//        ExcelWriter writer = ExcelUtil.getWriter(filesUploadPath + "/用户信息.xlsx");

        //2. 在内存操作，写到浏览器
        ExcelWriter writer = ExcelUtil.getWriter(true);
//        writer.addHeaderAlias("username","用户名");  //自定义标题别名
//        writer.addHeaderAlias("password","密码");
//        writer.addHeaderAlias("nickname","昵称");
//        writer.addHeaderAlias("email","邮箱");
//        writer.addHeaderAlias("phone","电话");
//        writer.addHeaderAlias("address","地址");
//        writer.addHeaderAlias("createTime","创建时间");

        //一次性写出 list 内的对象到 excel ，使用默认样式，强制输出标题
        writer.write(list,true);


        //3. 设置浏览器相应的格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        String fileName = URLEncoder.encode("用户信息","UTF-8");
        response.setHeader("Content-Disposition","attachment;filename="+fileName+".xlsx");

        //4.写回
        ServletOutputStream out = response.getOutputStream();
        writer.flush(out,true);
        out.close();
        writer.close();
    }

    //【实现导入excel】
    @PostMapping("/import")
    public void impInfo(MultipartFile multipartFile) throws  Exception{
        InputStream inputStream = multipartFile.getInputStream();
        ExcelReader reader = ExcelUtil.getReader(inputStream);
        List<User> list = reader.readAll(User.class);
        System.out.println(list);
        userService.saveBatch(list);
    }
```
## 8.2 前端vue
```vue
<!-- 实现Excel的导入  -->
<el-upload name="multipartFile" action="http://localhost:9090/user/import"
  :on-success="handleExcelImportSuccess" :limit="1" :show-file-list="false"
  accept="xlsx" style="display: inline-block">
  <el-button type="primary" class="ml-5">导入 <i class="el-icon-download"></i></el-button>
</el-upload>
<!-- 实现Excel的导出 -->
<el-button type="primary" @click="expfun" class="ml-5">导出 <i class="el-icon-upload2"></i></el-button>

export default {
  methods:{
    handleExcelImportSuccess(){//导入Excel文件
        this.$message.success("文件导入成功！");
        this.loadPage();
    }
  },
}
```
# 九、自定义异常处理（登录与注册）
## 9.1 自定义服务器异常处理
### 9.1.1 统一返回格式
```vue
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;
    public static Result result(Integer code, String msg, Object data){
        return new Result(code,msg,data);
    }
}
```
### 9.1.2 自定义异常类
```vue
package com.example.demo.common;
import lombok.Getter;
/**
 * @author 战胜
 * ServiceException是我们自定义的一种异常
 */
@Getter
public class ServiceException extends RuntimeException{
    private Integer code;
    /**
     * 自定义错误类型
     * @param code 自定义的错误码
     * @param msg 自定义的错误提示
     */
    public ServiceException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}
```
### 9.1.3 全局异常捕获
```vue
@ControllerAdvice
public class ServiceExceptionHandler {
    /**
     * 如果抛出的的是ServiceException，则调用该方法
     * @param se 业务异常
     * @return Result
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result handle(ServiceException se){
        return Result.result(se.getCode(),se.getMessage(),null);
    }
}
```

## 9.2 登录
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683360426822-68feb83c-dc15-4425-aa58-e308b933fde6.png#averageHue=%238256c7&clientId=ue9ad46a9-fd80-4&from=paste&height=316&id=CQdTQ&originHeight=767&originWidth=1085&originalType=binary&ratio=1.5625&rotation=0&showTitle=false&size=192124&status=done&style=none&taskId=uf203c5e6-f6c7-45a8-9b69-85ef88abd6f&title=&width=447.3999938964844)
服务器端：
```java
//UserDTO.java
@Data
@ToString
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
}


//UserController.java
//【用户登录】
// @PostMapping("/login")
// public boolean login(@RequestBody UserDTO userDTO){
//     String username = userDTO.getUsername();
//     String password = userDTO.getPassword();
//     System.out.println(userDTO);
//     if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
//         return false;
//     }
//     return userService.login(userDTO);
// }
@PostMapping("/login")
public Result login(@RequestBody UserDTO userDTO){
    String username = userDTO.getUsername();
    String password = userDTO.getPassword();
    System.out.println(userDTO);
    if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
        return Result.result(400,"参数错误",null);
    }
    return Result.result(200,"登录成功",userService.login(userDTO));
}

//UserServiceImpl.java
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    private static final Log LOG = Log.get();

    @Override
    public UserDTO login(UserDTO userDTO) {
        User one = getUseInfo(userDTO,1);
        if(one != null){
            BeanUtil.copyProperties(one,userDTO,true);
            return userDTO;
        }else{
            throw new ServiceException(400,"用户名或密码错误");
        }
    }
}
//获取用户信息
private User getUseInfo(UserDTO userDTO, Integer type){
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("username",userDTO.getUsername());
    if(type==1) queryWrapper.eq("password",userDTO.getPassword());
    User one;
    try{
        one = getOne(queryWrapper);
    }catch (Exception e){
        LOG.error(e);
        throw new ServiceException(500,"系统错误");
    }
    return one;
}
```
前端 Login.vue
```vue
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
```
Header.vue：显示登录后的用户名和头像
```vue
<div style="display: inline-block;">
    <!--头像-->
    <img :src="user.avatar" style="width: 30px; border-radius: 50%;position: relative; top:10px; right: 5px;"/>
    <span>{{user.nickname}}</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
</div>

data(){
  return {
      user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
  }
},
methods:{
  logout(){//退出登录：
      this.$router.push("/login");
      localStorage.removeItem("user");
      this.$message.success("退出成功");
  }
}
```
## 9.3 注册
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683383065453-124942f3-7ddb-438a-a7a1-398b00f0d20e.png#averageHue=%23f0ecc5&clientId=ue9ad46a9-fd80-4&from=paste&height=362&id=uc83210ba&originHeight=453&originWidth=485&originalType=binary&ratio=1.5625&rotation=0&showTitle=false&size=38541&status=done&style=none&taskId=u13d1eabb-cb0e-411a-86ab-a505d915ec5&title=&width=388)
服务器端代码：
```java
//UserController.java
//【用户注册】
@PostMapping("/register")
public Result register(@RequestBody UserDTO userDTO){
    String username = userDTO.getUsername();
    String password = userDTO.getPassword();
    System.out.println(userDTO);
    if(StrUtil.isBlank(username) || StrUtil.isBlank(password)){
        return Result.result(400,"参数错误",null);
    }
    return Result.result(200,"注册成功",userService.register(userDTO));
}

// UserServiceImpl.java
@Override
public UserDTO register(UserDTO userDTO) {
    User one = getUseInfo(userDTO,0);
    if(one == null){
        one = new User();
        BeanUtil.copyProperties(userDTO,one,true);
        one.setNickname("游客");
        save(one);//存入数据库
        return userDTO;
    }else{
        throw new ServiceException(400,"用户已存在");
    }
}
//获取用户信息
private User getUseInfo(UserDTO userDTO, Integer type){
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    queryWrapper.eq("username",userDTO.getUsername());
    if(type==1) queryWrapper.eq("password",userDTO.getPassword());
    User one;
    try{
        one = getOne(queryWrapper);
    }catch (Exception e){
        LOG.error(e);
        throw new ServiceException(500,"系统错误");
    }
    return one;
}
```
前端 Register.vue
```vue
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
```
## 9.4 修改个人信息
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683382943559-20952cd6-eac0-4043-86a0-73059bdb51bd.png#averageHue=%23fefefe&clientId=ue9ad46a9-fd80-4&from=paste&height=318&id=ua1039c7a&originHeight=397&originWidth=488&originalType=binary&ratio=1.5625&rotation=0&showTitle=false&size=9054&status=done&style=none&taskId=ub8d75c2f-19d0-462e-97a8-1c7cd0f2a06&title=&width=390.4)
前端Header.vue
```vue
<el-dropdown-item >
  <router-link style="text-decoration: none" to="/personInfo">个人信息</router-link>
</el-dropdown-item>
```
PersonInfo.vue
```vue
<template>
    <el-card style="width: 500px; padding: 20px">
        <el-form label-width="100px" size="small">
            <el-form-item label="用户名"><el-input v-model="form.username" autocomplete="off" disabled=""></el-input></el-form-item>
            <el-form-item label="昵称"><el-input v-model="form.nickname" autocomplete="off"></el-input></el-form-item>
            <el-form-item label="邮箱"><el-input v-model="form.email" autocomplete="off"></el-input></el-form-item>
            <el-form-item label="电话"><el-input v-model="form.phone" autocomplete="off"></el-input></el-form-item>
            <el-form-item label="地址"><el-input v-model="form.address" autocomplete="off"></el-input></el-form-item>
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
            this.request.get("http://localhost:9090/user/"+this.user.id).then(res => {
                console.log("个人信息",res);
                this.form = res;
            });
        },
        methods: {
            savaUser(){//新增用户
                this.request.post("/user",this.form).then(res => {
                    if(res){
                        this.$message.success("保存成功！");
                    }
                    else this.$message.error("保存失败！");
                });
            },
        }
    }
</script>
```
# 十、JWT实现Token登录拦截
## 10.1 springboot后端
### 10.1.1 依赖导入 pom.xml
```vue
 <!-- JWT依赖 -->
<dependency>
    <groupId>com.auth0</groupId>
    <artifactId>java-jwt</artifactId>
    <version>3.4.0</version>
</dependency>
```
### 10.1.2 TokenUtils工具类
**Utils/TokenUtils.java**
```java
package com.example.demo.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@Component
public class TokenUtils {
    private static IUserService staticUserService;
    @Resource
    private IUserService userService;
    @PostConstruct
    public void setUserService(){
        staticUserService = userService;
    }

    //获取Token
    public static String genToken(String userId, String sign){
        return JWT.create().withAudience(userId)//将userId保存到toekn中，作为载荷
                    .withExpiresAt(DateUtil.offsetHour(new Date(),2))//2小时后token过期
                    .sign(Algorithm.HMAC256(sign));//以password 作为token 的密钥
    }
	//获取当前用户
    public static User getCurrentUser(){
        try{
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String token = request.getHeader("token");
            if(!StrUtil.isBlank(token)){
                String userId = JWT.decode(token).getAudience().get(0);
                return staticUserService.getById(userId);
            }
        }catch (Exception e){
            return null;
        }
        return null;
    }
}
```
### 10.1.3 TokenInterdeptor 拦截器
**config/interceptor/TokenInterceptor.java**
```java
package com.example.demo.config.interceptor;

import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.example.demo.common.ServiceException;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private IUserService userService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        /** 地址过滤 */
        String uri = request.getRequestURI() ;
        if (uri.contains("/login")) return true;
        //如果不是映射到方法 直接通过
        if(!(handler instanceof HandlerMethod)) return true;

        //执行验证
        String token = request.getHeader("token");
        if(StrUtil.isBlank(token)){
            throw new ServiceException(401,"token不能为空,请重新登录");
        }
        //获取 token 中的 userId
        String userId;
        try{
            userId = JWT.decode(token).getAudience().get(0);
            System.out.println("Token - userId：" + userId);
        }catch (JWTDecodeException e){
            throw new ServiceException(401,"token 验证失败,请重新登录");
        }
        User user = userService.getById(userId);
        if(user == null) throw new ServiceException(401,"用户不存在，请重新登陆");
        //用户密码加签验证 token
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
        try{
            jwtVerifier.verify(token);
        }catch (JWTVerificationException e){
            throw new ServiceException(401,"token 验证失败,请重新登录");
        }
        return true;
    }
}
```
### 10.1.4 将拦截器注入springboot
**config/InterceptorConfig.java**
```java
package com.example.demo.config;
import com.example.demo.config.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import javax.annotation.Resource;

@Configuration
public class IntercaptorConfig implements WebMvcConfigurer {
    @Resource
    private TokenInterceptor tokenInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor)
                //拦截的路径
                .addPathPatterns("/**")
                //排除登录接口
                .excludePathPatterns("/user/login","/user/register");
    }
}
```
## 10.2 前端vue
### 10.2.1 修改工具包request.js
```java
import axios from 'axios'
import ElementUI from 'element-ui'//【新增】

//1.创建
const request = axios.create({
    /*   注意！！ 这里是全局统一加上了 '/api' 前缀，也就是说所有接口都会加上'/api'前缀在，
        页面里面写接口的时候就不要加 '/api'了，
        否则会出现2个'/api'，类似 '/api/api/user'这样的报错，切记！！！
    */
    baseURL: 'http://localhost:9090',
    timeout: 5000
})

//2.设置请求
// request 拦截器
// 可以自请求发送前对请求做一些处理，比如统一加token，对请求参数统一加密
request.interceptors.request.use(config => {
    config.headers['Content-Type'] = 'application/json;charset=utf-8';

////////////////////////【新增】/////////////////////////////////////////
    let user = localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {};
    if(user) config.headers['token'] = user.token;  // 设置请求头
/////////////////////////////////////////////////////////////////

    return config
}, error => {
    return Promise.reject(error)
});

//3. 处理响应结果
// response 拦截器
// 可以在接口响应后统一处理结果
request.interceptors.response.use(
    response => {
        let res = response.data;
        // 如果是返回的文件
        if (response.config.responseType === 'blob') {
            return res
        }
        // 兼容服务端返回的字符串数据
        if (typeof res === 'string') {
            res = res ? JSON.parse(res) : res
        }
    //////////////////////【新增】///////////////////////////////////////
        //当权限返回code=401时，表示权限验证失败
        if(res.code == 401){
            ElementUI.Message({
                message: res.msg,
                type: 'error'
            });
            window.location.replace("/login");
        }
    /////////////////////////////////////////////////////////////////
        return res;
    },
    error => {
        console.log('err' + error) // for debug
        return Promise.reject(error)
    }
)
export default request
```
# 十一、文件上传
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1685016170875-323f1aea-1526-4eb1-b2bf-d12205112c7f.png#averageHue=%23fbf8f7&clientId=u61fe0031-d6fe-4&from=paste&height=673&id=uc749ccec&originHeight=841&originWidth=1894&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=102391&status=done&style=none&taskId=u70ede456-a2d7-43f8-9d22-08222b3365b&title=&width=1515.2)

## 11.1 数据库（files表）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1685016314089-55892690-e365-47a6-a4f9-8ce59856ee6c.png#averageHue=%23faf9f8&clientId=u61fe0031-d6fe-4&from=paste&height=222&id=u634f0c32&originHeight=237&originWidth=793&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=12567&status=done&style=none&taskId=ud1149e7a-6796-4e69-b3bf-50ede30a735&title=&width=741.4000244140625)
## 11.2 文件管理后端spring_boot
### 11.2.1 Dao层
**entity/files.java**
```java
package com.example.demo.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
  @ApiModel(value = "File对象", description = "")
public class Files implements Serializable {
    private static final long serialVersionUID = 1L;
      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;
    private String filename;
    private String type;
    private Long size;
    private String url;
      @ApiModelProperty("文件的标识，避免出现重复的图片")
      private String md5;
    private Boolean isDelete;
    private Boolean enable;
}
```
**mapper/FileMapper.java**
```java
package com.example.demo.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Files;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface FileMapper extends BaseMapper<Files> {
}
```
### 11.2.2 Service层
**service/IFileService.java**
```java
package com.example.demo.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Files;
import java.util.List;
public interface IFileService extends IService<Files> {
    Files getFilesByMd5(String md5);
    boolean batchDelete(List<Integer> ids);
}
```
**service/impl/FileServiceImpl.java**
```java
package com.example.demo.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.Files;
import com.example.demo.mapper.FileMapper;
import com.example.demo.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, Files> implements IFileService {
    @Resource
    FileMapper fileMapper;

    @Override
    public Files getFilesByMd5(String md5) {
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("md5",md5);
        List<Files> filesList = fileMapper.selectList(queryWrapper);
        return filesList.size() == 0 ? null : filesList.get(0);
    }

    @Override
    public boolean batchDelete(List<Integer> ids) {
        //select * from files where id in (id1,id2...)
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id",ids);
        queryWrapper.eq("is_delete",false);
        List<Files> files = fileMapper.selectList(queryWrapper);
        for(Files file: files) file.setIsDelete(true);
        return updateBatchById(files);
    }
}
```
### 11.2.3 Controller层
**controller/FileController.java**
```java
package com.example.demo.controller;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Result;
import com.example.demo.entity.Files;
import com.example.demo.service.IFileService;
import com.example.demo.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    //通过注解将.yml中的配置信息加载到变量中
    @Value("${files.upload.path}")
    private String fileUploadPath;

    @Resource
    private IFileService fileService;

    //【上传文件】
    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile multipartFile) throws IOException {
        System.out.println("*************************");
        String originalFilename = multipartFile.getOriginalFilename();
        System.out.println("前端上传的文件：" + originalFilename);
        String type = FileUtil.extName(originalFilename);
        long size = multipartFile.getSize();

        //先存储到磁盘
        File uploadFileDir = new File(fileUploadPath);
        if(!uploadFileDir.exists()){
            uploadFileDir.mkdirs();
        }

        String newFilename = IdUtil.fastSimpleUUID() + StrUtil.DOT + type;
        File uploadFile = new File(fileUploadPath + newFilename );

        //md5 : 先上传，在获取上传文件的md5（如果md5存在，则将刚上传的文件进行删除）
        multipartFile.transferTo(uploadFile);
        String md5 = SecureUtil.md5(uploadFile);
        Files filesbymd5 = fileService.getFilesByMd5(md5);

        String res_url;
        if(filesbymd5 != null){
            uploadFile.delete();
            res_url = filesbymd5.getUrl();
        }else{
            res_url = "http://localhost:9090/file/download/" + newFilename;
        }

        //存储到数据库
        Files savaFile = new Files();
        savaFile.setFilename(originalFilename);
        savaFile.setType(type);
        savaFile.setSize(size/1024);//文件大小kb
        savaFile.setUrl(res_url);
        savaFile.setMd5(md5);
        fileService.save(savaFile);
        return res_url;
    }

    //【下载文件】
    @GetMapping("/download/{fileName}")
    public void downLoad(@PathVariable String fileName, HttpServletResponse response) throws IOException {
        //1.根据文件的名获取文件
        System.out.println("----下载文件--- "+fileUploadPath + fileName);
        File downLoadFile = new File(fileUploadPath + fileName);

        //2. 设置输出格式
        response.setContentType("application/octet-stream");
        response.addHeader("Content-Disposition","attachment;filename="+URLEncoder.encode(fileName,"UTF-8"));

        //3.写回
        ServletOutputStream out = response.getOutputStream();
        out.write(FileUtil.readBytes(downLoadFile));
        out.flush();
        out.close();
    }

    //查询File所有的记录
    @GetMapping("")
    public List<Files> findAll(){
        return fileService.list();
    }

    //插入和更新
    @PostMapping("/update")
    public Result UpdateFile(@RequestBody Files files){
        return Result.result(200,"修改成功",fileService.updateById(files));
    }

    //删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        Files files = fileService.getById(id);
        files.setIsDelete(true);
        return Result.result(200,"删除成功",fileService.updateById(files));
    }

    //根据id查询
    @GetMapping("/{id}")
    public Files findById(@PathVariable Integer id){
        return fileService.getById(id);
    }

    //分页查询
    @GetMapping("/page")
    public Page<Files> findByPage(@RequestParam Integer pageIndex,@RequestParam Integer pageSize,@RequestParam String filename){
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("filename",filename);
        queryWrapper.eq("is_delete",false);
        queryWrapper.orderByDesc("id");
        TokenUtils.getCurrentUser();
        return fileService.page(new Page(pageIndex,pageSize),queryWrapper);
    }

    // 批量删除
    @PostMapping("/del/batch")
    public boolean batchDelete(@RequestBody List<Integer> ids){
        return fileService.batchDelete(ids);
    }
}
```

## 11.3 文件管理前端Vue
**File.vue**
```vue
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
```

## 11.4 个人头像修改(header组件头像不会同步变)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1685017109162-17d9b318-28ec-4fbb-adef-2eb28ab0e874.png#averageHue=%23fbfaf9&clientId=u61fe0031-d6fe-4&from=paste&height=373&id=u9abe3a4b&originHeight=631&originWidth=686&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=96897&status=done&style=none&taskId=ua803d194-9bd8-4f14-8c6f-7c5fe8af0d0&title=&width=405.8000183105469)
**PersonInfo.Vue**
```vue
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
```
## 11.4 头像修改(header组件头像同步变)
![touxiang.gif](https://cdn.nlark.com/yuque/0/2023/gif/32569815/1685020005928-af3c5ddb-6074-4c68-ab26-083c66187480.gif#averageHue=%23fcfcfc&clientId=u61fe0031-d6fe-4&from=drop&id=u11c38d99&originHeight=824&originWidth=1583&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=934471&status=done&style=none&taskId=ubf3568d4-bb5e-49ba-a1c3-ede06a05275&title=)
**解决思路：PersonInfo.vue（子组件）-> SysManage.vue（父组件）-> Header.Vue（子组件）**
**（ '->' 表示触发 ）**
```vue
'【PersonInfo.vue子组件】'
methods: {
    savaUser(){//修改用户信息
        this.request.post("/user",this.form).then(res => {
            if(res.code == 200){
                this.$message.success("保存成功！");
                this.getUser().then(res => {
                    res.token = JSON.parse(localStorage.getItem("user")).token;
                    localStorage.setItem("user",JSON.stringify(res));//将当前用户信息重新存储
                });
/////////////////////////////////////////////////////////////////////
                //【触发父级更新User的方法 refreshUser()】
                this.$emit("refreshUser");
///////////////////////////////////////////////////////////////////////
            }
            else this.$message.error("保存失败！");
        });
    },
}
```
```vue
'【SysManage.vue父组件】'
  
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

methods: {
    //通过PersonInfo子组件 触发 父组件中的@asideCollapse="collapse"
    getUser(){
        this.request.get("http://localhost:9090/user/"+this.user.id).then(res => {
            this.user = res.data;
        })
    }
}
```
```vue
'【Header.vue子组件】'
data(){
    return {
        // user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
    }
},
props: {
    collapseBtnClass: String,
    user: Object,
},
```

---

# 附录1、使用Swagger3
## 1 导入依赖
```java
<!--Swagger3-->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```
## 2 配置
Swagger3Config.java
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.Contact;

@Configuration
@EnableWebMvc
@EnableOpenApi
public class Swagger3Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)  // DocumentationType.SWAGGER_2 固定的，代表swagger2
                .apiInfo(apiInfo()) // 用于生成API信息
                .select() // select()函数返回一个ApiSelectorBuilder实例,用来控制接口被swagger做成文档
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")) // 用于指定扫描哪个包下的接口
                .paths(PathSelectors.any())// 选择所有的API,如果你想只为部分API生成文档，可以配置这里
                .build();
    }

    /**
     * 用于定义API主界面的信息，比如可以声明所有的API的总标题、描述、版本
     */
    //生成接口信息，包括标题、联系人，联系方式等
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger3接口文档")
                .description("如有疑问，请联系开发工程师")
                .contact(new Contact("数科", "https://localhost/", "localhost@qq.com"))
                .version("1.0")
                .build();
    }
}
```

## 3 使用
访问链接：[http://localhost:9090/swagger-ui/index.html#/](http://localhost:9090/swagger-ui/index.html#/)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683098460616-1991d827-3166-436b-96a5-edfd93d4cc83.png#averageHue=%23faf8f7&clientId=u13d0c50a-48a7-4&from=paste&height=665&id=uafbd5da0&originHeight=831&originWidth=1932&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=63912&status=done&style=none&taskId=u98d31aba-3cc3-4980-b8f2-c0f83885935&title=&width=1545.6)


---

# 附录2、常见bug
## 错误: 找不到或无法加载主类 com.example.demo.DemoApplication
> 解决方案：在创建springboot项目时，选择低版本的springboot。如果还出现错误可参考


## Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
> 解决方案：在application.properties（或.yml）配置文件中添加数据库的配置信息；


## Invalid bound statement (not found): com.example.demo.mapper.UserMapper.findAll
```yaml
解决方案：在.yml配置文件中配置mybatis

# 3.配置 mybatis(不然springboot找不到mybatis对应的.xml文件)
mybatis:
  #  mapper-locations: com.example.demo.dao.*.xml
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.example.demo.entity
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl #打印出sql执行的结果
```

## 跨域问题
![image.png](https://cdn.nlark.com/yuque/0/2023/png/32569815/1683082929067-7c61f24c-27f5-4a04-a278-bc3976ae218e.png#averageHue=%23feebe9&clientId=u13d0c50a-48a7-4&from=paste&height=85&id=u8f02cc0d&originHeight=106&originWidth=1907&originalType=binary&ratio=1.25&rotation=0&showTitle=false&size=24307&status=done&style=none&taskId=uc6fb850d-6585-446f-8dcf-4f33766f880&title=&width=1525.6)
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    // 当前跨域请求最大有效时长。这里默认1天
    private static final long MAX_AGE = 24 * 60 * 60;
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 1 设置访问源地址
        corsConfiguration.addAllowedHeader("*"); // 2 设置访问源请求头
        corsConfiguration.addAllowedMethod("*"); // 3 设置访问源请求方法
        corsConfiguration.setMaxAge(MAX_AGE);
        source.registerCorsConfiguration("/**", corsConfiguration); // 4 对接口配置跨域设置
        return new CorsFilter(source);
    }
}
```
