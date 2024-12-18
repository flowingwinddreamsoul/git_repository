新建项目目录 /user-registration-center-vue

打开终端使用vue-cli脚手架创建项目   vue create user-center-frontend-vue

选择顺序：

1. Manually select features  -  手动选择功能
2. 使用空格选择需要的组件 Babel(涉及兼容性的库)   TypeScript(语法校验)   Route(路由控制)   Linter /  Fromatter(ESLint的校验)
3. 选择VUE版本3.x
4. 是否使用类组件的语法 no
5. 是否使用独立的typescript的文件yes
6. 是否使用路由的历史模式，可以去除url中的# yes
7. 选择ESlint +  prettier 严格模式
8. 什么时候做语法校验  选择save保存时
9. 是否选择Bable保存为单独的文件
10. 是否将以上选择保存为预设



使用VScode打开项目

设置项目启动的端口：在package.json中scripts的serve中添加 --port 8081   

在vue.config.js中添加    lintOnSave: false,  关闭eslink的严格检验

移动到serve可启动项目



蚂蚁金服的组件库使用[组件总览 - Ant Design Vue](https://www.antdv.com/components/overview-cn/)  终端执行指令：yarn add ant-design-vue@4.x

合并整理后的main.ts文件

```
import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import Antd from "ant-design-vue";
import "ant-design-vue/dist/reset.css";

createApp(App).use(Antd).use(router).mount("#app");
```

在src目录下创建layouts文件夹，在layouts文件夹下创建BasicLayout.vue

在app.vue中引入这个BasicLayout.vue基本的页面样式

安装axios指令：     npm install axios    需要重启项目

数据库的user表执行语句

```mysql
create table user
                  (
                      id           bigint auto_increment comment '主键Id',
                      userName     varchar(256)                       null comment '姓名',
                      userAccount  varchar(256)                       null comment '账号',
                      avatarUrl    varchar(1024)                      null comment '用户头像',
                      gender       tinyint                            null comment '性别',
                      userPassword varchar(512)                       not null comment '密码',
                      phone        varchar(256)                       null comment '电话',
                      email        varchar(512)                       null comment '邮箱',
                      userStatus   int                                null comment '用户状态',
                      createTime   datetime default CURRENT_TIMESTAMP null comment '创建时间',
                      updateTime   datetime default CURRENT_TIMESTAMP not null comment '更新时间',
                      isDelete     tinyint  default 0                 null comment '是否删除',
                      constraint user_pk
                          primary key (id)
                  )
```



