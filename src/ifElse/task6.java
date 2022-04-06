package ifElse;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");


        }
    }
}