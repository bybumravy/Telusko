// const myButton = document.getElementById("myButton");


// function changeColor(event){
//     event.target.style.backgroundColor = "tomato";
//     event.target.textContent = "OUCH!";
// }

// myBox.addEventListener("click", event => {
//     event.target.style.backgroundColor = "tomato";
//     event.target.textContent = " OUCH!";
// });

// myBox.addEventListener("mouseover", event => {
//     event.target.style.backgroundColor = "yellow";
//     event.target.textContent = "Don't touch it";
// });

// myBox.addEventListener("mouseout", event => {
//     event.target.style.backgroundColor = "lightgreen";
//     event.target.textContent = "Click me";
// });

// myButton.addEventListener("click", event => {
//     myBox.style.backgroundColor = "tomato";
//     myBox.textContent = " OUCH!";
// });

// myButton.addEventListener("mouseover", event => {
//     myBox.style.backgroundColor = "yellow";
//     myBox.textContent = "Don't touch it";
// });

// myButton.addEventListener("mouseout", event => {
//     myBox.style.backgroundColor = "lightgreen";
//     myBox.textContent = "Click me";
// });

document.addEventListener("keydown", event => {
    myBox.style.backgroundColor = "yellow";
    myBox.textContent = "Don't touch it";
});

document.addEventListener("keyup", event => {
    myBox.style.backgroundColor = "lightgreen";
    myBox.textContent = "Click me";
});

const myBox = document.getElementById("myBox");
const moveAmount = 10;
let x = 0;
let y = 0;

document.addEventListener("keydown", event => {
    if(event.key.startsWith("Arrow")){

        event.preventDefault();

        switch(event.key){
            case "ArrowUp":
                y -= moveAmount;
                break;
            case "ArrowDown":
                y += moveAmount;
                break;
            case "ArrowLeft":
                x-= moveAmount;
                break;
            case "ArrowRight":
                x+= moveAmount;
                break;
        }
        myBox.style.top = `${y}px`;
        myBox.style.left = `${x}px`;
    }
});