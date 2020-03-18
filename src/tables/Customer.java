package tables;

import menu.MenuItem;

import java.util.ArrayList;

public class Customer {

    private String name;
    private Integer tabTotal;
    private ArrayList<MenuItem> tab;


    public Customer(String name, Integer tabTotal, ArrayList<MenuItem> tab) {
        this.name = name;
        this.tabTotal = tabTotal;
        this.tab = tab;
    }

    private void addMenuItem(MenuItem item ){
        tab.add(item);
    }

    private void removeMenuItem(Integer pos){
        tab.remove(pos);
    }

    public ArrayList<MenuItem> getTab() {
        return tab;
    }

    public String getName() {
        return name;
    }

    public Integer getTabTotal() {
        return tabTotal;
    }


}
