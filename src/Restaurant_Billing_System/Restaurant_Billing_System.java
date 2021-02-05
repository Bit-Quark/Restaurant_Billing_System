package Restaurant_Billing_System;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Main Class
 * 
 */
public class Restaurant_Billing_System extends Application{
    
    public static int total_amount=0;
    public static String un;
    public static int[ ] product_counter = new int[20];
    
    /**
     * Opens the login page 
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        //stage.setTitle("Home Page");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
    
     public static void main(String[] args){
        for (int j = 0; j < 17; j++) {
        product_counter[j]=0;
        }
        launch(args);
    }
    
}


        