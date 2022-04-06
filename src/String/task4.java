package String;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char name1[] = new char[name.length()];



        for (int i = 0; i<name.length();i++) {
            name1[i] = name.charAt(i);
            if (name1[i] == 'a')
                name1[i] = 'o';
        }
        name=new String(name1);
        System.out.println(name);
    }
}