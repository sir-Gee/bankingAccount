package BankingApplication;

public class Deposit {

    public int depositMoney (int deposit){
        printDeposit(deposit);
        return deposit;
    }

    public void printDeposit(int deposit) {
        System.out.println("===============================");
        System.out.println("You deposited : " + deposit);
        System.out.println("===============================");
    }
}
