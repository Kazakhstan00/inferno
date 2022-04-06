package Serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        while (true){

            System.out.println("PRESS [1] TO CREATE GAME");
            System.out.println("PRESS [2] TO ADD PLAYER TO GAME");
            System.out.println("PRESS [3] TO PLAY GAME");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println(" Game name:");
                String name = in.next();

                System.out.println(" IP address:");
                String address = in.next();

                System.out.println("PORT:");
                int port = in.nextInt();

                ArrayList<Game> games = loadGames();
                games.add(new Game(name, address, port));
                saveGames(games);




            }else if(choice.equals("2")){
                ArrayList<Game> games = loadGames();
                System.out.println("CHOOSE GAME:");
                System.out.println("Nickname:");
                String nickName = in.next();
                System.out.println("Rating:");
                double rating = in.nextDouble();
                System.out.println("Which Game?");
                String gameName = in.next();

                for(int i =0; i<games.size();i++){
                    if(games.get(i).getGameName().equals(gameName)){
                        games.get(i).getPlayers().add(new Players(nickName, rating));
                    }
                }
                saveGames(games);
            }

            else if (choice.equals("3")){
                System.out.println("CHOOSE GAME:");
                ArrayList<Game> games = loadGames(); //1,2,3

                for(int i=0;  i<games.size();i++){
                    System.out.println(i+1+") " +games.get(i).toString());
                }
                int m = in.nextInt();
                System.out.println(games.get(m-1).toString());

                System.out.println("NickName:");
                String nickName = in.next();
                System.out.println("Rating: ");
                double rating = in.nextDouble();
                Players pl = new Players(nickName, rating);
                games.get(m-1).addPlayer(pl);
                saveGames(games);




                ////////kak voiti v igru???

            }else if (choice.equals("0")){

                System.exit(0); // Выход из программы

            }else{
                System.out.println("Wrong command!!!"); //Если вы ввели неверную команду
            }
        }
    }

    public static void saveGames(ArrayList<Game> games){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("games.data"));
            outStream.writeObject(games);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<Game> loadGames(){
        ArrayList<Game> games = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("games.data"));
            games = (ArrayList<Game>) inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return games;
    }
}