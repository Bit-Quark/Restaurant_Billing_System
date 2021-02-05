package Restaurant_Billing_System;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Controls the button in Take Order page
 * 
 */
public class Take_OrderController {

    @FXML
    private AnchorPane background;

    @FXML
    private ListView<String> listview;
    public ObservableList<String> list=FXCollections.observableArrayList();
    
    @FXML
    private TextField Total;

    @FXML
    private VBox dashboard;

    @FXML
    private Label name;

    @FXML
    private Label name2;

    @FXML
    private Button homebutton;

    @FXML
    private Button monthlyentry;

    @FXML
    private Button orderlist;

    @FXML
    private Button exit;

    @FXML
    private Button delete;

    @FXML
    private Button bill;

    @FXML
    private Button chickenBBQ;

    @FXML
    private Button Binge;

    @FXML
    private Button Giganto;

    @FXML
    private Button Naga;

    @FXML
    private Button Smoky;

    @FXML
    private Button BeefBurger;

    @FXML
    private Button BeefSignature;

    @FXML
    private Button BingeBeef;

    @FXML
    private Button GigantoBeef;

    @FXML
    private Button choco;

    @FXML
    private Button kitkat;

    @FXML
    private Button oreo;

    @FXML
    private Button Hot;

    @FXML
    private Button Americana;

    @FXML
    private Button Latte;

    @FXML
    private Button Cappucino;

    @FXML
    private Button green;
   
    
   
    String selectedItem;
        
    public void initialize(URL url, ResourceBundle rb) {
        listview. getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        Total.setText("0");
        
        
    } 
    
