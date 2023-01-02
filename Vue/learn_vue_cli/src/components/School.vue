<template>
    <div>
        <h1 v-text="msg"></h1>
        <p>School name: {{ name }}</p>
        <p>School address: {{ address }}</p>
    </div>
</template>

<script>
export default {
    name: "School",
    data() {
        return {
            name: "Vue School",
            address: "www.cn.vuejs.org",
            msg: "Welcome to leanning Vue Framework"
        }
    }
}
</script>

<style scoped>
    
</style>