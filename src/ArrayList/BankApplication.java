package ArrayList;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(){
    }
    public BankApplication(String name, ArrayList accounts){
        this.name=name;
        this.accounts=accounts;
    }

    public String getName() {
        return name;
    }

    public ArrayList getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    } // Добавляет новый объект Account

    public void removeAccount(int i) {
        accounts.remove(i);
    }
    public Account getMaxAccount(){
        double maxBalance = 0;
        for(int i =0; i<accounts.size();i++){
            if(maxBalance<accounts.get(i).getBalance()){
                maxBalance=accounts.get(i).getBalance();
            }
        }
        return accounts.get(accounts.size()-1);
    }
    public double getAverageBalance() {
        double sum = 0;
        int count =0;
        for(int i=0; i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
            count++;
        }
        return sum/count;
    }
    private double getTotalBalance() {
        double sum = 0;

        for(int i=0; i<accounts.size();i++){
            sum=sum+accounts.get(i).getBalance();

        }
        return sum;
    }
    public int totalAccounts() {
        return accounts.size();
    }
    public String getBankData() {
        return name+" "+totalAccounts()+" "+getTotalBalance()+" "+getAverageBalance();

    }
}