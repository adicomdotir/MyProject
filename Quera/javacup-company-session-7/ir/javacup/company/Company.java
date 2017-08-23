package ir.javacup.company;

public class Company {
	private static final String name = "JavaCup.co";
	private static Company company = null;
	
	private Company() {}
	
	public static Company getInstance() {
		if(company == null) {
			company = new Company();
		}
		return company;
	}
	
	public static String getName() {
		return name;
	}
}
