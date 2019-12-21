
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class myfunctions {
        
     
        public static int datacounter(String tablename){
       int total = 0;
       Statement st;
       try
       {
       Connection conn= javaconnect.connecrDb();
       st =conn.createStatement();
       ResultSet rs=st.executeQuery("select count(*) as 'total' from " + tablename);
       while(rs.next()){
       total=rs.getInt(1);
       }
       }        catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
        
        } 
    
    return total;
    }     
    }
    
   
