package Massiv;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        double sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (m < a[i]) {
                sum += a[i];
                count++;}
        }
        System.out.println(sum / count);
    }
}