<template>
  <header class="header">
    <nav class="inner">
      <!--      <router-link to="/" exact>-->
      <img class="logo" src="../logo.png" alt="logo">
      <!--      </router-link>-->
      <router-link to="/top">About</router-link>
      <router-link to="/new">개발 스토리</router-link>
      <router-link to="/top">Source Code</router-link>
      <!--      <router-link to="/show">Show</router-link>-->
      <!--      <router-link to="/ask">Ask</router-link>-->
      <!--      <router-link to="/job">Jobs</router-link>-->
      <!--      <a class="github" href="https://github.com/vuejs/vue-hackernews-2.0" target="_blank" rel="noopener">-->
      <!--        Built with Vue.js-->
      <!--      </a>-->
    </nav>
  </header>
</template>

<script>
export default {
  name: "Header.vue"
}
</script>

<style>
.header{
  background-color: #ff6600;
  position: fixed;
  z-index: 999;
  height: 55px;
  top: 0;
  left: 0;
  right: 0;
}
.inner {
  max-width: 800px;
  box-sizing: border-box;
  margin: 0px auto;
  padding: 15px 5px;
}

.logo{
  width: 24px;
  margin-right: 10px;
  display: inline-block;
  vertical-align: middle;
}
@media (max-width: 860px) {
  .header .inner {
  padding: 15px 30px}
}

</style>