package tables;

public class Customer {

    private String name;
    private Integer tab;


    public Customer(String name, Integer tab) {
        this.name = name;
        this.tab = tab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTab() {
        return tab;
    }

    public void setTab(Integer tab) {
        this.tab = tab;
    }

}
