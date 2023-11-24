
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class EliminarUsuario {
    public void delete(String usr){
        Conexión con = new Conexión();
        con.conectarMySQL();
        
        String sentencia = "DELETE FROM usuario WHERE usuario = ?";
        try {
            PreparedStatement st = null;
            st = con.conn.prepareStatement(sentencia);
            
            st.setString(1,usr);
            st.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
