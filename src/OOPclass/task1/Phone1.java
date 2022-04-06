package OOPclass.task1;

public class Phone1 {
    String name;
    String model;
    int price;

    public Phone1() {
    }

    public Phone1(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }


    public String getData(){
        return name+" "+model+" "+price;
    }
}
