package ir.javacup.delivery;

public class Order implements Comparable<Order> {

	private String getName;
	private long phoneNumber;
	private double weight;

	public String getName() {
		return getName;
	}

	public void setName(String name) {
		this.getName = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Order o) {
		if (o.getName().charAt(1) > this.getName.charAt(1)) {
			return 1;
		} else if (o.getName().charAt(1) < this.getName.charAt(1)) {
			return -1;
		}
		return 0;
	}

}
