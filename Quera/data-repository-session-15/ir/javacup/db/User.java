package ir.javacup.db;

public class User implements IEntity<String> {
	private String id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setId(String id) {
		this.id = id;		
	}

	@Override
	public String getId() {
		return id;
	}
}
