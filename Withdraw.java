package BankingApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Withdraw extends BankOperationManager{

    public int moneyWithdrawn (int qtyWithdrawn){
        System.out.println("You withdrawn : " + qtyWithdrawn);
        return qtyWithdrawn;
    }

    }

