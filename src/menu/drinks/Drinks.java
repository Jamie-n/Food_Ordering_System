package menu.drinks;

import menu.menuItem;

import java.util.function.DoubleToIntFunction;

public class Drinks extends menuItem {



    private String type;
    private Integer size;
    private Boolean alcoholic;
    private Double alcContent;

    public Drinks(String name, String allergens, Double price, Integer calories, String type, Integer size, Boolean alcoholic, Double alcContent) {
        super(name, allergens, price, calories);
        this.type = type;
        this.size = size;
        this.alcoholic = alcoholic;
        this.alcContent = alcContent;
    }

    public Integer getSize() {
        return size;
    }

    public Boolean getAlcoholic() {
        return alcoholic;
    }

    public Double getAlcContent() {
        return alcContent;
    }
}
