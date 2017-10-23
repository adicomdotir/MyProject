package ir.javacup.context.zoo;

public class CageCopier {
	public void copy(Cage c1, Cage c2) {
		if(c1 != null && c2 != null) {
			c2.setId(c1.getId());
			c2.setName(c1.getName());
			Bird[] birds = c1.getBirds();
			Bird[] newBirds = new Bird[2];

			if(birds == null) c2.setBirds(null);

			if(birds[0] != null) {
				newBirds[0] = new Bird();
				newBirds[0].setName(birds[0].getName());
				newBirds[0].setColor(birds[0].getColor());
			} else {
				newBirds[0] = null;
			}
			

			if(birds[1] != null) {
				newBirds[1] = new Bird();
				newBirds[1].setName(birds[1].getName());
				newBirds[1].setColor(birds[1].getColor());
			} else {
				newBirds[1] = null;
			}

			c2.setBirds(newBirds);
		}
	}
}
