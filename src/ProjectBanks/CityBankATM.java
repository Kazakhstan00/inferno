package ProjectBanks;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш номер счета");
        String a = in.next();
        for(int i=0; i<Database.allAccounts.length; i++){
            if(a.equals(Database.allAccounts[i].getAccountNumber())){
                System.out.println("Введите ваш ПИН-Код");
                String a1 = in.next();
                if(Database.allAccounts[i] instanceof CityBankAccount){
                    if (a1.equals(Database.allAccounts[i].getPinCode())) {
                        int b = 8;
                        while (b != 6) {
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL, снять деньги");
                            System.out.println("PRESS [2] TO VIEW BALANCE, просмотр баланса");
                            System.out.println("PRESS [3] TO CHANGE PIN CODE, изменить пин код");
                            System.out.println("PRESS [4] TO CASH IN ACCOUNT, добавить деньги в счет");
                            System.out.println("PRESS [5] TO VIEW ACCOUNT DATA, просмотр данные счета");
                            System.out.println("PRESS [6] TO EXIT, выход");
                            b = in.nextInt();

                            if (b == 1) {
                                System.out.println("Введите сумму для снятия наличных");
                                int credit = in.nextInt();
                                if (Database.allAccounts[i].totalBalance() - credit > 0) {
                                    Database.allAccounts[i].creditBalance(credit);
                                } else if (Database.allAccounts[i].totalBalance() - credit < 0) {
                                    System.out.println("Недостаточно средств");
                                }

                            } else if (b == 2) {
                                System.out.println(Database.allAccounts[i].totalBalance());
                            } else if (b == 3) {
                                String b2 = in.next();
                                Database.allAccounts[i].setPinCode(b2);
                            } else if (b == 4) {
                                System.out.println("Введите сумму для добваления наличных");
                                int debet = in.nextInt();
                                Database.allAccounts[i].debetBalance(debet);
                            }else if(b==5) {
                                System.out.println(Database.allAccounts[i].accountData());
                            }else if(b==6){
                                break;
                            }
                        }
                    }else {
                        System.out.println("Неверный ПИН-Код");
                    }
                }else if(Database.allAccounts[i] instanceof NationalBankAccount){
                    if (a1.equals(Database.allAccounts[i].getPinCode())) {
                        int b = 8;
                        while (b != 3) {
                            System.out.println("PRESS [1] TO CASH WITHDRAWAL, снять деньги");
                            System.out.println("PRESS [2] TO VIEW BALANCE, просмотр баланса");
                            System.out.println("PRESS [3] TO EXIT, выход");
                            b=in.nextInt();
                            if(b==1){
                                System.out.println("Введите сумму для снятия наличных");
                                int credit = in.nextInt();
                                if (Database.allAccounts[i].totalBalance() - credit > 0) {
                                    Database.allAccounts[i].creditBalance(credit+200);
                                } else if (Database.allAccounts[i].totalBalance() - credit < 0) {
                                    System.out.println("Недостаточно средств");
                                }

                            } else if (b == 2) {
                                System.out.println(Database.allAccounts[i].totalBalance());
                            }else if(b==3){
                                break;
                            }
                        }

                    }
                }
            }
        }
    }
}