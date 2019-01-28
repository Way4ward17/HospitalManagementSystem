import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    public static Connection ConnecrDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/way4ward","root","");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
