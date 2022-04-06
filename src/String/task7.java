package String;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();


        for (String part : name.split(" ")) {

            System.out.print(new StringBuilder(part).reverse().toString());
            System.out.print(" ");
        }
    }
}