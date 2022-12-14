window.onload = function() {
document.querySelector("#callback-btn")
.addEventListener("click", function(){
  
    console.log("You have clicked the button.")
});
}

setTimeout(function () {
    console.log("Hello")
},100);


function print(callback) {
    callback();
}

function task1() {
    console.log("Welcome to my callback test");
}

setTimeout (function task2() {
    console.log("Sorry for the delay :)");
},10000);


function task3(){
    console.log(".")
}

setTimeout (function task3(){
        console.log(".");
},4000);

function task4(){
    console.log("..")
}

setTimeout (function task3(){
        console.log("..");
},6000);

function task5(){
    console.log("...")
}

setTimeout (function task3(){
        console.log("...");
},8000);

