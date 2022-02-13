import { createWebHistory, createRouter } from "vue-router";
import List from './views/List.vue';
import mainPage from './views/mainPage/mainPage.vue';

const routes = [
    {
        path: "/",
        component: mainPage,
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;