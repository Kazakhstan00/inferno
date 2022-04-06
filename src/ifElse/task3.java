package ifElse;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a%2==0) {
            System.out.println("EVEN");
        } else {

            System.out.println("ODD");

        }
    }
}