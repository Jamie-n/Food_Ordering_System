package tables;

import java.util.ArrayList;

public class Table {

    private String tableNumber;
    private Integer numberOfDiners;
    private ArrayList<Customer> customersOnTable;
    private Boolean occupied;

    public Table(String tableNumber, Integer numberOfDiners, ArrayList<Customer> customersOnTable) {
        this.tableNumber = tableNumber;
        this.numberOfDiners = numberOfDiners;
        this.customersOnTable = customersOnTable;
    }

    public Table(String tableNumber, Integer numberOfDiners) {
        this.tableNumber = tableNumber;
        this.numberOfDiners = numberOfDiners;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Table(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public Integer getNumberOfDiners() {
        return numberOfDiners;
    }

    public ArrayList<Customer> getCustomersOnTable() {
        return customersOnTable;
    }

    public void AddCustomerToTbl (Customer customer){
        customersOnTable.add(customer);
    }

    public void RemoveCustomerTbl(Customer pos){
        customersOnTable.remove(pos);
    }
}
