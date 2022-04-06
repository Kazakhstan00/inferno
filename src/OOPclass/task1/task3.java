package OOPclass.task1;

import java.util.ArrayList;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student1> arr = new ArrayList<>();
        int a = 5;
        while (a != 0) {
            {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO LIST STUDENT");
                System.out.println("PRESS [0] TO EXIT");

                a = in.nextInt();
                if (a == 0) break;

                else if (a == 1) {
                    Student1 b = new Student1();
                    System.out.println("Insert name?");
                    b.name = in.next();
                    System.out.println("Insert surname?");
                    b.surname = in.next();
                    System.out.println("Insert GPA?");
                    b.gpa = in.nextDouble();
                    arr.add(b);
                } else if (a == 2) {
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.println(arr.get(i).getStudentData());
                    }
                }
            }
        }
    }
}