
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
public static Connection connecrDb(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aku?autoReconnect=true&useSSL=false","root","meku1234");
        return conn;
    }
    catch(Exception e){ 
            JOptionPane.showMessageDialog(null, e);
            return null;
            } 
    

}    
    
}
