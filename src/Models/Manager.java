package Models;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Manager extends User{
    
    public boolean addNewCashier(Cashier cashier){
        String sql = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.createConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, cashier.UserName);
            pst.setString(2, cashier.Password);
            pst.setString(3, cashier.Role);

            int rows = pst.executeUpdate();

            return rows > 0; 

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
