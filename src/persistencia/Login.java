
package persistencia;

import java.sql.ResultSet;
import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;

public class Login {
    public boolean login(String usr, String pass){
        Conexión con = new Conexión();
        
        int i=0;
        con.conectarMySQL();
        String sentencia = "SELECT * FROM usuario WHERE USUARIO = '" + usr + "' AND CONTRASEÑA = '" + pass + "'"; //Utilizo la sentencia select para traer los datos de la tabla usuario
        
        try {
           PreparedStatement st = null;
           st= con.conn.prepareStatement(sentencia);
           
           ResultSet rs = st.executeQuery(); //Ejecuto la sentencia SQL
           
           while (rs.next()){ // Recorro el ResultSet con los datos obtenidos de la base de datos
               i++; // En el caso que haya algo, incremento el contador
           }
           
           if (i > 0){ //Pregunto si el contador se incrementó
               return true;
           }else {
               return false;
           }
        } catch (SQLException e) {
            
        }
        return true;
    }
}
