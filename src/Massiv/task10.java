package Massiv;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();

        int a[] = new int[c];

        for (int i = 0; i < c; i++) {
            a[i] = in.nextInt();
        } int max = a[0];
        int min = a[0];

        for (int i = 0; i < c; i++) {
            if (max<a[i]) {
                max=a[i];
            } if (min>a[i]) {
                min=a[i];}
        } System.out.print(min+" "+max);

    }


}