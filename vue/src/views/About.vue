<template>
  <div class="home">
    <carousel class="slideList"
              :navigationEnabled="true"
              :autoplay="true">
      <slide>
        <img src="../assets/logo.png">
      </slide>
      <slide>
        <img src="../assets/logo.png">
      </slide>
      <slide>
        <img src="../assets/logo.png">
      </slide>
    </carousel>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: 'Activity',
  components: {
  }
}


</script>

<style>
img{
  width: 90%;
}
</style>
