package Massiv;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int  a[] = new int[c];
        for (int i =0; i <c; i++){
            a[i]=in.nextInt();
        }
        for (int i=0;i<c;i++) {
            System.out.println(i+" - "+a[i]);
        }
    }
}