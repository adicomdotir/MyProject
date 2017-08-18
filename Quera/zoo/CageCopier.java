
public class CageCopier {

	public void copy(Cage c1, Cage c2) {
		if(c1 != null || c2 != null) {
			c2.setId(c1.getId());
			c2.setName(c1.getName());
		}
	}
}
