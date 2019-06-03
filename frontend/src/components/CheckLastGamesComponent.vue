<template>
  <div>
    <button type="button" @click="removeAll()">Remove All</button>
    <router-link :to="{ name: 'MainMenu' }" exact tag="button">Return to menu</router-link>
    <h1>Last Games</h1>
    <ul v-if="games.length">
      <li v-for="game in games">{{ game.id }},{{ game.healthPlayer1}}</li>
    </ul>
    <p v-if="!games.length">
        Not exists games
    </p>
  </div>
</template>

<script>
import axios from "axios";
export default {
  components: {},
  data() {
    return {
      games: [],
      game: {
        id: null,
        healthPlayer1: null,
        healthPlayer2: null,
        namePlayer1: "",
        namePlayer2: "",
        dateAndTime: null
      }
    };
  },
  mounted() {
    axios.get("http://localhost:8088/api/game").then(response => {
      this.games = response.data;
    });
  },
  methods: {
    removeAll() {
      if (this.games.length <= 0) {
          alert('Not exists games')
      } else {
          axios.delete("http://localhost:8088/api/game").then(response => {
            this.games = [];
          });
      }
    }
  }
};
</script>

<style>
</style>
