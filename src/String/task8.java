package String;

import java.util.Scanner;

public class task8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String digit = String.valueOf(s1.charAt(0));
        String letter = String.valueOf(s1.charAt(1));
        int digit2 = Integer.parseInt(digit) *2;
        s1 = letter+digit2;
        System.out.println(s1);
    }
}