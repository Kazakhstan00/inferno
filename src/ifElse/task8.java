package ifElse;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();


        if ((a+100)==b || (a-100)==b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");


        }
    }
}