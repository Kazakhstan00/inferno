package OdnomernyiCyckil;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b=1;
        double sum = 0;
        while (b<=a) {
            sum+=1.0/b;
            b++;
        }
        System.out.println(sum);
    }
}