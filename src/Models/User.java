package Models;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class User {
    public static String UserName;
    public static String Password;
    public static String Role; 
    
    public ResultSet login(User user) throws SQLException{
        
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        
        Connection con = DBConnection.createConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, User.UserName);
        pst.setString(2, User.Password);

        ResultSet rs = pst.executeQuery();
        return rs;
        
    }
    
    public boolean addCupcake(Cupcake cupcake) {

        String sql = "INSERT INTO cupcakes (name, flavor, category, price) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.createConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, cupcake.getName());
            pst.setString(2, cupcake.getFlavor());
            pst.setString(3, cupcake.getCategory());
            pst.setDouble(4, cupcake.getPrice());

            int rows = pst.executeUpdate();

            return rows > 0; 

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ResultSet viewAllCupcakes() throws SQLException{
        
        String sql = "SELECT * FROM cupcakes";
        
        Connection con = DBConnection.createConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
    
    public ResultSet searchCupcakes(String searchText) throws SQLException{
        
        String sql = "SELECT * FROM cupcakes WHERE name LIKE ? OR flavor LIKE ? OR category LIKE ?";
        String keyword = "%" + searchText + "%";
        
        Connection con = DBConnection.createConnection();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, keyword);
        pst.setString(2, keyword);
        pst.setString(3, keyword);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
    
    
}
