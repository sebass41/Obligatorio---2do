
package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Modificar {
    public void modificarStr (String columna, String tabla, String idColumn, int id, String valorStr){
        Conexión con = new Conexión();
        con.conectarMySQL();
        
        String sentencia = "UPDATE " + tabla + " SET " + columna + " = ? WHERE " + idColumn + " = ?";
        
        try {
            PreparedStatement st = null;
            st = con.conn.prepareStatement(sentencia);
            st.setString(1, valorStr);
            st.setInt(2, id);
          
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha modificado un registro", "Modificación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo modificar", "ERROR", JOptionPane.ERROR_MESSAGE);            
        }
    }
    public void modificarInt(String columna, String tabla, String idColumn, int id, int valorInt){
        Conexión con = new Conexión();
        con.conectarMySQL();
        
        String sentencia = "UPDATE " + tabla + " SET " + columna + " = ? WHERE " + idColumn + " = ?";
        
        try {
            PreparedStatement st = null;
            st = con.conn.prepareStatement(sentencia);
            
            st.setInt(1, valorInt);
            st.setInt(2, id);
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha modificado un registro", "Modificación Exitosa", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo modificar", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    public void modificarDate (String columna, String tabla, String idColumn, int id, java.sql.Date fecha){
        Conexión con = new Conexión();
        con.conectarMySQL();
        
        String sentencia = "UPDATE " + tabla + " SET " + columna + " = ? WHERE " + idColumn + " = ?";
        
        try {
            PreparedStatement st = null;
            st = con.conn.prepareStatement(sentencia);
            
            st.setDate(1, fecha);
            st.setInt(2, id);
            
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se ha modificado un registro", "Modificación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "No se pudo modificar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
