package TextingFails;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Client {
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);


        while (true){

            System.out.println("PRESS [1] TO LIST goodS");
            System.out.println("PRESS [2] TO Buy good");
            System.out.println("PRESS [3] TO  LIST BUY HISTORY");
            System.out.println("PRESS [4] TO EXIT");


            String choice = in.next();

            if(choice.equals("1")) {

                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i<goodItems.size();i++){
                    System.out.println(goodItems.get(i));
                }
            }
            else if(choice.equals("2")){

                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i<goodItems.size();i++){
                    System.out.println(goodItems.get(i));
                }
                System.out.println("Choose index of product you want");
                int index = in.nextInt();
                ArrayList<BuyHistory> history = getBuyHistory();
                BuyHistory b = new BuyHistory(goodItems.get(index).getName(),goodItems.get(index).getPrice());
                history.add(b);
                saveHistory(history);

            }else if (choice.equals("3")){

                ArrayList<BuyHistory> history = getBuyHistory();
                for(int i = 0;i<history.size();i++){
                    System.out.println(history.get(i));
                }

            }else if (choice.equals("4")){

                System.exit(4); // Выход из программы

            }else{
                System.out.println("Wrong command!!!"); //Если вы ввели неверную команду
            }
        }
    }

    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("GoodItems.txt"));
            String line = "";
            while((line = br.readLine())!= null){
                String name = line;
                int price = Integer.parseInt(br.readLine());
                goodItems.add(new GoodItem(name,price));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return goodItems;
    }

    public static ArrayList<BuyHistory> getBuyHistory(){
        ArrayList<BuyHistory> history = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("buyHistory.txt"));
            String line = "";
            while((line = br.readLine())!= null){
                String goodName = line;
                int goodPrice = Integer.parseInt(br.readLine());
                String date = br.readLine();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
                Date result =  df.parse(date);
                BuyHistory buyHistory = new BuyHistory(goodName,goodPrice);
                buyHistory.setBuyTime(result);
                history.add(buyHistory);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return history;
    }

    public static void saveHistory(ArrayList<BuyHistory> history){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for(BuyHistory b : history){
                bw.write(b.getGoodName()+"\n");
                bw.write(b.getGoodPrice()+"\n");
                bw.write(b.getDate()+"\n");
            }
            bw.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
