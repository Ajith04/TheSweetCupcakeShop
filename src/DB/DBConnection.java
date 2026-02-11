package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String Url = "jdbc:mysql://localhost:3306/thesweetcupcakeshop";
    private static final String UserName = "root";
    private static final String Password = "";

    public static Connection createConnection() {
        try {
            return DriverManager.getConnection(Url, UserName, Password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
