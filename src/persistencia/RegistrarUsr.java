
package persistencia;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class RegistrarUsr {
    
    public void insertar(String usuario, String password){
        Conexión con = new Conexión();
        
        con.conectarMySQL();
        
        String insertar = "INSERT INTO usuario VALUES(?,?)";
        
        try {
            PreparedStatement st = null;
            st= con.conn.prepareStatement(insertar);
            
            st.setString(1, usuario);
            st.setString(2, password);
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registró el usuario correctamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario que usted ha ingresado ya existe, eliga otro por favor", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    
}
