package ifElse;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a > b && a > c && a > d && a % 2 == 0) {
            System.out.println(a);
        } else
        if (b > a && b > c && b > d && b % 2 == 0) {
            System.out.println(b);
        } else
        if (c > a && c > b && c > d && c % 2 == 0) {
            System.out.println(c);
        } else
        if (d > a && d > b && d > c && d % 2 == 0) {
            System.out.println(d);
        } else {
            System.out.println("Not Found");
        }
    }
}