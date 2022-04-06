package ProjectBanks;

import java.util.SplittableRandom;

public class CityBankAccount implements BankAccount{
    private String name;
    private String surname;
    private String accountNumber;
    private String pinCode;
    private int balance;

    public CityBankAccount(){
    }
    public CityBankAccount(String name, String surname, String accountNumber, String pinCode, int balance){
        this.name=name;
        this.surname=surname;
        this.accountNumber=accountNumber;
        this.pinCode=pinCode;
        this.balance=balance;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode=pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (balance - credit < 0) {
            System.out.println("Error404");
        } else {
            balance = balance - credit;
        }
    }

    @Override
    public void debetBalance(int debet) {
        balance=balance+debet;
    }

    @Override
    public String accountData() {
        return name+" "+surname;
    }
}