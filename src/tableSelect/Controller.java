package tableSelect;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;
import menu.MenuItem;
import menu.generateItems.OnStartGenerate;
import orderScreen.OrderScreenController;
import sceneController.SceneController;
import tables.Table;
import tables.TableController;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    private static ArrayList<MenuItem> menuItemArrayList;
    TableController tableController = new TableController();
    Scene windowScene;


    public Button tbl1Btn;
    public Button tbl2Btn;
    public Button tbl3Btn;
    public Spinner<Integer> noDinerSpinner;




    public void openOrderScreen(javafx.scene.input.MouseEvent mouseEvent) throws IOException {
        String text = ((Button)mouseEvent.getSource()).getText();
        Button clickedBtn = (Button) mouseEvent.getSource();
        windowScene = clickedBtn.getScene();

        tableController.addTable(new Table(text,noDinerSpinner.getValue()),text);
        tableController.changeTblStatus(text);

        if(mouseEvent.isControlDown()){
        if (tableController.checkTblStatus(text)) {
            //red
            changeColour(clickedBtn,"#ff0000");
        } else {
            changeColour(clickedBtn,"#00ff00");
        }
    }else {


            changeScene(text);
            //red
            changeColour(clickedBtn,"#ff0000");
        }
    }

    private void changeScene(String table) throws IOException {
        SceneController.sceneArrayList.add(0, windowScene);
        Stage currentStage = Start.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("../orderScreen/fxml/orderScreen.fxml"));
        currentStage.setTitle("OrderScreen");
        currentStage.setScene(new Scene(root, 1000, 500));
        OrderScreenController.setCurrentTable(table);
    }



    private void changeColour(Button button,String colour){
        button.setStyle("-fx-background-color: "+colour);
    }
}

