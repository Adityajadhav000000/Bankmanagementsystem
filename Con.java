package bank.management.system;

import java.sql.Connection;
import java.sql.*;

@SuppressWarnings("CallToPrintStackTrace")
public class Con {
    Connection connection;
    Statement statement ;

    public Con(){
        try{
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Pass@123");
          statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
