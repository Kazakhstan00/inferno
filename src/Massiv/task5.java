package Massiv;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int  a[] = new int[c];
        for (int i =0; i <c; i++){
            a[i]=in.nextInt();
        }int sum = 0, count = 0;
        for (int i=0;i<c;i++)
        {
            sum+=a[i];
            count++;
        }int x = sum/count;
        for (int i=0;i<c;i++) {
            if(a[i]>x)
                System.out.print(a[i]+" ");
        }
    }
}