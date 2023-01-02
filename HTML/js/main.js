"use strict";

let arr = [1, 1, 1, 33, 12, 3, 4, 12, 5, 5];

arr.forEach((item, index) => {
	for (let i = index + 1; i < arr.length; i++) {
		if (arr[i] == item) {
			arr[index] = "";
		}
	}
});

arr = arr.filter(item => {
	return item != "";
});

console.log(arr);
