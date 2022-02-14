<template>
  <Header></Header>
  <Introduction></Introduction>
  <converter />
  <Footer></Footer>
</template>

<script>
import Header from "./components/layouts/Header.vue"
import Footer from "./components/layouts/Footer.vue"
import Introduction from './views/Introduction.vue'
import Converter from './views/Converter.vue'

export default {
  name: 'App',
  components: {
    // HelloWorld
    Header,
    Introduction,
    Converter,
    Footer
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.header{
  background-color: #ff6600;
  position: fixed;
  z-index: 999;
  height: 55px;
  top: 0;
  left: 0;
  right: 0;
}

.logo{
  height: 55px;
  top: 0;
  left: 0;
  right: 0;
}
</style>
