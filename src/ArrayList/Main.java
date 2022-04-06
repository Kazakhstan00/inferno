package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(1, "Messi", "Leonel", 10000));
        accounts.add(new Account(2, "Cristiano", "Ronaldo", 10000));
        accounts.add(new Account(3, "Mohammed", "MoSalah", 7000));
        accounts.add(new Account(4, "Muller", "Muller", 36000));
        accounts.add(new Account(5, "Levandovski", "Levandovski", 10000));
        accounts.add(new Account(6, "Messi1", "Leonel1", 20000));
        accounts.add(new Account(7, "Cristiano1", "Ronaldo1", 2000));
        accounts.add(new Account(8, "Mohammed1", "MoSalah1", 8000));
        accounts.add(new Account(9, "Muller1", "Muller1", 26000));
        accounts.add(new Account(10, "Levandovski1", "Levandovski1", 2000));

        BankApplication bank = new BankApplication("bank", accounts);
        bank.setAccounts(accounts);

        ArrayList<Account> accounts1 = new ArrayList<>();
        accounts1.add(new Account(1, "Messi", "Leonel", 10000));
        accounts1.add(new Account(2, "Cristiano", "Ronaldo", 100000));
        accounts1.add(new Account(3, "Mohammed", "MoSalah", 70000));
        accounts1.add(new Account(4, "Muller", "Muller", 36000));
        accounts1.add(new Account(5, "Levandovski", "Levandovski", 10000));

        BankApplication bank1 = new BankApplication("bank1", accounts1);


        ArrayList<Account> accounts2 = new ArrayList<>();
        accounts2.add(new Account(1, "Messi", "Leonel", 10000));
        accounts2.add(new Account(2, "Cristiano", "Ronaldo", 10000));
        accounts2.add(new Account(3, "Mohammed", "MoSalah", 7000));
        accounts2.add(new Account(4, "Muller", "Muller", 36000));
        accounts2.add(new Account(5, "Levandovski", "Levandovski", 10000));

        BankApplication bank2 = new BankApplication("bank2", accounts2);
        bank.setAccounts(accounts2);

        ArrayList<BankApplication> banks = new ArrayList<>();
        banks.add(bank);
        banks.add(bank1);
        banks.add(bank2);

        BubbleSort(banks);
    }

    public static void BubbleSort(ArrayList<BankApplication> banks) {
        BankApplication temp = new BankApplication();
        // 1 2 3 4 5
        for (int i = 0; i < banks.size() - 1; i++) {
            for (int j = 0; j < banks.size() - 1 - i; j++) {
                if (banks.get(j).getAverageBalance() > banks.get(j + 1).getAverageBalance()) {
                    temp = banks.get(i);
                    banks.set(i, banks.get(i + 1));
                    banks.set(i + 1, temp);
                }
            }
        }

        for (int i = 0; i < banks.size(); i++) {
            System.out.println(banks.get(i).getBankData());
        }

    }
}