package menu.generateItems;

import jdk.dynalink.beans.StaticClass;
import menu.MenuItem;
import menu.drinks.Drinks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OnStartGenerate {

    static ArrayList<MenuItem> menuItems = new ArrayList<>();



    public static void parseMenuCsv(){

        ArrayList<MenuItem> menuItemArrayList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/res/menuCsvs/assingmentDrinksMenu.csv"))){
            String line;
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");

                String name = values[0];
                String allegens = values[1];
                Double price = Double.parseDouble(values[2]);
                Integer calories  = Integer.parseInt(values[3]);
                String type = values[4];
                Integer size = Integer.parseInt(values[5]);
                Boolean alcoholic = Boolean.parseBoolean(values[6]);
                Double alcContent = Double.parseDouble(values[7]);

                menuItemArrayList.add(new Drinks(name,allegens,price,calories,type,size,alcoholic,alcContent));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        menuItems = menuItemArrayList;
    }


}
