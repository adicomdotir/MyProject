package ir.javacup.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
	private Map<String, User> data = new HashMap<>();
	private IdGenerator idGenerator;

	public UserRepository(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	public void save(User user) {
		user.setId((String) idGenerator.generate());
		// implementation
	}

	public void update(User user) {
		// implementation
	}

	public User load(String id) {
		// implementation
		return null;
	}

	public List<User> loadAll() {
		// implementation
		return null;
	}

	public void delete(String id) {
		// implementation
	}

	public void deleteAll() {
		// implementation
	}
}
