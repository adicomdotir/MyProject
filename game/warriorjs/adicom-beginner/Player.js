class Player {
  
  constructor() {
    this.health = 0;
  }

  playTurn(warrior) {
    if (warrior.feel().isUnit()) {
    	
	      warrior.attack();
    } else {
      if (warrior.health() < this.health) {
        warrior.walk();
      } else if (warrior.health() < 20) {
        warrior.rest();
      } else {
        warrior.walk();
      }
      this.health = warrior.health();
    }
  }
}
