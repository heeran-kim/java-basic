package oop.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.deposit(10000);
        myAccount.withdraw(9000);
        myAccount.withdraw(2000);
        // myAccount.printBalance();
        System.out.println("myAccount.balance = " + myAccount.balance);
    }
}
