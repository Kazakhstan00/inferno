package OdnomernyiCyckil;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int b = 1;
        while (b-1<c) {
            System.out.print(b+" ");
            b++;
        }
    }
}