class Player {
  playTurn(warrior) {
    if (warrior.feel().isUnit()) {
        warrior.attack();
    } else {
      if (warrior.health() < 20) {
        warrior.rest();
      } else {
        warrior.walk();
      }
    }
  }
}
