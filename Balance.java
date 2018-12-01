package BankingApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Balance {
    private int balance;

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public Balance() {
        this.balance = 0;

    }

    public void printBalance() {
        System.out.println("===============================");
        System.out.println("Your balance : " + balance);
        System.out.println("===============================" + "\n");
    }


}

