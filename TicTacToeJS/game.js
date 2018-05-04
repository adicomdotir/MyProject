let player = 1;

function cellClick() {
    cellUpdate(event.target.id)
    player = (player == 1) ? 2 : 1;
}

function cellUpdate(id) {
    const element = document.getElementById(id);
    if (player == 1) {
        element.innerHTML = 'X';
    } else {
        element.innerHTML = 'O';
    }
}