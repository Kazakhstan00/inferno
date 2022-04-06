package OOPclass.task1;

public class task2 {
    public static void main(String[] args) {
        Student p1 = new Student();
        Student p2 = new Student(1, "Bratiwka", "Petrov", 3.5);
        //System.out.println(p2.getStudentData());
        Student p3 = new Student(2, "Temer", "Volkov", 3.0);
        //System.out.println(p3.getStudentData());
        Student p4 = new Student(3, "Alish", "Stepanov", 3.1);
        //System.out.println(p4.getStudentData());
        Student p5 = new Student(4, "Alim", "Vaskov", 3.9);
        //System.out.println(p5.getStudentData());
        Student p6 = new Student(5, "Borya", "Ahmetov", 3.87);
        //System.out.println(p6.getStudentData());

        Student[] i = {p2, p3, p4, p5, p6};

        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j].getStudentData());
        }
    }
}
