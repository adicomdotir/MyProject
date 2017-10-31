package ir.javacup.contest.zoo;

public class CageCopier {
	public void copy(Cage c1, Cage c2) {
		if(c1 != null && c2 != null) {
			c2.setId(c1.getId());
			c2.setName(c1.getName());
			Bird[] birds1 = c1.getBirds();
			Bird[] birds2 = c2.getBirds();

			if(birds1 == null) {
				c2.setBirds(null);
			} else {
				if(birds2 == null) {
					birds2 = new Bird[2];
				}
				if(birds1[0] != null) {
					birds2[0] = new Bird();
					birds2[0].setName(birds1[0].getName());
					birds2[0].setColor(birds1[0].getColor());
				} else {
					birds2[0] = null;
				}
				if(birds1[1] != null) {
					birds2[1] = new Bird();
					birds2[1].setName(birds1[1].getName());
					birds2[1].setColor(birds1[1].getColor());
				} else {
					birds2[1] = null;
				}

				c2.setBirds(birds2);
			}
		}
	}
}
