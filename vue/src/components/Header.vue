<template>
  <header class="header">
<!--    <container class = "container">-->
    <nav class="inner">
      <div class = "left">
            <router-link to="/" exact>
      <img class="logo" src="./logo.png" alt="logo" >
            </router-link>
      </div>
      <div class = "right">
      <router-link to="/about">소개</router-link>
      <router-link to="/activity">활동</router-link>
      <router-link to="/donate">함께해요</router-link>
      <!--      <a class="github" href="https://github.com/vuejs/vue-hackernews-2.0" target="_blank" rel="noopener">-->
      <!--        Built with Vue.js-->
      <!--      </a>-->
        <router-view></router-view>
      </div>

    </nav>
<!--    </container>-->
  </header>
</template>

<script>
export default {
  name: "Header.vue"
}
</script>

<style>

.header{
  background-color: white;
  position: fixed;
  z-index: 999;
  height: 80px;
  top: 0;
  left: 0;
  right: 0;
}
.inner {
  max-width: 100%;
  box-sizing: border-box;
  margin: 2%;
  /*padding: 15px 5px;*/
}

.inner router-link{
  color: #42b983;
  font-family: -윤고딕320;
  font-size: 20px;
  font-weight: bold;
  margin-left: 40px;
}
.routers{
  /*alignment: right;*/
}
.logo{
  width: 300px;
  margin-right: 10px;
  display: inline-block;
  vertical-align: middle;

}
.left {
  float:left;
}
.right {
  float:right;
  margin-right: 5%;
}

@media (max-width: 860px) {
  .header .inner {
  padding: 15px 30px}
}

</style>