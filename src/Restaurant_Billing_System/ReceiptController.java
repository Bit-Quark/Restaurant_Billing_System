package Restaurant_Billing_System;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.*;

public class ReceiptController {

    @FXML
    private AnchorPane background;

    @FXML
    private ListView<String> listview2;
    public ObservableList<String> list=FXCollections.observableArrayList();

    @FXML
    private TextField totalfield;

    @FXML
    private Button ok;
    
    @FXML
    private Button confirm;
    
    
    
    public void initialize(URL url, ResourceBundle rb) {
        listview2. getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        totalfield.setText("0");
    } 
    
    /**
     * Trigger the event to generate bill 
     * @param event 
     */
    @FXML
    void click_confirm(ActionEvent event) {
        int quant;
        String tuple="";
        
        if(Restaurant_Billing_System.product_counter[0]>0)
        {
            quant=Restaurant_Billing_System.product_counter[0];
            tuple="Chicken Burger"+"\n"+quant+"*180"+ "-------------------------------"+quant*180;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[1]>0)
        {
            quant=Restaurant_Billing_System.product_counter[1];
            tuple="Chicken Binge"+"\n"+quant+"*200"+ "-------------------------------"+quant*200;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[2]>0)
        {
            quant=Restaurant_Billing_System.product_counter[2];
            tuple="Giganto"+"\n"+quant+"*300"+ "-------------------------------"+quant*300;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[3]>0)
        {
            quant=Restaurant_Billing_System.product_counter[3];
            tuple="Naga Burst"+"\n"+quant+"*280"+ "-------------------------------"+quant*280;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[4]>0)
        {
            quant=Restaurant_Billing_System.product_counter[4];
            tuple="Smoky BBQ"+"\n"+quant+"*200"+ "-------------------------------"+quant*200;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[5]>0)
        {
            quant=Restaurant_Billing_System.product_counter[5];
            tuple="Chocolacious"+"\n"+quant+"*180"+ "-------------------------------"+quant*180;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[6]>0)
        {
            quant=Restaurant_Billing_System.product_counter[6];
            tuple="Kitkatlacous"+"\n"+quant+"*200"+ "-------------------------------"+quant*200;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[7]>0)
        {
            quant=Restaurant_Billing_System.product_counter[7];
            tuple="Oreolacious"+"\n"+quant+"*220"+ "-------------------------------"+quant*220;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[8]>0)
        {
            quant=Restaurant_Billing_System.product_counter[8];
            tuple="Hot Chocolates"+"\n"+quant+"*240"+ "-------------------------------"+quant*240;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[9]>0)
        {
            quant=Restaurant_Billing_System.product_counter[9];
            tuple="Beef Burger"+"\n"+quant+"*180"+ "-------------------------------"+quant*180;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[10]>0)
        {
            quant=Restaurant_Billing_System.product_counter[10];
            tuple="Beef Signature"+"\n"+quant+"*310"+ "-------------------------------"+quant*310;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[11]>0)
        {
            quant=Restaurant_Billing_System.product_counter[11];
            tuple="Binge Beef"+"\n"+quant+"*260"+ "-------------------------------"+quant*260;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[12]>0)
        {
            quant=Restaurant_Billing_System.product_counter[12];
            tuple="Giganto Beef"+"\n"+quant+"*400"+ "-------------------------------"+quant*400;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[13]>0)
        {
            quant=Restaurant_Billing_System.product_counter[13];
            tuple="Americano"+"\n"+quant+"*140"+ "-------------------------------"+quant*140;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[14]>0)
        {
            quant=Restaurant_Billing_System.product_counter[14];
            tuple="Latte"+"\n"+quant+"*200"+ "-------------------------------"+quant*200;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[15]>0)
        {
            quant=Restaurant_Billing_System.product_counter[15];
            tuple="Cappucino"+"\n"+quant+"*160"+ "-------------------------------"+quant*160;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        if(Restaurant_Billing_System.product_counter[16]>0)
        {
            quant=Restaurant_Billing_System.product_counter[16];
            tuple="Green Tea"+"\n"+quant+"*90"+ "-------------------------------"+quant*90;
            list.add(tuple);
            listview2.setItems(list);
        }
        
        totalfield.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Close the receipt prompt, save values to the Order list database & clears the previous values
     * @param event
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    @FXML
    void click_okay(ActionEvent event) throws ClassNotFoundException, SQLException {
        
        Connection con;
        String a=totalfield.getText();
        float z = Float.parseFloat(a);
       
        //String rem=remarks.getText();
        
        Class.forName("com.mysql.jdbc.Driver");        
        con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root","root");
        
        String local_un=Restaurant_Billing_System.un;

        try
        {
            //.clear();
            //remarks.clear();
            
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            // the mysql insert statement
            String query = "insert into order_list (Date, Amount, Username)"
              + " values (?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setDate (1, startDate);
            preparedStmt.setFloat (2, z);
            preparedStmt.setString (3, local_un);
            //preparedStmt.setString (4, rem);

            // execute the preparedstatement
            preparedStmt.execute();

            con.close();  
            
            for(int i=0;i<17;i++)
            {
                Restaurant_Billing_System.product_counter[i]=0;
            }
          
        
        }
        catch (Exception e)
           {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
           }
        
        Stage stage = (Stage) ok.getScene().getWindow();
        stage.close();
        
        Restaurant_Billing_System.total_amount=0;
    }


}
