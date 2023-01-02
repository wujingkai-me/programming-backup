<template>
  <div>
    <span class="ajax"></span>
    <!-- <to-do-list-main></to-do-list-main> -->
  </div>
  
</template>

<script>
import School from "./components/School.vue"
import Student from "./components/Student.vue"
import toDoListMain from "./components/ToDoLists/toDoListMain.vue"


export default {
  name: "App",
  methods: { 
  },
  components: {
    toDoListMain
  },
}
</script>

<style>
  * {
      font-family: Source-Han-Light;
      font-weight: 500;
  }
</style>