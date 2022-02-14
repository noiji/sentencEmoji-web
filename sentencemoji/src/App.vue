<template>
  <div id = "app">
  <Header></Header>
  <Introduction></Introduction>
  <converter />
  <Footer></Footer>
  </div>
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
  font-family: -윤고딕320;
  /*font-family: BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen, Ubuntu, Cantarell, "Fira Sans", "Droid Sans", "Helvetica Neue", sans-serif;*/
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

</style>
