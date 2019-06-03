import Vue from 'vue'
import Router from 'vue-router'
import MainMenuComponent from './components/MainMenuComponent'
import GameComponent from './components/GameComponent'
import CheckLastGamesComponent from './components/CheckLastGamesComponent'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'MainMenu',
      component: MainMenuComponent
    },
    {
      path: '/checkLastGames',
      name: 'CheckLastGames',
      component: CheckLastGamesComponent
    },
    {
      path: '/start',
      name: 'Game',
      component: GameComponent
    }
  ]
})