package OOPclass.task1;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player []players;

    public Club(){
    }
    public Club(String name, String country, int ratingPoints, Player []players){
        this.name=name;
        this.country=country;
        this.ratingPoints=ratingPoints;
        this.players=players;
    }
    public void printClubData(){
        System.out.println("Club name:"+name+" country:"+country+" rating points:"+ratingPoints);
        System.out.println("Players:");
        for (int i=0;i<players.length;i++){
            System.out.println(players[i].toString());
        }
        System.out.println();
    }
}