    /**
     * Add Beef Burger to the list and increment the total amount
     * @param event 
     */
    @FXML
    void BeefBurgerOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[9]++;
        list.add("Beef Burger");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+180;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));     
    }
    
    /**
     * Add Binge Beef to the list and increment the total amount
     * @param event 
     */
    @FXML
    void BingeBeefOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[11]++;
        list.add("Binge Beef");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+260;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Chicken Binge to the list and increment the total amount
     * @param event 
     */
    @FXML
    void BingeOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[1]++;
        list.add("Chicken Binge");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+200;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Giganto Beef to the list and increment the total amount
     * @param event 
     */
    @FXML
    void GigantoBeefOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[12]++;
        list.add("Giganto Beef");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+400;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Giganto to the list and increment the total amount
     * @param event 
     */
    @FXML
    void GigantoOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[2]++;
        list.add("Giganto");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+300;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));


    }
    
    /**
     * Add Hot Chocolates to the list and increment the total amount
     * @param event 
     */
    @FXML
    void HotOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[8]++;
        list.add("Hot Chocolates");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+240;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Latte to the list and increment the total amount
     * @param event 
     */
    @FXML
    void LatteOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[14]++;
        list.add("Latte");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+200;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Naga Burst to the list and increment the total amount
     * @param event 
     */
    @FXML
    void NagaOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[3]++;
        list.add("Naga Burst");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+280;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Oreolacious to the list and increment the total amount
     * @param event 
     */
    @FXML
    void OreoOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[7]++;
        list.add("Oreolacious");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+220;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }

    /**
     * Add Beef SIgnature to the list and increment the total amount
     * @param event 
     */
    @FXML
    void SignatureOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[10]++;
        list.add("Beef Signature");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+310;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Smoky BBQ to the list and increment the total amount
     * @param event 
     */
    @FXML
    void SmokyOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[4]++;
        list.add("Smoky BBQ");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+200;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Americana to the list and increment the total amount
     * @param event 
     */
    @FXML
    void americanaOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[13]++;
        list.add("Americana");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+140;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Cappucino to the list and increment the total amount
     * @param event 
     */
    @FXML
    void cappucinoOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[15]++;
        list.add("Cappacino");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+160;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Chicken BBQ to the list and increment the total amount
     * @param event 
     */
    @FXML
    void chickenBBQOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[0]++;
        list.add("Chicken BBQ");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+180;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Chocolacious to the list and increment the total amount
     * @param event 
     */
    @FXML
    void chocoOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[5]++;
        list.add("Chocolacious");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+180;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Trigger the event to create bill and open receipt prompt
     * @param event 
     */
    @FXML
    void click_bill(ActionEvent event) throws IOException {
        
        listview.getItems().clear();
        Total.clear();
        
        Parent root = FXMLLoader.load(getClass().getResource("Receipt.fxml"));
        Scene scene = new Scene(root, 600,560);
        Stage stage = new Stage();
        stage.setTitle("Receipt");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    /**
     * Deletes an entry from the list
     * @param event 
     */
    @FXML
    void click_delete(ActionEvent event) {
        list.remove(selectedItem);
        
        System.out.println(selectedItem);
        if(selectedItem.equals("Chicken BBQ"))
        {
           Restaurant_Billing_System.product_counter[0]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-180;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
         if(selectedItem.equals("Chicken Binge"))
        {
           Restaurant_Billing_System.product_counter[1]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-200;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
          if(selectedItem.equals("Chicken Giganto"))
        {
           Restaurant_Billing_System.product_counter[2]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-300;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Naga Burst"))
        {
           Restaurant_Billing_System.product_counter[3]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-280;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Smoky BBQ"))
        {
           Restaurant_Billing_System.product_counter[4]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-200;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Beef Burger"))
        {
           Restaurant_Billing_System.product_counter[9]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-180;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Beef Signature"))
        {
           Restaurant_Billing_System.product_counter[10]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-310;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Binge Beef"))
        {
           Restaurant_Billing_System.product_counter[11]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-260;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Giganto Beef"))
        {
           Restaurant_Billing_System.product_counter[12]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-400;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Chocolacious"))
        {
           Restaurant_Billing_System.product_counter[5]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-180;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Kitkatlacious"))
        {
           Restaurant_Billing_System.product_counter[6]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-200;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Oreolacious"))
        {
           Restaurant_Billing_System.product_counter[7]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-220;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Hot Chocolates"))
        {
           Restaurant_Billing_System.product_counter[8]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-240;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Americana"))
        {
           Restaurant_Billing_System.product_counter[13]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-140;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Latte"))
        {
           Restaurant_Billing_System.product_counter[14]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-200;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Cappacino"))
        {
           Restaurant_Billing_System.product_counter[15]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-160;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        if(selectedItem.equals("Green Tea"))
        {
           Restaurant_Billing_System.product_counter[16]--;
           Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount-90;
           Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));
        }
        

    }
    
    /**
     * Triggers the exit prompt
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
     * Go to homepage
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_homebutton(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
        background.getChildren().setAll(pane);

    }
    
    /**
     * Go to Monthly Entry Page
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_monthlyentry(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Monthly_entry.fxml"));
        background.getChildren().setAll(pane);
    }
    
    /**
     * Go to Order List page
     * @param event
     * @throws IOException 
     */
    @FXML
    void click_orderlist(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Order_List.fxml"));
        background.getChildren().setAll(pane);
    }
    
    /**
     * Add Green Tea to the list and increment the total amount
     * @param event 
     */
    @FXML
    void greenOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[16]++;
        list.add("Green Tea");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+90;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Add Kitkatlacious to the list and increment the total amount
     * @param event 
     */
    @FXML
    void kitkatOnAction(ActionEvent event) {
        Restaurant_Billing_System.product_counter[6]++;
        list.add("Kitkatlacious");
        listview.setItems(list);
        Restaurant_Billing_System.total_amount=Restaurant_Billing_System.total_amount+200;
        Total.setText(String.valueOf(Restaurant_Billing_System.total_amount));

    }
    
    /**
     * Select an entry from the list
     * @param event 
     */
    @FXML
    void onMouseClicked(MouseEvent event) {
        selectedItem=listview.getSelectionModel().getSelectedItem().toString();
        String str=listview.getSelectionModel().getSelectedItem().toString();
        System.out.println(str);

    }

}
