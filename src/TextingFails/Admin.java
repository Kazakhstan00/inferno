package TextingFails;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);

        while (true){

            System.out.println("PRESS [1] TO ADD good");
            System.out.println("PRESS [2] TO LIST goodS");
            System.out.println("PRESS [3] TO DELETE goodS");
            System.out.println("PRESS [4] TO EXIT");


            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name");
                String name = in.next();

                System.out.println("Insert price");
                int price = in.nextInt();

                GoodItem GI = new GoodItem(name, price);
                ArrayList<GoodItem> goodItems = readGoodItems();
                goodItems.add(GI);
                saveGoodItems(goodItems);

            }else if(choice.equals("2")){

                ArrayList<GoodItem> goodItems = readGoodItems();
                for (int i = 0; i<goodItems.size(); i++) {
                    System.out.println((i+1) + ") "+goodItems.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
                }

            }else if (choice.equals("3")){

                ArrayList<GoodItem> goodItems = readGoodItems();
                for (int i = 0; i<goodItems.size(); i++) {
                    System.out.println((i+1) + ") "+goodItems.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
                }

                System.out.println("Insert index of player to delete: ");
                int index = in.nextInt(); //Вводим порядковый номер игрока из списка от 1 до размера
                goodItems.remove(index-1);

                saveGoodItems(goodItems);


            }else if (choice.equals("4")){

                System.exit(4); // Выход из программы

            }else{
                System.out.println("Wrong command!!!"); //Если вы ввели неверную команду
            }
        }
    }

    public static void saveGoodItems(ArrayList<GoodItem> goodItems){
        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter("GoodItems.txt"));
            //Цикл foreach. Добавим в конце \n. Каждый параметр будет записан в каждой строке.
            for (GoodItem g : goodItems) {
                bw.write(g.getName()+"\n");
                bw.write(g.getPrice()+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Создадим метод который не просто будет считывать, а будет полностью конвертировать данные обратно в ArrayList<Player>
    public static ArrayList<GoodItem> readGoodItems(){
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("GoodItems.txt"));
            String name = "";
            while((name = br.readLine())!=null){ //Первая линия всегда будет именем игрока

                int price = Integer.parseInt(br.readLine());

                //Вытягиваем цену сконвертировав в int
                goodItems.add(new GoodItem(name, price)); //Заново создаем новый объект игрока и добавляем в массив

            }
        }catch (Exception e){

        }
        return goodItems;
    }
}