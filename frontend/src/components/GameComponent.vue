<template>
  <div>
    <router-link :to="{ name: 'MainMenu' }" v-if="game.gameFinished" class="update-button" tag="button">Return to menu</router-link>
    <br>
    <input v-model="game.nameRobot1" class="form-label">
    <br>
    <input v-model="game.healthRobot1" class="form-health">
    <button type="button" @click="attackRobot1()">Attack</button>
    <button type="button" @click="healRobot1()">Heal</button>
    <button type="button" @click="surrender()">Surrender</button>
    <br>
    <input v-model="game.nameRobot2" class="form-label">
    <br>
    <input v-model="game.healthRobot2" class="form-health">
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
        healthRobot1: null,
        healthRobot2: null,
        nameRobot1: "",
        nameRobot2: "",
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
      this.game.healthRobot2 = this.attack(this.game.healthRobot2);
      this.robot2();
    },
    healRobot1() {
      this.game.healthRobot1 = this.heal(this.game.healthRobot1);
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
          this.game.healthRobot1 = this.attack(this.game.healthRobot1);
          break;
        case 1:
          this.game.healthRobot2 = this.heal(this.game.healthRobot2);
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
