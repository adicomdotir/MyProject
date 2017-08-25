package ir.javacup.salary;
public class HrmSalaryListCreator extends SalaryListCreator {
	public HrmSalaryListCreator(Encoder encoder) {
		super(encoder);
	}
    protected String doCreate(Employee[] employees) {
    	String temp = "";
    	for (int i=0; i<employees.length; i++) {
    		temp += addZeroPrefix(employees[i].getCode(), 8) + getItemSeparator() + addZeroPrefix("" + employees[i].getSalary(), 10);
    		if (i != employees.length - 1) {
    			temp += this.getRecordSeparator();
    		}
    	}
    	return temp;
    }
}
