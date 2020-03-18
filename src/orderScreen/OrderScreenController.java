package orderScreen;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.dynalink.beans.StaticClass;
import sceneController.SceneController;
import tableSelect.Start;
import tables.Table;
import tables.TableController;

public class OrderScreenController {

    static String currentTableKey;
    static Table currentTable;

    public static void setCurrentTable(String table){
        currentTableKey = table;
        currentTable = TableController.getTable(table);
    }


    public void back(ActionEvent actionEvent) {
        Stage window = Start.getPrimaryStage();
        Scene scene = SceneController.sceneArrayList.get(0);
        window.setScene(scene);
    }

    public void showTable(ActionEvent actionEvent) {
        System.out.println(currentTable.getNumberOfDiners());

    }
}
