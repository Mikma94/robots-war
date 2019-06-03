import Vue from 'vue';
import App from './App.vue';
import router from './router'

import moment from 'moment'
  
Vue.filter('formatDate', function(value) {
  if (value) {
    return moment(String(value)).format('MM/DD/YYYY hh:mm')
  }
});

new Vue({
  router,
  render: h => h(App)
}).$mount('#app');