import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index'
import VueCarousel from 'vue-carousel'

const app = createApp(App)

app.use(router)
app.use(VueCarousel)

app.mount('#app')

// Now the app has started!
