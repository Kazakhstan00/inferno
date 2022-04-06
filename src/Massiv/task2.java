package Massiv;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int  a[] = new int[c];
        int i =0;
        while ( i < c){
            a[i]=in.nextInt();
            i++;
        }i=0;
        while (i<c) {
            System.out.println(a[i]);
            i++;
        }
    }
}