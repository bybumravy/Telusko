let count = 0;
const countLabel = document.getElementById("countLabel");

function increaseCount() {
    count++;
    countLabel.textContent = count;
}

function decreaseCount() {
    count--;
    countLabel.textContent = count;
}

function resetCount() {
    count = 0;
    countLabel.textContent = count;
}