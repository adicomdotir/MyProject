package ir.javacup.salary;

public abstract class SalaryListCreator {

	protected Encoder encoder;

	public SalaryListCreator(Encoder encoder) {
		this.encoder = encoder;
	}

	public String create(Employee[] employees) {
		String rawStr = doCreate(employees);
		return encoder.encode(rawStr);
	}

	protected abstract String doCreate(Employee[] employees);

	protected static String addZeroPrefix(String str, int length) {
		return String.format("%" + length + "s", str).replace(' ', '0');
	}

	protected String getRecordSeparator() {
		return System.lineSeparator();
	}

	protected String getItemSeparator() {
		return " ";
	}
}
