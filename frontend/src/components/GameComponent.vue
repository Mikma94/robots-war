<template>
  <div>
    <router-link :to="{ name: 'MainMenu' }" v-if="game.gameFinished" class="update-button" tag="button">Return to menu</router-link>
    <br>
    <input v-model="game.namePlayer1" class="form-label">
    <br>
    <input v-model="game.healthPlayer1" class="form-health">
    <button type="button" @click="attackRobot1()">Attack</button>
    <button type="button" @click="healRobot1()">Heal</button>
    <button type="button" @click="surrender()">Surrender</button>
    <br>
    <input v-model="game.namePlayer2" class="form-label">
    <br>
    <input v-model="game.healthPlayer2" class="form-health">
  </div>
</template>

<script>
import axios from "axios";
import vSelect from "vue-select";
export default {
  components: {
    "v-select": vSelect
  },
  data() {
    return {
      game: {
        id: null,
        healthPlayer1: null,
        healthPlayer2: null,
        namePlayer1: "",
        namePlayer2: "",
        gameFinished: null,
        dateAndTime: null
      },
      isGameFinished: false
    };
  },
  mounted() {
    axios.post("http://localhost:8088/api/game", this.game).then(response => {
      this.game = response.data;
    });
  },
  updated() {
    if (this.isGameFinished) {
      this.game.gameFinished = true;      
      this.finish();
      alert('Game finished');
      this.isGameFinished = false;
    }
  },
  methods: {
    attackRobot1() {
      this.game.healthPlayer2 = this.attack(this.game.healthPlayer2);
      this.robot2();
    },
    healRobot1() {
      this.game.healthPlayer1 = this.heal(this.game.healthPlayer1);
      this.robot2();
    },
    attack(health) {
      var random = Math.floor(Math.random() * (21 - 5)) + 5;
      health -= random;
       if (health <= 0) {
        this.isGameFinished = true;
        return 0;
      }
      return health;
    },
    heal(health) {
      if (health < 80 && health > 0) {
        var random = Math.floor(Math.random() * (11 - 2)) + 2;
        return (health += random);
      } 
      return health;
    },
    surrender() {
      this.game.gameFinished = true;      
      this.finish();
      alert("Robot 1 has surrendered");
    },
    robot2() {
      var random = Math.floor(Math.random() * (2 - 0)) + 0;
      switch (random) {
        case 0:
          this.game.healthPlayer1 = this.attack(this.game.healthPlayer1);
          break;
        case 1:
          this.game.healthPlayer2 = this.heal(this.game.healthPlayer2);
          break;
      }
    },
    finish() {
      axios.put("http://localhost:8088/api/game", this.game).then(response => {
        this.game = response.data;
      });
    }
  }
};
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
