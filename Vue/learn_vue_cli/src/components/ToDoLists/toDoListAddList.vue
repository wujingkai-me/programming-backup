<template>
    <div id="add">
        <input type="text" class="addTodo" placeholder="添加清单..." @keydown.enter="addList">
    </div>
</template>

<script>
export default {
    name: "toDoListAddList",
    methods: {
        addList(e) {
            if( e.target.value.trim() == "" ) {
                return 0;
            }
            // alert(123)
            this.$emit("seedValue", e.target.value);
        }
    }
}
</script>

<style scoped>
    .addTodo {
        width: 100%;
        height: 40px;
        outline: 0;
        border: 1px solid #666;
        padding-left: 10px;
        box-sizing: border-box;
    }
</style>