<template>
    <div>
       <h2>{{ name }}</h2>
       <p>Student age: {{ age + 1 }}</p>
       <p>Student gender: {{ gender }}</p>
       <p><strong>Message:</strong> {{ msg }} </p>
    </div>
</template>

<script>
export default {
    name: "Student",
    data() {
        return {
            // name: "Jorn",
            // age: 21,
            // gender: "Boy",
            // msg: "I get a message"
        }
    },
    // props: ["name", "gender", "age", "msg"]
    // props: {
    //     name: String,
    //     gender: String,
    //     age: Number,
    //     msg: String
    // }
    props: {
        name: {
            type: String,
            // required: true
            default: "Unnamed"
        },
        gender: {
            type: String,
            required: true
        },
        age: {
            type: Number,
            required: true,
        },
        msg: {
            type: String,
            required: true
        }
    }
}
</script>