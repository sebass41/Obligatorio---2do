
package persistencia;

import logica.Articulo;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class IngresarArticulo {

    public void insertar(int numArt, int stock, String nomFabr, int precio){
        Conexión con = new Conexión();
        Articulo articulo = new Articulo();
        
        con.conectarMySQL();
        
        String insertar = "INSERT INTO articulo VALUES (?,?,?,?)";
        
        articulo.setNumArticulo(numArt);
        articulo.setStock(stock);
        articulo.setNombFabricante(nomFabr);
        articulo.setPrecio(precio);
        
        try {
            PreparedStatement st = null;
            st= con.conn.prepareStatement(insertar);
               
            st.setInt(1, articulo.getNumArticulo());
            st.setInt(2, articulo.getStock());
            st.setString(3, articulo.getNombFabricante());
            st.setInt(4, articulo.getPrecio());
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente", "Inserción Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudieron insertar los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
