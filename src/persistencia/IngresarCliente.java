
package persistencia;
import logica.Cliente;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class IngresarCliente {
    public void insertar(int cedula, String nombre, String apellido, int telefono, String empresa, int codPostal, int numero, String calle){
        Conexión con = new Conexión();
        Cliente cliente = new Cliente();
        
        con.conectarMySQL();
        
        String insertar = "INSERT INTO cliente(cedula, nombre, apellido, empresa, cod_postal, numero, calle, telefono) VALUES (?,?,?,?,?,?,?,?)";
        
        cliente.setCedula(cedula);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setEmpresa(empresa);
        cliente.setCodPostal(codPostal);
        cliente.setNumero(numero);
        cliente.setCalle(calle);
        
        try (PreparedStatement ps = con.conn.prepareStatement(insertar)){
            ps.setInt(1, cliente.getCedula());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getEmpresa());
            ps.setInt(5,cliente.getCodPostal());
            ps.setInt(6,cliente.getNumero());
            ps.setString(7, cliente.getCalle());
            
            ps.executeUpdate();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la insercion de datos");
        }
        
    }
    
    
}
