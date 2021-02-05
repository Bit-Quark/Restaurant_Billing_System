package Restaurant_Billing_System;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Provides the options in homepage
 *
 * 
 */
public class HomeController implements Initializable {

    @FXML
    private AnchorPane background;
    @FXML
    private AnchorPane color_back_half;
    @FXML
    private Button Monthly_Entry;
    @FXML
    private Button Take_Order;
    @FXML
    private Button Order_List;
    @FXML
    private Label Name;
    @FXML
    private Label rest_name;
    /*
    @FXML
    private ImageView monthly_entry_image;
    @FXML
    private ImageView take_order_image;
    @FXML
    private ImageView order_image;
    @FXML
    private ImageView exit_image;
    @FXML
    private Button exit_button;
    */
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * Go to Monthly Entry Page
     * @param event
     * @throws IOException 
     */
    @FXML
    private void click_monthly_entry(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("Monthly_Entry.fxml"));
         background.getChildren().setAll(pane);
    }
    
    /**
     * Go to Take Order Page
     * @param event
     * @throws IOException 
     */
    @FXML
    private void click_take_order(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Take_Order.fxml"));
        background.getChildren().setAll(pane);
        
        
    }
    
    /**
     * Go to Order list Page
     * @param event
     * @throws IOException 
     */
    @FXML
    private void click_order_list(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Order_List.fxml"));
        background.getChildren().setAll(pane);
        
    }
    
    /**
     * Opens Exit Prompt
     * @param event
     * @throws IOException 
     */
    @FXML
    private void click_exit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Exit_Window.fxml"));
        Scene scene = new Scene(root, 420,172);
        Stage stage = new Stage();
        stage.setTitle("Exit");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
    
}
