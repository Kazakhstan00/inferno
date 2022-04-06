package TwoMassiv;

import java.util.Scanner;

public class task8 {
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
        int max = arr[0][0];
        int min = arr[0][0];
        int imax = 0;
        int imin = 0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                    imax = i;
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                    imin = i;
                }

            }
            arr[imax][j]=min;
            arr[imin][j]=max;
            if(j!=m-1){
                max = arr[0][j+1];
                min = arr[0][j+1];
                imax = 0;
                imin = 0;
            }
            else{
                break;
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.printf("%n");
        }





    }


}