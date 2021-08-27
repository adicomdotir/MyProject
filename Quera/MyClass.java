 import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int cnt = 0;
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                cnt++;
            } else if (word.charAt(i) == 'e') {
                cnt++;
            } else if (word.charAt(i) == 'i') {
                cnt++;
            } else if (word.charAt(i) == 'o') {
                cnt++;
            } else if (word.charAt(i) == 'u') {
                cnt++;
            }
        }
        System.out.println("" + (int) Math.pow(2, cnt));
    }
}
