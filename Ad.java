import java.util.ArrayList;
import java.util.Iterator;

public class Ad {
	public static void main(String[] args) {
		/*
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("David");
		obj.add("Cris");
		obj.add(0, "Leo");
		obj.remove(1);
		obj.remove("Leo");
		
		System.out.println("Advanced For Loop"); 		
		for(String x:obj)
			System.out.println(x);
		
		System.out.println("Iterator is best");
		Iterator iter = obj.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		*/
		int c=0;
		for(int i=0; i<1000000; i++) {
			if(i%1366==0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
