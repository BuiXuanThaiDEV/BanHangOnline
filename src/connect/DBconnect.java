package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            String user ="root";
            String password = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoponlinedb", user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }
}

