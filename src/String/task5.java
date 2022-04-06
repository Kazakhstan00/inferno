package String;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char name1[] = new char[name.length()];
        int sum = 0;


        for (int i = 0; i<name.length();i++) {
            name1[i] = name.charAt(i);
            if (name1[i] == '1'){
                sum = sum + 1;
            }
            else if (name1[i] == '2'){
                sum = sum + 2;
            }
            else if (name1[i] == '3'){
                sum = sum + 3;
            }
            else if (name1[i] == '4'){
                sum = sum + 4;
            }
            else if (name1[i] == '5'){
                sum = sum + 5;
            }
            else if (name1[i] == '6'){
                sum = sum + 6;
            }
            else if (name1[i] == '7'){
                sum = sum + 7;
            }
            else if (name1[i] == '8'){
                sum = sum + 8;
            }
            else if (name1[i] == '9'){
                sum = sum + 9;
            }
        }
        System.out.println(sum);
    }
}