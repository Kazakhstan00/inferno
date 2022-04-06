package OdnomernyiCyckil;

import java.util.Scanner;

public class task6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c = in.nextInt();
        double v = in.nextInt();
        double b = 1, sum=0;
        double k = 0;
        while (c<= v) {
            sum+=c;
            c++;
            k++;

        } System.out.print(sum/k);
    }
}