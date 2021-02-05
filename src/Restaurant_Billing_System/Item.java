package Restaurant_Billing_System;

/**
 * Created to store variables for tableview
 * 
 */
public class Item{
    
    String date;
    float amount;
    String username;
    
    /**
     * Constructor to initialize values
     * @param date
     * @param amount
     * @param username 
     */
    Item(String date, float amount, String username) {
        this.date = date;
        this.amount = amount;
        this.username = username;
    }
    
    /**
     * Get method for Date
     * @return Date 
     */
    public String getDate() {
        return date;
    }

    /**
     * Get method for Amount
     * @return Amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Get method for Username
     * @return Username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Set method for Date
     * @param date 
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
}