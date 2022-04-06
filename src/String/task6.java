package String;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String name2 = in.next();
        String resp = "";
        char name1[] = new char[name.length()];

        for (int i = 0; i < name.length(); i++) {
            name1[i] = name.charAt(i);
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            resp = resp + name1[i];
        }
        if (name2.equals(resp)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}