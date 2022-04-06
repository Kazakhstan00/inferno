package TwoMassiv;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        if(n%2==0){
            for(int i=n/2;i<n;i++){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.printf("%n");
            }
            for(int i=0;i<n/2;i++){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.printf("%n");
            }
        }
        else{
            for(int i=n/2+1;i<n;i++){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.printf("%n");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[n/2][j]+" ");
            }
            System.out.printf("%n");
            for(int i=0;i<n/2;i++){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.printf("%n");
            }
        }


    }

}