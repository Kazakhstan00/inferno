package OOPclass.task1;

public class task4 {
    public static void main(String[] args) {

        Player p1 = new Player(1, "Messi", "Leonel", "1st");
        Player p2 = new Player(2, "Cristiano", "Ronaldo", "2nd");
        Player p3 = new Player(3, "Mo", "Saalah", "3rd");
        Player p4 = new Player(4, "Samat", "Smakov", "4th");
        Player p5 = new Player(5, "Titi", "Esombo", "5th");
        Player[] players1 = {p1, p2, p3, p4, p5};

        Player r1 = new Player(1, "Vasya", "Ivanov", "1st");
        Player r2 = new Player(2, "Petya", "Sidorov", "2nd");
        Player r3 = new Player(3, "Stas", "Smirnov", "3rd");
        Player r4 = new Player(4, "Leha", "Petrov", "4th");
        Player r5 = new Player(5, "Ivan", "Bykov", "5th");
        Player[] players2 = {r1, r2, r3, r4, r5};

        Club club1 = new Club("Club1", "Kazakhstan", 100, players1);
        Club club2 = new Club("Club2", "Russia", 200, players2);

        Club[] clubs = {club1, club2};
        System.out.println("______________________________________________________");
        for(int i = 0; i < 2; i++){
            clubs[i].printClubData();
            System.out.println("______________________________________________________");
        }
    }
}