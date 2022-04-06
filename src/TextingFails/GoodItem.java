package TextingFails;

public class GoodItem {
    private String name;
    private int price;

    public GoodItem(){}

    public GoodItem(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return name+" "+price;
    }
}