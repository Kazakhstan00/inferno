package Massiv;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        int a[] = new int[c];

        for (int i = 0; i < c; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        for (int i = 0; i < c; i++) {
            if (a[i] % k == 0)
                System.out.print(a[i] + " ");
        }


    }
}