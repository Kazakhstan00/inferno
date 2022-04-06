package OdnomernyiCyckil;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while ( a < b) {
            if (a%3==0)
                System.out.print(a+" ");
            a++;
        }
    }
}