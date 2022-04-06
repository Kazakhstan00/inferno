package JDBC;

public class Items {
    private Long id;
    private String name;
    private double price;

    public Items(){}
    public Items(Long id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String toString(){
        return id+" "+name+" "+price;
    }
}