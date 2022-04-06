package Massiv;

import java.util.Scanner;

public class task14
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]arr = new int[n];


        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int ind_max =0;
        int min = Integer.MAX_VALUE;
        int ind_min = 0;

        for (int i = 0; i < n; i++)
        {
            if(arr[i]>max){
                max = arr[i];
                ind_max = i;
            }

            if(arr[i]<min){
                min = arr[i];
                ind_min = i;
            }
        }

        arr[ind_min]=max;
        arr[ind_max]=min;

        for (int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }


    }
}