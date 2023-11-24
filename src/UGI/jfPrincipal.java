package UGI;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import com.toedter.calendar.JCalendar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import persistencia.Conexión;
import persistencia.IngresarPedido;
import java.sql.*;
import java.sql.DriverManager;
import com.toedter.calendar.JCalendar;
import java.text.ParseException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableRowSorter;
import persistencia.Eliminar;
import persistencia.Modificar;
import persistencia.Mostrar;
public class jfPrincipal extends javax.swing.JFrame {
    private int id = 0;
    private String valorSelec;

    public jfPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArt = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtArt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCalFecha = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jButtonMostrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuPedido = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem22.setText("jMenuItem22");

        jMenuItem23.setText("jMenuItem23");

        jMenuItem27.setText("jMenuItem27");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 105, 135));

        jTableArt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num_art", "Stock", "Nombre de la Fábrica", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableArtMouseClicked(evt);
            }
        });
        jTableArt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableArtKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableArt);

        jPanel2.setBackground(new java.awt.Color(100, 204, 197));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Agregar Pedido");

        jLabel2.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Num. del Artículo");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel3.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Cédula");

        jLabel4.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("Cantidad");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCalFecha.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jCalFecha.setForeground(new java.awt.Color(238, 238, 238));
        jCalFecha.setText("Fecha a Pagar");

        jdcFecha.setDateFormatString("yyy MM dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtArt))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalFecha)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 235, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(292, 292, 292))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCalFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(298, 298, 298))
        );

        jButtonMostrar.setText("Mostrar Artículos");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setText("Eliminar Artículo");

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lato", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 238, 238));
        jLabel7.setText("Buscar Artículo");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(jButtonMostrar)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(189, 189, 189))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonModificar))
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMostrar)
                .addGap(47, 47, 47))
        );

        jMenuBar1.setBackground(new java.awt.Color(100, 204, 197));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconInicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        jMenu21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconCliente.png"))); // NOI18N
        jMenu21.setText("Cliente");

        jMenuItem2.setText("Registrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem2);

        jMenuItem3.setText("Consultar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem3);

        jMenuBar1.add(jMenu21);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconMenu.png"))); // NOI18N
        jMenu2.setText("Articulos");

        jMenuItem4.setText("Registrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenu24.setText("Consultar");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconMouse.png"))); // NOI18N
        jMenu3.setText("Perifericos");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconMouse2.png"))); // NOI18N
        jMenuItem9.setText("Mouse");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconTeclado.png"))); // NOI18N
        jMenuItem10.setText("Teclados");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconMonitor.png"))); // NOI18N
        jMenuItem11.setText("Monitor");
        jMenu3.add(jMenuItem11);

        jMenu24.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconPC2.png"))); // NOI18N
        jMenu4.setText("Equipos");

        jMenuItem12.setText("jMenuItem12");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("jMenuItem13");
        jMenu4.add(jMenuItem13);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/IntelLogo.png"))); // NOI18N
        jMenu9.setText("Intel");
        jMenu4.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/AMDLogo.png"))); // NOI18N
        jMenu10.setText("Amd");
        jMenu4.add(jMenu10);

        jMenu24.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconPC.png"))); // NOI18N
        jMenu5.setText("Hardware");

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconProcesador.png"))); // NOI18N
        jMenu11.setText("Procesador");

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/IntelLogo.png"))); // NOI18N
        jMenuItem20.setText("Intel");
        jMenu11.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/AMDLogo.png"))); // NOI18N
        jMenuItem21.setText("AMD");
        jMenu11.add(jMenuItem21);

        jMenu5.add(jMenu11);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconRAM.png"))); // NOI18N
        jMenuItem15.setText("RAM");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconApagar.png"))); // NOI18N
        jMenuItem16.setText("Fuente de poder");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconMother.png"))); // NOI18N
        jMenuItem17.setText("Placa madre");
        jMenu5.add(jMenuItem17);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconCooler.png"))); // NOI18N
        jMenuItem14.setText("Ventiladores");
        jMenu5.add(jMenuItem14);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconEtiqueta.png"))); // NOI18N
        jMenuItem18.setText("Almacenamiento");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconGráfica.png"))); // NOI18N
        jMenuItem19.setText("Tarjeta gráfica");
        jMenu5.add(jMenuItem19);

        jMenu24.add(jMenu5);

        jMenu2.add(jMenu24);

        jMenuBar1.add(jMenu2);

        jMenuPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconCarrito.png"))); // NOI18N
        jMenuPedido.setText("Pedidos");

        jMenuItem24.setText("Ver Pedidos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenuPedido.add(jMenuItem24);

        jMenuBar1.add(jMenuPedido);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagnes/iconEnvío.png"))); // NOI18N
        jMenu6.setText("Envíos");

        jMenuItem26.setText("Agregar");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem26);

        jMenuItem28.setText("Consultar");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jfRegistrarCliente1 registrarC = jfRegistrarCliente1.getInstance();
        registrarC.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    jfRegistrarArticulo registrarArticulo = jfRegistrarArticulo.getInstance();
    registrarArticulo.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jfConsultarCliente consultarCliente = jfConsultarCliente.getInstance();
        consultarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableArt.getModel(); //Creo un objeto de tipo DefaultTableModel
        
        try {
            // Llamada al método en la clase DatabaseHandler para obtener el modelo de datos
            model = Mostrar.fetchDataFromDatabase("articulo");
            jTableArt.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    //Agrego un pedido
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IngresarPedido pedido = new IngresarPedido();
        Date date = new Date(System.currentTimeMillis()); //Obtengo el valor de la fecha actual y la guardo en la variable "date"
        java.sql.Date mFechaSql = new java.sql.Date(date.getTime()); //Convierte el valor de la fecha actual para pasarselo a MySql y se la asigna a la variable "mFechaSql"
        boolean guardar = true;
        String mensaje = "";
        try {
            int cantidad = Integer.parseInt(spnCantidad.getValue().toString());
            int cedula = Integer.parseInt(txtCedula.getText());
            int numArt = Integer.parseInt(txtArt.getText());
            Date fechaF = jdcFecha.getDate(); //Obtiene la fecha seleccionada del JDateChooser 
            long d = fechaF.getTime(); //Convierte fechaF a un valor long
            java.sql.Date fecha = new java.sql.Date(d); //Convierte el valor de la fecha seleccionada para pasarselo a MySql y la guarda en la variable "fecha"
            
            if (jdcFecha == null || mFechaSql.after(fechaF)){
                guardar = false;
                mensaje += "Por favor, ingrese una fecha en la que va a pagar que sea válida\n";
            }
            if (cantidad == 0){
                guardar = false;
                mensaje += "Ingrese la cantidad que desea agregar al pedido\n";
            }
            if (txtCedula.getText().length() < 8){
                guardar = false;
                mensaje += "Ingrese una cédula válida\n";
            }
            if (numArt == 0){
                guardar = false;
                mensaje += "Ingrese el número del artículo que desea, por favor";
            }

            if (guardar == true){
            int id = cedula - cantidad - numArt;
            pedido.insertar(id, fecha, cantidad, mFechaSql, cedula, numArt);

            txtCedula.setText("");
            txtArt.setText("");
            spnCantidad.setValue(0);
            this.jdcFecha.setDate(null);
            }else {
                JOptionPane.showMessageDialog(null, mensaje, "Faltan datos", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Faltan ingresar Datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        jfPedido pedido = jfPedido.getInstance();
        pedido.setVisible(true);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        jfRegistrarEnvio envio = jfRegistrarEnvio.getInstance();
        envio.setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        jfConsultarEnvio envio = jfConsultarEnvio.getInstance();
        envio.setVisible(true);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    //Método para eliminar
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Eliminar eliminar = new Eliminar();
        String tabla = "articulo";
        
        if (id == 0){
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un artículo a eliminar");
        } else {
            if (eliminar.delete("Num_art", "articulo", id) == 0){
                txtBuscar.setText("");
                id = 0;
                this.jButtonMostrarActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, corrobore que el artículo no esté en algún pedido", "", JOptionPane.WARNING_MESSAGE);
            }
            
            id = 0;
        }
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    //Al precionar un valor en la tabla..
    private void jTableArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableArtMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableArt.getModel();
        id = Integer.parseInt(String.valueOf(model.getValueAt(jTableArt.getSelectedRow(), 0))); //Obtengo el valor del Id
        valorSelec = String.valueOf(model.getValueAt(jTableArt.getSelectedRow(), jTableArt.getSelectedColumn())); //Obtengo el valor de la celda seleccionada
        
        if (id != 0){
            this.jButtonEliminar.setBackground(new java.awt.Color(162, 87, 114));
        } else{
            this.jButtonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        }
        if (valorSelec.equals(valorSelec)){
            this.jButtonModificar.setBackground(new java.awt.Color(5, 59, 80));
        }
                
    }//GEN-LAST:event_jTableArtMouseClicked

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
         DefaultTableModel modelo = new DefaultTableModel();
        
        modelo = (DefaultTableModel) jTableArt.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        jTableArt.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtBuscar.getText(),1,2,3,4));
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Modificar modifi = new Modificar();
        DefaultTableModel modelo = new DefaultTableModel();
        int numColum = jTableArt.getSelectedColumn();
        String [] nomColum = new String []{"Num_art", "stock", "nom_fabrica", "precio"};
        String colum = "";
        int valorInt;
        boolean salir = false;
        for (int i = 0; i < nomColum.length && !salir; i++){
           if (i == numColum){
               colum = nomColum[i];
               salir = true;
           }
        }
        
        if (numColum == 2){
            modifi.modificarStr(colum, "articulo", "Num_art", id, valorSelec);
        } else{
            valorInt = Integer.parseInt(valorSelec);
            modifi.modificarInt(colum, "articulo", "Num_art", id, valorInt);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jTableArtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableArtKeyTyped
    }//GEN-LAST:event_jTableArtKeyTyped

    public static void main(String args[]) {
        
        try {
//            UIManager.setLookAndFeel( new FlatLightLaf() );
                FlatDarkLaf.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JLabel jCalFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableArt;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtArt;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
