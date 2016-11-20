
public class Test {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		t2.setDaemon(true);
		t2.start();
		t1.start();
		Integer x = 11;
		synchronized(x) {
		    System.out.println("Synchronized");
		}
		System.out.println("End");
		method((String str)->System.out.println(str));
	}
	
	public static void method(IF i) {
	    i.ff("HelloWorld");
	}
}

class MyThread extends Thread {
	public void run() {
		super.run();
		for(char i = 'A'; i<'Z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getStr() {
	    return "www.adicom.ir";
	}
}

class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

interface IF {
    void ff(String str);
}
