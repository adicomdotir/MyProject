import java.util.Scanner;

public class MyClass1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int type = 0;
        boolean correct = true;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
                if (arr[i] < 45 + a) {
                    if (type == 1) {
                        correct = false;
                    }
                    type = 0;
                } else if (arr[i] >= 45 && arr[i] <= 90 + b) {
                    type = 1;
                } else {
                    correct = false;
                }
        }
        if (correct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
