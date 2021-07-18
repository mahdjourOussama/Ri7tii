import java.sql.*;
import javax.swing.*;

public class MySql {
    Connection conn = null;
    public static String BDD="bdd";
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String unicode="?useUnicode=yes&characterEncoding=UTF-8";


      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+BDD+unicode,"root",""); //serveur

            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}