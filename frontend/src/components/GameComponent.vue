<template>
  <div>
    <!-- <h1>Equivalencias en BitCoins</h1>
    <label>Ultima actualización:</label>
    <input v-model="apiResponse.time.updated" class="form-label">
    <br>
    <label>Selecciona tipo de moneda</label>
    <v-select :options="options" @input="onCoinSelected"></v-select>
    <br>
    <label v-if="bitCoinValue">Valor en BitCoins</label>
    <input v-if="bitCoinValue" v-model="bitCoinValue" class="form-label">
    <br>-->
    <router-link :to="{ name: 'MainMenu' }" class="update-button" tag="button">
      Return to menu
    </router-link> 
    <br>
    <input v-model="game.namePlayer1" class="form-label">
    <br>
    <input v-model="game.healthPlayer1" class="form-health">
    <button type="button" @click="attackToPlayer1()">Attack</button>
    <br>
    <input v-model="game.namePlayer2" class="form-label">
    <br>
    <input v-model="game.healthPlayer2" class="form-health">
    <button type="button" @click="attackToPlayer2()">Attack</button>
  </div>
</template>

<script>
import axios from 'axios';
import vSelect from 'vue-select';
export default {
  components: {
    'v-select': vSelect
  },
  data() {
    return {
      game: {
        id: null,
        healthPlayer1: null,
        healthPlayer2: null,
        namePlayer1: '',
        namePlayer2: '',
        dateAndTime: null
      },
    }
  },
  mounted() {
    axios.post('http://localhost:8088/api/game', this.game)
      .then(response => {
        this.game = response.data
      })
  },
  methods: {
    attackToPlayer1() {
      random = Math.floor(Math.random() * (21 - 5)) + 5;
      this.game.healthPlayer1 - random;
    },
     attackToPlayer2() {
      random = Math.floor(Math.random() * (21 - 5)) + 5;
      this.game.healthPlayer2 - random;
    },
    update: function() {
      document.location.reload();
    }
  }
}
</script>

<style>

@import "vue-select/src/scss/vue-select.scss";

.form-label {
  width: 10%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

.form-health {
  width: 5%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: none;
}

</style>
