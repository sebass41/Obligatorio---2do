
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexión {
    String url ="jdbc:mysql://localhost:3306/";
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String database="tecnocolonia";
    public String usr="root";
    public String pass="sebas123456";
    
    Connection conn = null;
    Statement st = null;
    
    public Connection conectarMySQL()
    {
        try
        {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,usr,pass);
            conn.setCatalog(database);
            System.out.print("Conexion Establecida");
        }catch(ClassNotFoundException | SQLException e)
                {
                    e.printStackTrace();
                    System.out.print("Conexion no establecida");
        }
        return conn;
    }
}
