import { mdbInput } from "mdbvue";

Vue.use(mdbInput)

var converter = new Vue({
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
})