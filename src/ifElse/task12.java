package ifElse;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        String text2 = in.next();
        if (text.equals("user") && text2.equals("qwerty")) {
            System.out.println("Authentication completed");
        } else {
            System.out.println("Invalid Login or Password");
        }
    }
}