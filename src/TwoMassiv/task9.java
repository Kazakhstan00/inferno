package TwoMassiv;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int[] sums = new int[n];
        int sum = 0;
        boolean zero = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]!=0){
                    sum = sum + arr[i][j];
                }
                else{
                    zero = true;
                    break;
                }
            }
            if(zero){
                sums[i]=0;
            }
            else{
                sums[i]=sum;
            }
            sum = 0;
            zero = false;

        }


        for(int i=0;i<n;i++){
            if(sums[i]==0){
                System.out.println("n");
            }
            else{
                System.out.println(sums[i]);
            }
        }





    }


}