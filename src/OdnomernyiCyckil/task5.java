package OdnomernyiCyckil;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int b = 1, sum=0;
        while (b<= c) {
            sum+=b;
            b++;
        } System.out.print(sum);
    }
}