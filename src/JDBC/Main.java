package JDBC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();

        while(true){

            System.out.println("[1] TO ADD ITEMS");
            System.out.println("[2] TO LIST ITEMS");
            System.out.println("[3] TO DELETE ITEMS");
            System.out.println("[0] EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price: ");
                double price = in.nextInt();



                //Именно поэтому мы и сделали Long id. Чтобы передавать в конструктор null.
                Items items = new Items(null, name, price);
                db.addItems(items);

            }else if(choice.equals("2")){

                ArrayList<Items> items = db.getAllItems();

                for (Items c : items) {
                    System.out.println(c);
                }



            }else if(choice.equals("3")){

                System.out.println("Insert id: ");
                Long id = in.nextLong();
                db.deleteItems(id);

            }else if(choice.equals("0")){
                System.exit(0);
            }
        }
    }
}