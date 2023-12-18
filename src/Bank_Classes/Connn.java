package Bank_Classes;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bharatBank","root","123456");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}