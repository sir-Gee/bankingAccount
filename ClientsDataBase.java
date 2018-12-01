package BankingApplication;

import java.util.ArrayList;

public class ClientsDataBase {
  private String [] clientsNames = {"ivanov", "petrov"};


    public void setClientsNames(String[] clientsNames) {
        this.clientsNames = clientsNames;
    }

    public String[] getClientsNames() {
        return clientsNames;
    }
}