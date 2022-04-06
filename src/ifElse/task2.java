package ifElse;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a >= 10 && a <=20) {
            System.out.println("YES");
        } else {

            System.out.println("NO");

        }
    }
}