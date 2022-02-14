<template>
  <Carousel class="carouselHome">
<!--    <Slide v-for="slide in 3" :key="slide">-->
<!--      <div class="carousel__item">{{ slide }}</div>-->
<!--    </Slide>-->

    <Slide v-for="slide in 3" :key="slide">
      <div class="carousel__item">
        <slide>
          <img src="../assets/logo.png">
        </slide>
      </div>
    </Slide>

    <template #addons>
      <Navigation />
      <Pagination />
    </template>
  </Carousel>
</template>

<script>
import { defineComponent } from 'vue'
import { Carousel, Navigation, Pagination, Slide } from 'vue3-carousel';

import 'vue3-carousel/dist/carousel.css';

export default defineComponent({
  name: 'Basic',
  components: {
    Carousel,
    Slide,
    Pagination,
    Navigation,
  },
});
</script>

<style>
.carouselHome{
  margin-top: 150px;
}
.carousel__item {
  min-height: 650px;
  width: 100%;
  background-color: var(--vc-clr-primary);
  color:  var(--vc-clr-white);
  font-size: 20px;
  border-radius: 8px;
  display: flex;
  justify-content: center;
  align-items: center;
}

.carousel__slide {
  padding: 10px;
}

.carousel__prev,
.carousel__next {
  box-sizing: content-box;
  border: 5px solid white;
}
</style>