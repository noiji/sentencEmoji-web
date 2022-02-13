<template>
  <html>
  <head>
    <link rel="stylesheet" href="mainPage.css">
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <title>sentencEmoji</title>
  </head>
  <body>

  <div id="converter">
    <textarea v-model="textInput"
              placeholder="Input"
              maxlength="500"
              @keyup.enter="convert"
              style="width:500px; height:300px; font-size: x-large"
              required>
    </textarea>
    <button @click="convert">Convert</button>
    <textarea v-model="textOutput"
              placeholder="Output"
              maxlength="500"
              style="width:500px; height:300px; font-size: x-large"
              readonly>
    </textarea>
  </div>

  <script src="mainPage.js"></script>
  </body>
  </html>
</template>

<script>
export default {
  el: '#converter',
  data: {
    textInput: '',
    textOutput: ''
  },
  methods: {
    convert: function () {
      this.textOutput = this.textInput + ' converted!'
    }
  }
}
</script>

<style scoped>

</style>