package OdnomernyiCyckil;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b=1;
        int sum = 0;
        while (b<=a) {
            sum+=b*b;
            b++;
        }
        System.out.println(sum);
    }
}