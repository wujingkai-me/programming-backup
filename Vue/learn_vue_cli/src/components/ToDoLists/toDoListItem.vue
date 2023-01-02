<template>
    <div class="item">
        <div class="item__list" v-for="text, key of texts" :key="key">
            <div class="item__list__text">
                <input type="checkbox" class="checkbox" id="checkbox"/>
                <label for="checkbox"></label>
                <span v-text="text"></span>
            </div>
            <div class="item__delete">删除</div>
        </div>
    </div>
</template>

<script>
export default {
    name: "toDoListItem",
    props: {
        texts: {
            type: Array,
            default: function() {
                return [];
            }
        }
    }
}
</script>

<style scoped>
    .item__list {
        display: flex;
        height: 40px;
        line-height: 40px;
        padding: 5px 10x;
        /* overflow: ; */
        user-select: none;
    }

    .item__list__text {
        flex: 1;
    }

    .item__delete {
        display: none;
        text-align: center;
        /* background-color: black; */
        border-radius: 3px;
        color: black;
        font-weight: 600;
        cursor: pointer;
    }

    .item__delete:hover {
        text-decoration: underline;
    }

    .item__list:hover {
        background-color: rgb(237, 236, 236);
    }

    .item__list:hover .item__delete {
        display: inline-block;
    }


</style>