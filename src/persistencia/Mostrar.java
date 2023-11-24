
package persistencia;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.sql.ResultSet;


public class Mostrar {
   public static DefaultTableModel fetchDataFromDatabase(String tabla) throws SQLException {
        DefaultTableModel tableModel = new DefaultTableModel();

        Conexión con = new Conexión();
        con.conectarMySQL();
        
        // Consulta SQL para obtener datos de la tabla 'articulo'
            String sentencia = "SELECT * FROM " + tabla;

            try {
                PreparedStatement st = null;
                st= con.conn.prepareStatement(sentencia);
           
                ResultSet rs = st.executeQuery(); //Ejecuto la sentencia SQL

                // Obtener información sobre las columnas
                int columnCount = rs.getMetaData().getColumnCount();

                // Agregar las columnas al modelo de la tabla
                for (int i = 1; i <= columnCount; i++) {
                    tableModel.addColumn(rs.getMetaData().getColumnName(i));
                }

                // Agregar filas al modelo de la tabla
                while (rs.next()) {
                    Object[] rowData = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = rs.getObject(i);
                    }
                    tableModel.addRow(rowData);
                    
                }
            }catch (SQLException e){
                
            }
        

        return tableModel;
    
            } 
   }


