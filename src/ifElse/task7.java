package ifElse;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();


        if ((a > 100) || (a < -100)) {
            System.out.println(0);
        } else {
            System.out.println(a+1);


        }
    }
}