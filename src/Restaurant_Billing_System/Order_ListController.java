package Restaurant_Billing_System;

import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * Controls the option in Order List Page which retrieve data from the database
 * 
 */
public class Order_ListController {

    @FXML
    private TableView<Item> tableview;

    @FXML
    private TableColumn<Item, String> col1;

    @FXML
    private TableColumn<Item, Float> col2;

    @FXML
    private TableColumn<Item, String> col3;
    
    @FXML
    private AnchorPane background;
    
    @FXML
    private Button yo;
    
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
    private Button monthly_entry;

    @FXML
    private Button exit;
    
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
    private void click_takeorder(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Take_Order.fxml"));
        background.getChildren().setAll(pane);
        
        
    }
    
    /**
     * Go to HomePage 
     * @param event
     * @throws IOException 
     */
    @FXML
    private void click_homebutton(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
        background.getChildren().setAll(pane);
        
    }
    
    /**
     * Trigger Exit prompt
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


   
    Connection con;
    //com.mysql.jdbc.PreparedStatement pst;
    
    public ObservableList<Item> list=FXCollections.observableArrayList();
    
    //ObservableList<Item>list=FXCollections.observableArrayList(new Item("ABC",23,"giveup & die"));
    //tableview.setItems(list); 
    
    /**
     * Trigger the event to retrieve data from database
     * @param event
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    @FXML
    void click_yo(ActionEvent event) throws ClassNotFoundException, SQLException {
      

        Class.forName("com.mysql.jdbc.Driver");        
        con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root","root");
        
        Statement st = (Statement) con.createStatement();
        ResultSet res = st.executeQuery("Select* from order_list");
        
        
        while(res.next())
        {
            Date d=res.getDate("Date");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
            String strDate = dateFormat.format(d);
            Float am=res.getFloat("Amount");
            String use=res.getString("Username");
            
            System.out.println("Date "+d);
           
            //list=FXCollections.observableArrayList(new Item(strDate,am,use));
            
            list.add(new Item(strDate,am,use));
            tableview.setItems(list);
        
            col1.setCellValueFactory(new PropertyValueFactory<Item,String>("date"));
            col2.setCellValueFactory(new PropertyValueFactory<Item,Float>("amount"));
            col3.setCellValueFactory(new PropertyValueFactory<Item,String>("username"));
        
            tableview.setItems(list); 
        }
        
        con.close();        
    }
    
    
}

    

   

