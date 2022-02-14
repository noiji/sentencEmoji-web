<template>
  <footer class ="footer">

    <ul class = "info">
      <li class = "text1">개인정보처리방침</li>
      <li class = "text2">이용약관</li>
    <br>
      <li class = "text3"> 주소: 충남 천안시 동남구 신촌로 24 제 3105호 이메일: enoch95@hanmail.net 대표: 노장권 전화: 010-9936-4102</li>
      <br>
      <li class = "text4">Copyright 2022 캄보디아학교세우기모임. All Rights Reserved</li>
    </ul>
  </footer>
</template>

<script>
export default {
  name: "Footer.vue"
}
</script>

<style>
.footer{
  /*text-align:center;*/
  /*font-size:16px;*/
  background-color: #42b983;
  position: fixed;
  /*z-index: 999;*/
  height: 200px;
  width: 100%;
  bottom: 0;
}
.info{
  float: left;
  line-height: 2;
}
.text1 {
  float: left;
}
.text2 {
  margin-left: 15px;
  float: left;
}
.text3{
  float: left;
}
.text4{
  float: left;
}
ul{
  list-style: none;
}
</style>