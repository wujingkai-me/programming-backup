<template>
    <div id="toDoListMain">
        <h2>清单列表</h2>
        <toDoListAddList @seedValue="addListSeedValue"/>
        <toDoListItem :texts="ar"/>
        <HadDoneListItem />
        <toDoListController :total="ar.length" :hasDone="0"/>
    </div>
    
</template>


<script>
import toDoListAddList from "./toDoListAddList.vue";
import toDoListItem from "./toDoListItem.vue";
import toDoListController from "./toDoListController.vue";

export default {
    name: "toDoListMain",
    data() {
        return {
            ar: ['123', "321"]
        }
    },
    methods: {
        addListSeedValue(value) {
            this.ar.push(value);
        }
    },
    components: { toDoListAddList, toDoListItem, toDoListController }
}
</script>

<style scoped>
    * {
        font-family: Source-Han-Light;
        font-size: 90%;
    }
    
    h2 {
        font-size: 250%;
        
    }

    #toDoListMain {
        width: 600px;
        margin: 100px auto;
    }
</style>