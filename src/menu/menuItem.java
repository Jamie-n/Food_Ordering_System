package menu;

public class menuItem {

    private String name;
    private String allergens;
    private Double price;
    private Integer calories;


    public menuItem(String name, String allergens, Double price, Integer calories) {
        this.name = name;
        this.allergens = allergens;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getCalories() {
        return calories;
    }

    public String getAllergens() {
        return allergens;
    }
}
