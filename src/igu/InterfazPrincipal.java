
package igu;

import java.util.ArrayList;
import logic.*;
public class InterfazPrincipal extends javax.swing.JFrame {

    
    public InterfazPrincipal() {
        initComponents();
  
    }
    
ArchVuelos archVuelos= new ArchVuelos();
FormDatosPasajero formDatosP= new FormDatosPasajero();
public void agregarItems(){
     archVuelos.setTokeonsOrigen(cmboxOrigenes);
     archVuelos.setTokensDestinos(cmboxDestinos);
     btnReservar.setEnabled(false);

   // archVuelos.setTokensAviones(cmboxFechas, cmboxDestinos, cmboxOrigenes);
}

public DatosPasajero arrayResumenVuelos[]= new DatosPasajero[1];
public void llenarArrayResumen0(){
    String origen= cmboxOrigenes.getSelectedItem().toString();
    System.out.println("resumen origen:"+origen);
    String destino= cmboxDestinos.getSelectedItem().toString();
    System.out.println("resumen destino:"+destino);
    String fecha= cmboxFechas.getSelectedItem().toString();
    System.out.println("resumen fecha: "+fecha);
    
   DatosPasajero objResumenVuelo= new DatosPasajero(origen, destino, fecha);
    arrayResumenVuelos[0]=objResumenVuelo;
    System.out.println(""+arrayResumenVuelos[0].toString());
    
}
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        cmboxOrigenes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmboxDestinos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmboxFechas = new javax.swing.JComboBox<>();
        btnBuscarFechas = new javax.swing.JButton();
        lbmostrarDisponible = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVuelo = new javax.swing.JButton();
        btnMiVuelo = new javax.swing.JButton();
        btAboutUs = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbEncontrado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmboxOrigenes.setBackground(new java.awt.Color(241, 255, 255));
        cmboxOrigenes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmboxOrigenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 255, 255)));
        cmboxOrigenes.setPreferredSize(new java.awt.Dimension(69, 16));
        jPanel1.add(cmboxOrigenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ORIGEN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        cmboxDestinos.setBackground(new java.awt.Color(241, 255, 255));
        cmboxDestinos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmboxDestinos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 255, 255)));
        jPanel1.add(cmboxDestinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 278, 170, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("FESCHAS DISPONIBLES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("DESTINO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        cmboxFechas.setBackground(new java.awt.Color(241, 255, 255));
        cmboxFechas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboxFechasItemStateChanged(evt);
            }
        });
        cmboxFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxFechasActionPerformed(evt);
            }
        });
        jPanel1.add(cmboxFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 190, 30));

        btnBuscarFechas.setBackground(new java.awt.Color(13, 146, 206));
        btnBuscarFechas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBuscarFechas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarFechas.setText("BUSCAR");
        btnBuscarFechas.setBorder(null);
        btnBuscarFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechasActionPerformed(evt);
            }
        });
        btnBuscarFechas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarFechasKeyPressed(evt);
            }
        });
        jPanel1.add(btnBuscarFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 170, 30));

        lbmostrarDisponible.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lbmostrarDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reserva (1).png"))); // NOI18N
        jPanel1.add(lbmostrarDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 30, 40));

        btnReservar.setBackground(new java.awt.Color(13, 146, 206));
        btnReservar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("RESERVAR");
        btnReservar.setBorder(null);
        btnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReservarMousePressed(evt);
            }
        });
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 190, 30));

        jPanel2.setBackground(new java.awt.Color(14, 150, 203));
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burrologo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logtex.png"))); // NOI18N

        btnVuelo.setBackground(new java.awt.Color(14, 150, 203));
        btnVuelo.setForeground(new java.awt.Color(255, 255, 255));
        btnVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/avionIcon.png"))); // NOI18N
        btnVuelo.setText("     VUELO");
        btnVuelo.setBorder(null);
        btnVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVueloActionPerformed(evt);
            }
        });

        btnMiVuelo.setBackground(new java.awt.Color(14, 150, 203));
        btnMiVuelo.setForeground(new java.awt.Color(255, 255, 255));
        btnMiVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suitcase (1).png"))); // NOI18N
        btnMiVuelo.setText(" MI VUELO");
        btnMiVuelo.setBorder(null);
        btnMiVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiVueloActionPerformed(evt);
            }
        });

        btAboutUs.setBackground(new java.awt.Color(14, 150, 203));
        btAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        btAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info (1).png"))); // NOI18N
        btAboutUs.setText("INFO");
        btAboutUs.setBorder(null);
        btAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAboutUsActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(14, 150, 203));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMiVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(btAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMiVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(8, 8, 8)))
                        .addContainerGap())))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userInfo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 30, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billetera.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 730, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(14, 150, 250));
        jLabel9.setText("¡BIENVENIDO!");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(14, 148, 205));
        jLabel6.setText("BUSCA TU VUELO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));
        jPanel1.add(lbEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 120, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Este progtrama es hecho por Roony Roldan Cruz ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, -1, -1));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmboxFechasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboxFechasItemStateChanged

    }//GEN-LAST:event_cmboxFechasItemStateChanged

    private void btnBuscarFechasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarFechasKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarFechasKeyPressed

    private void btnBuscarFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechasActionPerformed
        // TODO add your handling code here:
        
        archVuelos.buscarFecha(btnReservar,cmboxDestinos, cmboxOrigenes, cmboxFechas,lbEncontrado);
    }//GEN-LAST:event_btnBuscarFechasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
   
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
      llenarArrayResumen0();
      
      formDatosP.setVisible(true);
      formDatosP.setLocationRelativeTo(null);

       String origen = arrayResumenVuelos[0].getOrigen();
        String destino = arrayResumenVuelos[0].getDestino();
        String fecha = arrayResumenVuelos[0].getFecha();
        
        // Actualizar los campos de texto en la interfaz FormDatosPasajero
        formDatosP.actualizarResumen(origen, destino, fecha);
        
     

        
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnReservarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservarMousePressed

    private void btnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVueloActionPerformed

    private void btnMiVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiVueloActionPerformed

    private void btAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAboutUsActionPerformed
AboutUS abtUs= new AboutUS();
abtUs.setVisible(true);
        
    }//GEN-LAST:event_btAboutUsActionPerformed

    private void cmboxFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxFechasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxFechasActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAboutUs;
    private javax.swing.JButton btnBuscarFechas;
    private javax.swing.JButton btnMiVuelo;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVuelo;
    private javax.swing.JComboBox<String> cmboxDestinos;
    private javax.swing.JComboBox<String> cmboxFechas;
    private javax.swing.JComboBox<String> cmboxOrigenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEncontrado;
    private javax.swing.JLabel lbmostrarDisponible;
    // End of variables declaration//GEN-END:variables
}
