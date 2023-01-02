function $(el){
  if(/^#/.test(el))
    return document.querySelector(el)

  return document.querySelectorAll(el)
}

$("#btn").onclick =() => {
  $("#write").innerHTML = $("#input-write").value
}

let arr = ["Jorn", "Tom", "Yooo"]
for (let i of arr){
  $("#for").innerHTML += i + " "
}
$("#for").innerHTML += "<br/>"

for(let i in arr){
  $("#for").innerHTML += i + " "
}

let arrs = {
  "Jorn": "123",
  "Tom" : "444",
  "Yooo": "3321"
}

function a() {
  console.log(1)
  arguments.callee()
}

a()