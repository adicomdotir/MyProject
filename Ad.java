import java.util.ArrayList;
import java.util.Iterator;
// test
public class Ad {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int c=0;
		for(int i=0; i<1000000; i++) {
			if(i%1366==0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
