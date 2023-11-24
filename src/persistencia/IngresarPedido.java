
package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.Pedido;

public class IngresarPedido {
    public void insertar (int numPedido, java.sql.Date fechaPago, int cantidad, java.sql.Date fechaPed, int cedula, int numArt){
        Pedido pedido = new Pedido();
        Conexión con = new Conexión();
        
        con.conectarMySQL();
        
        String insertar = "INSERT INTO pedido VALUES (?,?,?,?,?,?)";
        
        pedido.setNumPedido(numPedido);
        pedido.setFechaPago(fechaPago);
        pedido.setCantArticulos(cantidad);
        pedido.setFechaPed(fechaPed);
        pedido.setCedula(cedula);
        pedido.setNumArt(numArt);

        
        try {
            PreparedStatement st = null;
            st= con.conn.prepareStatement(insertar);
            
            st.setInt(1, pedido.getNumPedido());
            st.setDate(2, pedido.getFechaPago());
            st.setInt(3, pedido.getCantArticulos());
            st.setDate(4, pedido.getFechaPed());
            st.setInt(5, pedido.getCedula());
            st.setInt(6, pedido.getNumArt());
            
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se ha realizado el pedido", "Insersion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la insercion de datos: " + e);
        }
}

}
