import java.util.Scanner;
import java.lang.Runtime;

public class Ad {
	public static Scanner sc;
	public static void main(String[] args) {
<<<<<<< HEAD
		sc = new Scanner(System.in);
		int n = 0;
		while(true) {
			init();
			n = sc.nextInt();
			switch(n) {
				case 1:
					power();
					break;
				case 2: 
					fact();
					break;
				case 3:
					c();
					break;
				case 4:
					sin();
					break;
				case 5:
					return;
			}
		}
	}
	
	public static void init() {
		//System.out.print("\033[H\033[2J");
		System.out.println("");
		System.out.println("Menu:");
		System.out.println("1: power(x,y)");
		System.out.println("2: factorial(n)");
		System.out.println("3: c(m,n)");
		System.out.println("4: sin(x)");
		System.out.print("Please enter a number? ");
	}
	
	public static void power() {
		System.out.print("power(x,y) enter x,y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 1;
		for(int i=1; i<=y; i++)
			sum *= x;
		System.out.println("power(" + x + "," + y + ")=" + sum);
	}
	
	public static void fact() {
		System.out.print("factorial(n) enter n: ");
		int n = sc.nextInt();
		int sum = 1;
		for(int i=1; i<=n; i++)
			sum *= i;
		System.out.println("factorial(" + n + ")=" + sum);
	}
	
	public static void c() {
		
	}
	
	public static void sin() {
	}
}
