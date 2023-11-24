
package UGI;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import persistencia.Eliminar;
import persistencia.Modificar;
import persistencia.Mostrar;


public class jfConsultarEnvio extends javax.swing.JFrame {
    private int id = 0;
    private String valorSelec;
    
    private static jfConsultarEnvio instance;
    public static jfConsultarEnvio getInstance(){
        if (instance == null){
            instance = new jfConsultarEnvio();
        }
        return instance;
    }
    
    public jfConsultarEnvio() {
        initComponents();
        this.setSize(950, 630);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEnvio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Envios");

        jPanel1.setBackground(new java.awt.Color(5, 59, 80));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Consultar Envios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(316, 316, 316))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
        );

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));

        jTableEnvio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Costo", "Peso", "Fecha", "Número", "Calle", "Número de Pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnvioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEnvio);

        jLabel2.setBackground(new java.awt.Color(238, 238, 238));
        jLabel2.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Buscar");

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jButtonModificar)))))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButtonModificar)
                        .addGap(91, 91, 91)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(84, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo que muestra los datos en la tabla
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableEnvio.getModel(); //Obtenemos el modelo de la tabla
        
        try {
            // Llama al método en la clase DatabaseHandler para obtener el modelo de datos
            model = Mostrar.fetchDataFromDatabase("envio");
            jTableEnvio.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Metodo para buscar los datos
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        DefaultTableModel modelo = new DefaultTableModel(); //Creo un objeto de tipo DefaultTableModel
        
        modelo = (DefaultTableModel) jTableEnvio.getModel(); //Se establece el modelo de la tabla en la variable modelo
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo); //Se crea un objeto TableRowSorter que inicializa con el modelo de la tabla
        jTableEnvio.setRowSorter(tr); //El objeto tr se establece como el clasificador de filas de la tabla
        tr.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(),1,2,3,4,5,6,7 )); //Usando un filtro de fila en el objeto tr y el método regexFilter se buscan los patrones que se ingresan por el txtBuscar
    }//GEN-LAST:event_txtBuscarKeyTyped

    //Método para eliminar los datos de la tabla
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Eliminar eliminar = new Eliminar(); // Creo un objeto de tipo eliminar
        String tabla = "telefono"; //A la variable tabla, le doy el nombre de la tabla en mysql
        
        if(id == 0){ //Si el usuario no selecciona el id de una tupla para eliminar..
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un envío a eliminar"); //Muestro un mensaje que le diga que seleccione
        }else{ //Si selecciona un id para eliminar..
            if (eliminar.delete("id_envio", "envio", id) == 0){//Si el metodo "delete" retorna 0 borra y..
                id = 0; // Cambia el id a 0
                txtBuscar.setText("");
                this.jButton1ActionPerformed(evt);//Actualizo los datos de la tabla jTableTel
            } else{ //Si devuelve otro valor..
                id=0; // Cambia el id a 0
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnvioMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableEnvio.getModel();
        id = Integer.parseInt(String.valueOf(model.getValueAt(jTableEnvio.getSelectedRow(), 0)));
        valorSelec = String.valueOf(model.getValueAt(jTableEnvio.getSelectedRow(), jTableEnvio.getSelectedColumn()));
    }//GEN-LAST:event_jTableEnvioMouseClicked

    //Modificar
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Modificar modifi = new Modificar();
        DefaultTableModel model = (DefaultTableModel) jTableEnvio.getModel();
        int numColum = jTableEnvio.getSelectedColumn();
        String [] nomColum = new String []{"id_envio", "costo", "peso", "fecha_envio", "numero", "calle", "Num_pedido"};
        String colum = "";
        int valorInt;
        boolean salir = false;
        for (int i = 0; i < nomColum.length && !salir; i++){
           if (i == numColum){
               colum = nomColum[i];
               salir = true;
           }
        }
        
        if (numColum == 5){
            modifi.modificarStr(colum, "envio", "id_envio", id, valorSelec);
        }else if (numColum == 3){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // Crear un objeto SimpleDateFormat para analizar la cadena
            try {
                java.util.Date date = formato.parse(valorSelec);
                java.sql.Date fecha = new java.sql.Date(date.getTime());
                modifi.modificarDate(colum, "envio", "id_envio", id, fecha);
            } catch (ParseException ex) {
                System.out.println(ex);
            }
        } else {
            valorInt = Integer.parseInt(valorSelec);
            modifi.modificarInt(colum, "envio", "id_envio", id, valorInt);
        }
        
    }//GEN-LAST:event_jButtonModificarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfConsultarEnvio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnvio;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
