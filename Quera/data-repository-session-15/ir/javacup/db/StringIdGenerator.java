package ir.javacup.db;

public class StringIdGenerator implements IdGenerator<String> {
	public static int ID = 0; 
	@Override
	public String generate() {
		return "NULL" + (++ID);
	}
}
