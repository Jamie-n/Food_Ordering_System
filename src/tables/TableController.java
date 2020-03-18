package tables;

import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.Hashtable;

public class TableController{

   private static Hashtable<String,Table> tableHashtable = new Hashtable<>();



    public void addTable(Table table,String key) {
        if (tableHashtable.containsKey(key)) {

        } else {
            tableHashtable.put(table.getTableNumber(), table);
            table.setOccupied(false);
        }
    }

    public static Table getTable(String key){
        return tableHashtable.get(key);
    }

    public Boolean checkTblStatus(String key){
        return tableHashtable.get(key).getOccupied();
    }

    public void changeTblStatus(String key){
        if(tableHashtable.get(key).getOccupied()){
            tableHashtable.get(key).setOccupied(false);
        }else{
            tableHashtable.get(key).setOccupied(true);
        }
    }




}
