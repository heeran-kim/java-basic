package oop.ex;

public class Account {
    int balance;
    
    void deposit(int amount) {
        balance += amount;
    }
    
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("No balance.");
        } else {
            balance -= amount;
        }
    }
    
    void printBalance(){
        System.out.println("balance = " + balance);
    }
}
