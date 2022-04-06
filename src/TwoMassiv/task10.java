package TwoMassiv;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int[] maxes = new int[n];
        int max = arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            maxes[i] = max;
            if(i!=n-1){
                max = arr[i+1][0];
            }
            else{
                break;
            }
        }
        int minofmax = maxes[0];
        for(int i=0;i<n;i++){
            if(maxes[i]<minofmax){
                minofmax = maxes[i];
            }
        }
        System.out.println(minofmax);
    }
}