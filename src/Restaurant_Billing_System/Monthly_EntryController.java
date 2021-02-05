package Restaurant_Billing_System;

import java.sql.*;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Calendar;

/**
 * Controls the option in Monthly Entry page which is basically the inputiing the info 
 * into the database
 * 
 */
public class Monthly_EntryController {
    
    @FXML
    private AnchorPane background;

    @FXML
    private VBox dashboard;

    @FXML
    private Label name;

    @FXML
    private Label name2;

    @FXML
    private Button homebutton;

    @FXML
    private Button take_order;

    @FXML
    private Button orderlist;

    @FXML
    private Button exit;

    @FXML
    private TextField amount;

    @FXML
    private TextField remarks;

    @FXML
    private Button proceed;
    
    /**
     * Trigger the exit prompt
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_exit(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Exit_Window.fxml"));
        Scene scene = new Scene(root, 420,172);
        Stage stage = new Stage();
        stage.setTitle("Exit");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    /**
     * Go to the Homepage button
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_homebutton(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
        background.getChildren().setAll(pane);

    }

    /**
     * Go to Take Order page
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_takeorder(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Take_Order.fxml"));
        background.getChildren().setAll(pane);      
    }


    /**
     * Go to Order List Page
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_orderlist(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Order_List.fxml"));
        background.getChildren().setAll(pane);

    }
    
    
    /**
     * Save values to the database
     * @param event
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    @FXML
    void click_proceed(ActionEvent event) throws ClassNotFoundException, SQLException {
        
        Connection con;
        String a=amount.getText();
        float z = Float.parseFloat(a);
       
        String rem=remarks.getText();
        
        Class.forName("com.mysql.jdbc.Driver");        
        con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root","root");
        
        String local_un=Restaurant_Billing_System.un;

        try
        {
            amount.clear();
            remarks.clear();
            
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            // the mysql insert statement
            String query = " insert into monthly_entry (Date, Amount, Username, Remarks)"
              + " values (?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setDate (1, startDate);
            preparedStmt.setFloat (2, z);
            preparedStmt.setString (3, local_un);
            preparedStmt.setString (4, rem);

            // execute the preparedstatement
            preparedStmt.execute();

            con.close();
          }
        
           catch (Exception e)
           {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
           }
        
    }

}
