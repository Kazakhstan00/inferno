package OOPabstracs;

public class Teacher extends User{
    String nickName;
    String status; //// например: Professor, Lecturer, Tutor, Assistant.
    String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    int sizeOfSubjects = 0;

    public Teacher(){
    }
    public Teacher(String nickName, String status, String[] subjects, int sizeOfSubjects){
        this.nickName=nickName;
        this.status=status;
        this.subjects=subjects;
        this.sizeOfSubjects=sizeOfSubjects;
    }
    public String getNickName() {
        return nickName;
    }
    public String getStatus() {
        return status;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects]=subject;
        sizeOfSubjects++;
    }
    @Override
    String getUserData() {
        return nickName+" "+status+" "+subjects+" "+sizeOfSubjects;
    }
}
