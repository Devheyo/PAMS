<template>
<div class="inline-container">
  <nav class="sidebar">
    <ul>
      <li>menu1</li>
      <li>menu2</li>
      <li>menu3</li>
      <li>menu4</li>
    </ul>
  </nav>
  <main class="content">
    <p>컨트롤러 호출</p>
    <button @click="getMember">member</button>
    <button @click="getAll">all</button>    
  </main>
</div>
</template>
<script>
import axios from 'axios'

export default {
  name: 'HelloWorld',
  data() {
    const datas = []
    return datas;
  },
  methods: {
    getAll: function(){
      axios({
        method: 'get',
        url: '/main/all'
      })
      .then(response => {
        console.log(response.data);
      }); 
    },   
    getMember: function(){
      axios({
        method: 'get',
        url: '/main/member',
        params : {
          seq:'1'
        }
      })
      .then(response => {
        console.log(response.data.data[0].NAME)
        this.datas = response.data;
      }); 
    }
  },
}
</script>
