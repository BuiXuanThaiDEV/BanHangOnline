
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static connect.DBconnect.getConnection;

class DataMysql {

    int insertDataProduct(String name, int type,int number, int price){
        Connection connect1 = getConnection();
        PreparedStatement prepStmt =null;
        try{
            String query = "INSERT INTO product (name,type,price,number) VALUES (?,?,?,?)";
            prepStmt = connect1.prepareStatement(query);
            prepStmt.setString(1,name);
            prepStmt.setInt(2,type);
            prepStmt.setInt(3,price);
            prepStmt.setInt(4,number);

            prepStmt.execute();
            connect1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }


}

