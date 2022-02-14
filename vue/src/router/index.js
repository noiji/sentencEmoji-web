import { createRouter, createWebHistory } from 'vue-router'
import Home from '@/views/Home.vue'
import About from "@/views/About";
import Activity from "@/views/Activity";
import Donate from "@/views/Donate";

// const routes = [
//   {
//     path: '/',
//     name: 'Home',
//     component: Home
//   },
//   {
//     path: '/about',
//     name: 'About',
//     // route level code-splitting
//     // this generates a separate chunk (about.[hash].js) for this route
//     // which is lazy-loaded when the route is visited.
//     component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
//   }
// ]

const routes = [
  { path: '/', component: Home }, //찐 적용
  { path: '/about', component: About },
  { path: '/activity', component: Activity },
  { path: '/donate', component: Donate },
]

const router = createRouter({
  mode: "history",
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
