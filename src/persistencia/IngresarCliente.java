
package persistencia;
import logica.Cliente;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class IngresarCliente {
    public void insertar(int cedula, String nombre, String apellido, String empresa, int codPostal, String ciudad, String codDepart, int numero, String calle){
        Conexión con = new Conexión();
        Cliente cliente = new Cliente();
        
        con.conectarMySQL();
        
        String insertar = "INSERT INTO cliente VALUES (?,?,?,?,?,?,?,?,?)";
        
        cliente.setCedula(cedula);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setEmpresa(empresa);
        cliente.setCodPostal(codPostal);
        cliente.setCiudad(ciudad);
        cliente.setDepartamento(codDepart);
        cliente.setNumero(numero);
        cliente.setCalle(calle);
        
        try {
            PreparedStatement st = null;
            st= con.conn.prepareStatement(insertar);
            
            st.setInt(1, cliente.getCedula());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getEmpresa());
            st.setInt(5,cliente.getCodPostal());
            st.setString(6, cliente.getCiudad());
            st.setInt(7, cliente.getNumero());
            st.setString(8,cliente.getCalle());
            st.setString(9,"E");
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente", "Inserción Exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se pudieron insertar los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
         
    }
    
    public void insertarTel(int id_tel, int cedula, int telefono){
        Conexión con = new Conexión();
        Cliente cliente = new Cliente();
        con.conectarMySQL();
        
        String insertar = "INSERT INTO telefono VALUES (?,?,?)";
        
        cliente.setCedula(cedula);
        cliente.setTelefono(telefono);
        
        try {
            PreparedStatement st = null;
            st= con.conn.prepareStatement(insertar);
            
            st.setInt(1, id_tel);
            st.setInt(2, cliente.getCedula());
            st.setInt(3, cliente.getTelefono());
        
            st.executeUpdate();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la insercion del teléfono");
        }
    }
    
}
