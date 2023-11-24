
package UGI;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.Eliminar;
import persistencia.IngresarCliente;
import persistencia.Modificar;
import persistencia.Mostrar;


public class jfTelefono extends javax.swing.JFrame {
    private int idTel = 0; //Crea la variable donde se va a guardar el id del telefono que se selecciona por la tabla
    private int numTel = 0; //Creo variable para guardar el número de teléfono si se va a modificar
    //Comienza el patrón singleton
    private static jfTelefono instance;
    public static jfTelefono getInstance(){
        if (instance == null){
            instance = new jfTelefono();
        }
        return instance;
    }
    //Termina el patrón singleton
    public jfTelefono() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teléfonos");

        jPanel1.setBackground(new java.awt.Color(5, 59, 80));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Teléfonos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));

        jTableTel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Cédula", "Número de Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTel);

        jLabel2.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jButtonMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jButton3)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMostrar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Método creado por el botón de "mostrar" que mustra los datos en la tabla
    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableTel.getModel(); //Obtenemos el modelo de la tabla
        
        try {
            // Llama al método en la clase DatabaseHandler para obtener el modelo de datos
            model = Mostrar.fetchDataFromDatabase("telefono");
            jTableTel.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    //Método creado para buscar en la tabla
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        DefaultTableModel modelo = new DefaultTableModel(); //Creo un objeto de tipo DefaultTableModel
        
        modelo = (DefaultTableModel) jTableTel.getModel(); //Se establece el modelo de la tabla en la variable modelo
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo); //Se crea un objeto TableRowSorter que inicializa con el modelo de la tabla
        jTableTel.setRowSorter(tr); //El objeto tr se establece como el clasificador de filas de la tabla
        tr.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(),1,2,3 )); //Usando un filtro de fila en el objeto tr y el método regexFilter se buscan los patrones que se ingresan por el txtBuscar
    }//GEN-LAST:event_txtBuscarKeyTyped

    //Método creado por el botón "eliminar" para eliminar los datos
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Eliminar eliminar = new Eliminar(); // Creo un objeto de tipo eliminar
        String tabla = "telefono"; //A la variable tabla, le doy el nombre de la tabla en mysql
        
        if(idTel == 0){ //Si el usuario no selecciona el id de una tupla para eliminar..
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un número a eliminar"); //Muestro un mensaje que le diga que seleccione
            System.out.println(idTel);
        }else{ //Si selecciona un id para eliminar..
            if (eliminar.delete("id_tel", "telefono", idTel) == 0){//Si el metodo "delete" retorna 0 borra y..
                idTel = 0; // Cambia el id a 0
                txtBuscar.setText("");
                this.jButtonMostrarActionPerformed(evt);
            } else{ //Si devuelve otro valor..
                idTel=0; // Cambia el id a 0
            }
        }
        this.jButtonMostrarActionPerformed(evt);//Actualizo los datos de la tabla jTableTel
    }//GEN-LAST:event_jButton1ActionPerformed

    //Metodo para buscar
    private void jTableTelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTelMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableTel.getModel();
        idTel = Integer.parseInt(String.valueOf(model.getValueAt(jTableTel.getSelectedRow(), 0))); //Obtengo el valor del id de el registro seleccionado
        numTel = Integer.parseInt(String.valueOf(model.getValueAt(jTableTel.getSelectedRow(),2))); //Obtengo el valor del número del registro seleccionado
    }//GEN-LAST:event_jTableTelMouseClicked

    // Metido para agregar un teléfono
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IngresarCliente insertar = new IngresarCliente();
        
        String conCedula = JOptionPane.showInputDialog( //Inicio un dialogo para consultar la cedula y guardo la respuesta en una variable
                this.jPanel2, //Le indico al JOptionPane que el elemento padre es el jPanel2
                "Ingrese la cédula del cliente", //Le muestro el mensaje
                JOptionPane.INFORMATION_MESSAGE); //Le indico el icono que va a mostrar
        
        if (conCedula != null){ //Si el usuario no apreta cancelar..
            
            String conTel = JOptionPane.showInputDialog( //Inicio el dialogo para consultar el teléfono y lo guardo en una variable
                    this.jPanel2,
                    "Ingrese el número de teléfono que desea agregar",
                    JOptionPane.INFORMATION_MESSAGE);
            
            try{
                if (conTel != null && conTel.length() == 9){ //Si el ususario inserta algo en el Panel..
                    int cedula = Integer.parseInt(conCedula); //Pasa la cedula a tipo entero
                    int telefono = Integer.parseInt(conTel); //Pasa el teléfono a tipo entero
                    int id_tel = telefono - 5; //Le creo una id única al teléfono
                    insertar.insertarTel(id_tel, cedula, telefono); //Inserto los datos
                    this.jButtonMostrarActionPerformed(evt); //Se actualiza la tabla
                }else {
                    JOptionPane.showMessageDialog(null, "Datos no válidos", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrse una cédula", "ERROR", JOptionPane.WARNING_MESSAGE);

            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Modificar modifi = new Modificar();
        modifi.modificarInt("telefono", "telefono", "id_tel", idTel, numTel);
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfTelefono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTel;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
