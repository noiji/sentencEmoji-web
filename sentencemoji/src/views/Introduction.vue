<template>
  <div class="intro">
    <p class = "title">sentencEmoji에 오신 것을 환영합니다.</p>
    <p class = "details">한국어 텍스트를 입력하면 어울리는 이모지를 삽입하여 반환해줍니다.</p>
  </div>

</template>

<script>
export default {
  name: "Introduction"
}
</script>

<style>
.intro{
  margin-left: 5%;
  margin-top: 7%;
  margin-bottom: 2%;
  text-align: left;
}
.title{
  font-weight: bold;
  font-size: xx-large;
}
.details{
  font-size: large;
}
</style>