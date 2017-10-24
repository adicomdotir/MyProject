package ir.javacup.test;

public class Elevator {

	private int floorNumber; 
	private State state;
	private boolean open;

	public Elevator() {
		floorNumber = 0; 
		state = State.SECURE;
		open = true;
	}

	public boolean isOpen() {
		return open;
	}

	public boolean isUnderMaintenance() {
		if (state == State.SECURE) {
			return false;
		} else {
			return true;
		}
	}

	public State getState() {
		return state;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void move(int floorNumber) throws IllegalArgumentException {
		if (state == State.SECURE) {
			if (floorNumber >= -2 && floorNumber <= 10) {
				if (floorNumber != this.floorNumber) {	
					this.floorNumber = floorNumber;
					open = false;
				}
			} else {
				throw new IllegalArgumentException("Floor number should be between -2 and 10");
			}
		} else {
			throw new IllegalArgumentException("Elevator is insecure");
		}
	}

	public void startMaintenance() {
		state = State.INSECURE;
	}

	public void finishMaintenance() {
		state = State.SECURE;
	}

	public void close() {
		open = false;
	}

	public void open() {
		open = true;
	}
}

enum State {
	SECURE,
	INSECURE
}