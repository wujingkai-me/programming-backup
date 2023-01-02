<template>
    <div class="controller">
        <div class="crontroller__text">  
            <span>总共</span>
            <span>{{ total }}</span>
            <span> / </span>
            <span>{{ hasDone }}</span>
            <span>剩余</span>
        </div>
    </div>
</template>

<script>
export default {
    name: "toDoListController",
    props: {
        total: {
            type: Number,
            require: true
        },
        hasDone: {
            type: Number,
            default: 0,
        }
    }
}
</script>