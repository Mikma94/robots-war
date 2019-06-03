<template>
  <div>
    <button type="button" @click="removeAll()">Remove All</button>
    <router-link :to="{ name: 'MainMenu' }" exact tag="button">Return to menu</router-link>
    <h1>Last Games</h1>
    <table v-if="games.length" class="result-table">
      <tr>
        <th>Fecha</th>
        <th>Robot 1</th>
        <th>Robot 2</th>
      </tr>
      <tr v-for="game in games">
        <td>{{ game.dateAndTime | formatDate }}</td>
        <td>{{ game.healthRobot1}}</td>
        <td>{{ game.healthRobot2}}</td>
      </tr>
    </table>

    <p v-if="!games.length">Not exists games</p>
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
        healthRobot1: null,
        healthRobot2: null,
        nameRobot1: "",
        nameRobot2: "",
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
        alert("Not exists games");
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
.result-table {
  width: 50%;
  text-align: left;
}
</style>
