package Massiv;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int  a[] = new int[c];

        for (int i =0; i <c; i++){
            a[i]=in.nextInt();
            ;
        }int count = 0;
        for (int i=0;i<c;i++) { if(a[i]>0)
            count++;


        }System.out.print(count);
    }
}