<template>
  <container class="converter">
    <textarea class = "textInput"
              v-model="textInput"
              placeholder="Input"
              maxlength="500"
              @keyup.enter="convert"
              required>
    </textarea>
    <button @click="convert" class = "convert"><span>Convert</span></button>
    <textarea class = "textOutput"
              v-model="textOutput"
              placeholder="Output"
              maxlength="500"
              readonly>
    </textarea>
  </container>
</template>

<script>
// import defaultLayout from 'sentencemoji/src/components/layouts/defaultLayout.vue'

export default {
  // el: '#converter',
  data() {
    return {
    textInput: '',
    textOutput: ''
    }
  },
  methods: {
    convert: function () {
      this.textOutput = this.textInput + ' converted!'
    }
  },
}
</script>

<style>
.converter{
  margin-left: 5%;
  margin-right: 5%;
  display: flex;
  align-items: center;
}
.textInput{
  font-family: -윤고딕310;
  width:40%;
  height:300px; font-size: large;
  margin-right: 2%;
}
.textOutput{
  font-family: -윤고딕310;
  width:40%;
  height:300px; font-size: large;
  margin-left: 2%;
}
.convert{
  font-family: -윤고딕310;
  display: inline-block;
  width: 10%;
  padding: 15px 25px;
  font-size: 20px;
  cursor: pointer;
  text-align: center;
  color: #fff;
  background-color: #ff6600;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  transition: all 0.5s;
}

.convert span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.convert span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.convert:hover span {
  padding-right: 25px;
}

.convert:hover span:after {
  opacity: 1;
  right: 0;
}
</style>