let player = 1;
const cells = [0, 0, 0, 0, 0, 0, 0, 0, 0];
let isWinner = false;

function cellClick() {
    if (!isWinner) {
        cellUpdate(event.target.id)
    }
}

function reset() {
    player = 1;
    for (let i = 0; i < cells.length; i++) {
        cells[i] = 0;
    }
    isWinner = false;
    const elements = document.querySelectorAll('div.cell');
    elements.forEach(element => {
        element.innerHTML = '';
    });
}

function cellUpdate(id) {
    const element = document.getElementById(id);
    if (cells[id - 1] == 0) {
        if (player == 1) {
            element.innerHTML = 'X';
        } else {
            element.innerHTML = 'O';
        }
        cells[id - 1] = player;
        winnerCheck();
        player = (player == 1) ? 2 : 1;
    }
}

function winnerCheck() {
    if (cells[0] == player && cells[1] == player && cells[2] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[3] == player && cells[4] == player && cells[5] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[6] == player && cells[7] == player && cells[8] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[0] == player && cells[3] == player && cells[6] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[1] == player && cells[4] == player && cells[7] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[2] == player && cells[5] == player && cells[8] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[0] == player && cells[4] == player && cells[8] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    } else if (cells[2] == player && cells[4] == player && cells[6] == player) {
        alert('Winner is player ' + player);
        isWinner = true;
    }
}