package ir.javacup.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<U, T extends IEntity<U>> implements IRepository<U, T> {
	private Map<U, T> data = new HashMap<>();
	private IdGenerator<U> idGenerator;
	
	public AbstractRepository(IdGenerator<U> idGenerator) {
		this.idGenerator = idGenerator;
	}
	
	@Override
	public void save(T entity) throws IllegalArgumentException {
		if (entity == null) throw new IllegalArgumentException("Object is null");
		entity.setId(idGenerator.generate());
		data.put(entity.getId(), entity);
	}

	@Override
	public void update(T entity) throws RuntimeException {
		if (entity == null || entity.getId() == null) throw new IllegalArgumentException("Object is null");
		if (data.get(entity.getId()) == null) throw new RuntimeException("Object isn't exist");
		data.put(entity.getId(), entity);
	}

	@Override
	public T load(U id) {
		return this.data.get(id);
	}

	@Override
	public void delete(U id) throws RuntimeException {
		if (data.get(id) == null)  throw new RuntimeException("Object isn't exist");
		data.remove(id);
	}

	@Override
	public void deleteAll() {
		data.clear();
	}

	@Override
	public List<T> loadAll() {
		return new ArrayList<T>(data.values());
	}
}
