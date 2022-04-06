package OdnomernyiCyckil;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int b = 1;
        while (b<=c) {
            System.out.println(b+" "+b*b);
            b++;
        }
    }
}