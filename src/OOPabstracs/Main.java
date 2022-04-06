package OOPabstracs;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ERPSystem erpSystem = new ERPSystem();
        int cnt = 0;
        while(true){
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO LIST USER BY INDEX");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");
                int choice2 = in.nextInt();
                if(choice2==1){
                    System.out.println("Login:");
                    String login = in.next();
                    System.out.println("Password:");
                    String password = in.next();
                    System.out.println("Name:");
                    String name = in.next();
                    System.out.println("Surname:");
                    String surname = in.next();
                    System.out.println("Group:");
                    String group = in.next();
                    System.out.println("GPA:");
                    double gpa = in.nextDouble();
                    Student st = new Student();
                    erpSystem.addUser(st);
                    cnt++;

                }
                else if(choice2==2){
                    System.out.println("Login:");
                    String login = in.next();
                    System.out.println("Password:");
                    String password = in.next();
                    System.out.println("Nick Name:");
                    String nickName = in.next();
                    System.out.println("Status:");
                    String status = in.next();
                    Teacher tch = new Teacher();
                    erpSystem.addUser(tch);
                    cnt++;
                    while(true){
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                        int choice3 = in.nextInt();
                        if(choice3==1){
                            String subject = in.next();
                            tch.addSubject(subject);
                        }
                        else if(choice3==0){
                            break;
                        }
                    }

                }
            }
            else if(choice==2){
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                int choice4 = in.nextInt();
                if(choice4==1){
                    erpSystem.printStudents();
                }
                else if(choice4==2){
                    erpSystem.printTeachers();
                }
            }
            else if(choice==3){
                System.out.println("Index:");
                int index = in.nextInt();
                erpSystem.printUser(index);
            }
            else if(choice==0){
                break;
            }
        }

    }
}