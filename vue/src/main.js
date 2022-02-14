import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index'

const app = createApp(App).use(router).use(router)

app.use(router)

app.mount('#app')

// Now the app has started!
