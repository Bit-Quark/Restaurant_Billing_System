package Restaurant_Billing_System;

import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

/**
 * Controller class for Login Prompt - Signing up to the system and use the features
 * 
 */
public class LoginController implements Initializable {

    @FXML
    private AnchorPane background;
    @FXML
    private AnchorPane coloured_half_back;
    @FXML
    private PasswordField password_field;
    @FXML
    private TextField username_field;
    @FXML
    private Button sign_in_button;
    @FXML
    private Label login_label;
    @FXML
    private Label Name;
    @FXML
    private Label rest_name;
    
    Connection con;
    PreparedStatement pst;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * Matches the username & password to the existing database and provide permission to log in 
     * @param event
     * @throws IOException
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    @FXML
    private void click_sign_in(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        
        boolean flag=false;
        boolean flagx=false;
        
        String uname = username_field.getText();
        String pass = password_field.getText();
        
        if(uname.equals("") && pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username or Password blank");
            flagx=true;
            
        }       
        
        Class.forName("com.mysql.jdbc.Driver");        
        con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root","root");
        
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("SELECT * FROM  login");
        
        while(res.next())
        {
            String name=res.getString("Username");
            String passw=res.getString("Password");
           
         
            if(name.equals(uname) && passw.equals(pass))
            {
                flag=true;
                Restaurant_Billing_System.un=uname;
                
                AnchorPane pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
                background.getChildren().setAll(pane);
            }
             
        }      
        if(!flag && !flagx)
        {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password");
        }
        
        con.close();
    }        
}
 
    

