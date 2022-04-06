package OdnomernyiCyckil;

import java.util.Scanner;

public class task13{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int sum = 0;

        while (k!=0) { if(k%2!=0)
            sum+=k;
            k=in.nextInt();


        }System.out.println(sum);
    }
}