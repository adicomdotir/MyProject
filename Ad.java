import java.util.ArrayList;
import java.util.Iterator;
// test
// this section add by k112
// this is fun
public class Ad {
	public static void main(String[] args) {
		int c=0;
		for(int i=0; i<1000000; i++) {
			if(i%1987==0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
