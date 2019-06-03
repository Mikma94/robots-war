<template>
  <div>
    <h1 class="title">Robots War</h1>
    <div class="main-buttons" >
      <router-link class="update-button" :to="{ name: 'Game' }" exact tag="button">Start</router-link>
      <router-link class="update-button" :to="{ name: 'CheckLastGames' }" exact tag="button"> Check last games</router-link>
    </div>
  </div>
  
</template>

<script>
export default {

}
</script>

<style>
.title {
  text-align: center
}
.main-buttons {
  display: flex; justify-content: center;
}
.update-button {
  width: 30%;
  height: 30%;
  background-color: rgb(48, 121, 216);
  color: white;
  padding: 14px 20px;
  margin: 8px 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  text-align: center;
}
</style>
