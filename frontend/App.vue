<template>
  <Header />
  <router-link to="/">홈페이지</router-link>
  <Footer />
</template>

<script>
import Header from './components/layout/Header';
import Footer from './components/layout/Footer';
export default {
  name: 'App',
  data(){
    return {

    }
  },
  components: {
    Header,
    Footer,
  }
}
</script>