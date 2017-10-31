package ir.javacup.dq;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeUtilImpl<T> implements DequeUtil<T> {
	private Deque<T> deque = new LinkedList<>();

	@Override
	public Deque<T> getDeque() {
		return deque;
	}

	@Override
	public T get(int index) throws RuntimeException {
		T temp = null;
		int i = 0;
		Iterator<T> it = deque.iterator();
		while (it.hasNext() && i <= index) {
			T t = (T) it.next();
			if (i == index) {
				temp = t;
			}
			i++;
		}
		if (temp == null) {
			throw new RuntimeException("index should be between 0 and size-1");
		}
		return temp;
	}

	@Override
	public boolean push(T element, int index) {
		if (deque.size() <= index || index < 0) {
			return false;
		}
		Deque<T> tempDeque = new LinkedList<>();
		int i = 0;
		Iterator<T> it = deque.iterator();
		while (it.hasNext()) {
			T t = (T) it.next();
			if (i == index) {
				tempDeque.addLast(element);
				tempDeque.addLast(t);
			} else {
				tempDeque.addLast(t);
			}
			i++;
		}
		deque = tempDeque;
		return true;
	}

	@Override
	public boolean replace(T element, int index) {
		if (deque.size() <= index || index < 0) {
			return false;
		}
		Deque<T> tempDeque = new LinkedList<>();
		int i = 0;
		Iterator<T> it = deque.iterator();
		while (it.hasNext()) {
			T t = (T) it.next();
			if (i == index) {
				tempDeque.addLast(element);
			} else {
				tempDeque.addLast(t);
			}
			i++;
		}
		deque = tempDeque;
		return true;
	}

	@Override
	public boolean reverse(int first, int second) {
		if (deque.size() <= first || first < 0) {
			return false;
		}
		if (deque.size() <= second || second < 0) {
			return false;
		}
		Deque<T> tempDeque = new LinkedList<>();
		int i = 0;
		Iterator<T> it = deque.iterator();
		while (it.hasNext()) {
			T t = (T) it.next();
			if (i >= first && i <= second) {
				tempDeque.addFirst(t);
			}
			i++;
		}
		i = 0;
		Iterator<T> it2 = deque.iterator();
		while (it2.hasNext()) {
			T t = (T) it2.next();
			if (i < first) {
				tempDeque.addFirst(t);
			} else if (i > second) {
				tempDeque.addLast(t);
			}
			i++;
		}
		deque = tempDeque;
		return true;
	}

}