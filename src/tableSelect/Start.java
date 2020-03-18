package tableSelect;

import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import menu.generateItems.OnStartGenerate;

public class Start extends Application {
    private static Stage primaryStage;

    private void setPrimaryStage(Stage stage){
        Start.primaryStage = stage;
    }

    static public Stage getPrimaryStage(){
        return Start.primaryStage;
    }



    @Override
    public void start(Stage primaryStage) throws Exception{
        setPrimaryStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("fxml/tableSelect.fxml"));
        primaryStage.setTitle("Table Screen");
        primaryStage.setScene(new Scene(root, 1000, 500));
        primaryStage.show();


        OnStartGenerate.parseMenuCsv();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
