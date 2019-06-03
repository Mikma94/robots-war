<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
import 'vue-select/dist/vue-select.css';
export default {
  name: 'RobotsWar',
  data() {
    return {
      dummy: []
    }
  }
};
</script>

<style>
#app {
  font-family: Arial, Helvetica, sans-serif;

}
* {
  box-sizing: border-box;
}
</style>

