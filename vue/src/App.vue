<template>
  <div id="app">
  <Header></Header>
<!--    <Home></Home>-->
<!--    <About></About>-->
    <router-view></router-view> <!--필수!!!!!!!!!!!오래 애먹었네-->
  <Footer></Footer>
  </div>
</template>

<style>
#app {
  font-family: -윤고딕320, "Segoe UI", Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
<script>
import Header from './components/Header'
import Footer from './components/Footer'
// import About from "@/views/About";
// import Home from './views/Home'

export default {
  components: {
    // About,
    Footer,
    Header,
    // Home
  }
}
</script>