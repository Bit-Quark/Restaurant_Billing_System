package Restaurant_Billing_System;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Provide YES or NO option for Exit Window
 */
public class Exit_WindowController implements Initializable {

    @FXML
    private AnchorPane background;
    @FXML
    private AnchorPane color_half_back;
    @FXML
    private Button yes;
    @FXML
    private Button no;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * The prompt will be closed
     * @param event 
     */
    @FXML
    private void click_yes(ActionEvent event) {
        System.exit(0);
    }
    
    /**
     * The prompt will not be closed 
     * @param event 
     */
    @FXML
    private void click_no(ActionEvent event) {
        Stage stage = (Stage) no.getScene().getWindow();
        stage.close();
    }
    
}
