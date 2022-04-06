package ifElse;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a > 0) {
            System.out.println(a + 1);
        } else if (a < 0) {
            System.out.println(a - 2);
        } else {
            System.out.println(10);
        }
    }
}