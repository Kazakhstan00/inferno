package OOPnasledovaniePolimorfizm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO ADD SUBJECTS OR COURSES");
            System.out.println("PRESS [4] TO LIST SUBJECTS OR COURSES OF A STUDENT OR STAFF");
            System.out.println("PRESS [0] TO EXIT");
            int n = in.nextInt();
            if (n == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF");
                int y = in.nextInt();
                if (y == 1) {
                    System.out.println("Insert name");
                    String name = in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert login");
                    String login = in.next();
                    System.out.println("Insert password");
                    String password = in.next();
                    System.out.println("Insert gpa");
                    double gpa = in.nextDouble();

                } else if (y == 2) {
                    System.out.println("Insert name");
                    String name = in.next();
                    System.out.println("Insert surname");
                    String surname = in.next();
                    System.out.println("Insert login");
                    String login = in.next();
                    System.out.println("Insert password");
                    String password = in.next();
                    System.out.println("Insert salary");
                    double salary = in.nextDouble();

                }
            } else if (n == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                int u = in.nextInt();
                if (u == 1) {
                    for (int i = 0; i < cnt; i++) {
                        if (arr.get(i) instanceof Student) {
                            System.out.println(arr.get(i).getData());
                        }
                    }
                } else if (u == 2) {
                    for (int i = 0; i < cnt; i++) {
                        if (arr.get(i) instanceof Staff) {
                            System.out.println(arr.get(i).getData());
                        }
                    }
                }

            } else if (n == 3) {
                System.out.println("PRESS [1] TO ADD COURSE TO STUDENT");
                System.out.println("PRESS [2] TO ADD SUBJECT TO STAFF");
                int e = in.nextInt();
                if (e == 1) {
                    System.out.println("Insert id of a student");
                    int o = in.nextInt();
                    System.out.println("Insert new course");
                    String j = in.next();
                    boolean foundStudent = false;
                    for (int i = 0; i < cnt; i++) {
                        if (arr.get(i) instanceof Student) {
                            if (arr.get(i).id == o) {
                                ((Student) arr.get(i)).addCourse(j);
                                foundStudent = true;
                            }
                        }
                    }
                    if (foundStudent) {
                        System.out.println("Course" + " " + j + " " + "is successfully added");
                    } else {
                        System.out.println("No such student");
                    }
                } else if (e == 2) {
                    System.out.println("Insert id of a staff");
                    int o = in.nextInt();
                    System.out.println("Insert new subject");
                    String j = in.next();
                    boolean foundStaff = false;
                    for (int i = 0; i < cnt; i++) {
                        if (arr.get(i) instanceof Staff) {
                            if (arr.get(i).id == o) {
                                ((Staff) arr.get(i)).addSubject(j);
                                foundStaff = true;
                            }
                        }
                    }
                    if (foundStaff) {
                        System.out.println("Subject" + " " + j + " " + "is successfully added");
                    } else {
                        System.out.println("No such staff");
                    }
                }
            }
            if (n == 4) {
                System.out.println("PRESS [1] TO LIST COURSES OF STUDENT");
                System.out.println("PRESS [2] TO LIST SUBJECTS OF STAFF");
                int g = in.nextInt();
                if (g == 1) {
                    System.out.println("Insert id of a student");
                    int p = in.nextInt();
                    for (int i = 0; i < cnt; i++) {
                        if (arr.get(i) instanceof Student) {
                            if (arr.get(i).id == p) {
                                System.out.println(arr.get(i).getName() + " " + arr.get(i).getSurname());
                                ((Student) arr.get(i)).getCourses();
                            }
                        }

                    }
                } else if (g == 2) {
                    System.out.println("Insert id of a staff");
                    int p = in.nextInt();
                    for (int i = 0; i < cnt; i++) {
                        if (arr.get(i) instanceof Staff) {
                            if (arr.get(i).id == p) {
                                System.out.println(arr.get(i).getName() + " " + arr.get(i).getSurname());
                                ((Staff) arr.get(i)).getSubjects();
                            }
                        }

                    }
                }
            } else if (n == 0) {
                break;
            }
        }
    }
}