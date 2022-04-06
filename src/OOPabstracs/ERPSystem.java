package OOPabstracs;

public class ERPSystem {
    User[] memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;
    public ERPSystem(){
        this.memory = new User[1000];
        this.sizeOfUsers = 0;
    }

    public void addUser(User user){
        memory[sizeOfUsers]=user;
        sizeOfUsers++;
    }
    public void printStudents(){
        for(int i=0;i<sizeOfUsers;i++){
            if(memory[i] instanceof Student){
                System.out.println(memory[i].getUserData());
            }

        }

    }
    public void printTeachers(){
        for(int i=0;i<sizeOfUsers;i++){
            if(memory[i] instanceof Teacher){
                System.out.println(memory[i].getUserData());
                System.out.println(((Teacher) memory[i]).getSubjects());
            }

        }

    }
    public void printUser(int index){
        boolean found = false;
        for(int i=0;i<sizeOfUsers;i++){
            if(index==i){
                found = true;
                if(memory[i] instanceof Student){
                    System.out.println(memory[i].getUserData());
                }
                else if(memory[i] instanceof Teacher){
                    System.out.println(memory[i].getUserData());
                    System.out.println(((Teacher) memory[i]).getSubjects());
                }
            }

        }
        if(!found){
            System.out.println("No such user");
        }
    }

}
