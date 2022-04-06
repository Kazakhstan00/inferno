package String;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char name1 = in.next().charAt(0);
        int count = 0;
        name=name.toLowerCase();
        for (int i = 0; i<name.length();i++) {
            if (name.charAt(i)==name1)

                count++;

        } System.out.println(count);
    }
}