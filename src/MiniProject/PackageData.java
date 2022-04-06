package MiniProject;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    String operationType;
    ArrayList<Students> students;
    Students student;

    public PackageData(){
        this.operationType = "None";
    }

    public PackageData(String operationType){
        this.operationType = operationType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }
}