import java.util.Scanner;

public class Parallelogram {

	public static boolean flag = false;
	public static int breadth = 0, height = 1;
	static {
		 Scanner sc = new Scanner(System.in);
		 breadth = sc.nextInt();
		 height = sc.nextInt();
		 if(breadth <= 0 || height <= 0)
			 System.out.println("invalid");	
		 else {
			 System.out.println("valid");
			 flag = true;
		 }
	}
	
	public static void main(String[] args) { //don't change main body
		if (flag) {
			int area = breadth * height;
			System.out.print(area);
		}
	}
}
