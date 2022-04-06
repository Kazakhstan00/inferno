package ProjectBanks;

public class Database {

    public static BankAccount allAccounts[] = new BankAccount[10];

    static {

        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", "KZ010322312", "2222", 500000);
        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", "KZ010322313", "3333", 130000);
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev", "KZ0101116", "0006", 15000);
        allAccounts[3] = new CityBankAccount("Daniyar", "Bratan", "KZ010322314", "4444", 999999);
        allAccounts[4] = new CityBankAccount("Temer", "Bratiwka", "KZ010322315", "5555", 1500);
        allAccounts[5] = new NationalBankAccount("Askar Basek", "KZ0101115", "0005", 50000);
        allAccounts[6] = new CityBankAccount("Damir", "Zhuanyshev", "KZ010322316", "6666", 200000);
        allAccounts[7] = new CityBankAccount("Aibek", "Assanov", "KZ010322317", "7777", 100000);
        allAccounts[8] = new NationalBankAccount("Kazbek Zhubanyshev", "KZ0101114", "0004", 120000);
        allAccounts[9] = new NationalBankAccount("Messi Leonel", "KZ0101113", "3333", 999999);

    }

}