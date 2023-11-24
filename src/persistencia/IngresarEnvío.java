
package persistencia;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class IngresarEnvío {
    public void ingresar(int idEnvio, int costo, int peso, java.sql.Date fecha, int numero, String calle, int numPedido){
        Conexión con = new Conexión();
        con.conectarMySQL();
        
        String sentencia = "INSERT INTO envio VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement st = null;
            st= con.conn.prepareStatement(sentencia);
            
            st.setInt(1, idEnvio);
            st.setInt(2, costo);
            st.setInt(3, peso);
            st.setDate(4, fecha);
            st.setInt(5, numero);
            st.setString(6, calle);
            st.setInt(7, numPedido);
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente", "Inserción Exitosa", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo insertar los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
