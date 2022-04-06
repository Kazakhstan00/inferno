package String;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String name1 = in.next();
        if (name1.equalsIgnoreCase(name)) {
            System.out.println("THEY ARE EQUAL");
        } else {
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}