
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Eliminar {
    public int delete(String pk, String tabla, int id){
        Conexión con = new Conexión();
        con.conectarMySQL();
        
        String sentencia = "DELETE FROM "+ tabla + " WHERE " + pk + " = ?";
        
        int r = JOptionPane.showConfirmDialog(null, "¿Quiere eliminar ese registro?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (r == JOptionPane.YES_OPTION){
                
            
            try {
               PreparedStatement st = null;
               st= con.conn.prepareStatement(sentencia);

               st.setInt(1, id);

               st.executeUpdate();
               
               System.out.println("Registro eliminado correctamente.");
               JOptionPane.showMessageDialog(null, "Se ha eliminado un registro", "", JOptionPane.INFORMATION_MESSAGE);
               
               return r;
               
            } catch (SQLException e) {
                System.out.println("Error " + e);
                r = 2;
                return r;
            }
    
            } else {    
                JOptionPane.showMessageDialog(null, "Se canceló correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                return r;
            }
    }
}

    

