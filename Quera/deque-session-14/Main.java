import ir.javacup.dq.*;

public class Main {
	public static void main(String[] args) {		
		DequeUtilImpl<Integer> dequeImpl = new DequeUtilImpl<>();
		for(int i=0; i<6; i++) {
			dequeImpl.getDeque().push(i);
		}
		System.out.println(dequeImpl.get(-1));
	}
}
