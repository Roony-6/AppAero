
package igu;
import logic.ArchVuelos;
import logic.DatosPasajero;
import igu.*;
import java.awt.event.KeyEvent;
public class FormDatosPasajero extends javax.swing.JFrame {
    
    public FormDatosPasajero() {
        initComponents();
        
    
    }
 
   public void actualizarResumen(String origen, String destino, String fecha) {
        txtOrigen.setText(origen);
        txtDestino.setText(destino);
        txtFecha.setText(fecha);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOrigen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnLImpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbmostrarDisponible = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1036, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrigen.setEditable(false);
        txtOrigen.setBackground(new java.awt.Color(255, 255, 255));
        txtOrigen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtOrigen.setBorder(null);
        txtOrigen.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("ORIGEN:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("DESTINO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 60, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("FECHA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 50, 30));

        btnModificar.setBackground(new java.awt.Color(13, 160, 206));
        btnModificar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 140, 30));

        jLabel4.setBackground(new java.awt.Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 160, 206));
        jLabel4.setText("INFORMACION PERSONAL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtFecha.setBorder(null);
        txtFecha.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 150, 30));

        txtDestino.setEditable(false);
        txtDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtDestino.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtDestino.setBorder(null);
        txtDestino.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtDestino.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 160, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 910, 10));

        jLabel6.setText("NOMBRE(s)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel7.setText("APELLIDOS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        jLabel8.setText("TELEFONO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        jLabel9.setText("EDAD");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 410, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 410, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 407, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 407, -1));

        btnLImpiar.setText("LIMPIAR");
        btnLImpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLImpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLImpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(13, 160, 206));
        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 170, -1));

        jPanel2.setBackground(new java.awt.Color(14, 150, 203));
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burrologo.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logtex.png"))); // NOI18N

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
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 627, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billetera.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 40, 40));

        lbmostrarDisponible.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lbmostrarDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garrapata.png"))); // NOI18N
        jPanel1.add(lbmostrarDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userInfo.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 30, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 360, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 255, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 255, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 340, 30));

        jLabel14.setBackground(new java.awt.Color(51, 102, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(16, 160, 206));
        jLabel14.setText("RESUMEN DE VUELO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigenActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

InterfazPrincipal interPrin= new InterfazPrincipal();
  // interPrin.arrayResumenVuelos.clear();
      //  System.out.println("Se limpio el resumen");
        this.setVisible(false);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinoActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

  DatosPasajero objDatos= new DatosPasajero();
  getDatosPasajerosToArray();
  objDatos.getDatosPasajeros(arrayDatosPasajero);
  
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLImpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLImpiarActionPerformed
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnLImpiarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
     
 

    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

   // public boolean verificarDatoPLleno(){
        
      // String nombre= txtNombre.getText();
       //String apellido= txtApellidos.getText();
        
        
        //if(txtNombre.get){
        
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       // while(){
         //   btnGuardar.setEnabled(true);
                                
                    
                    
                    
                    
            
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    
    public DatosPasajero arrayDatosPasajero[]= new DatosPasajero[1];
    
public void getDatosPasajerosToArray(){
    String nombre= txtNombre.getText().trim().toUpperCase();
    String apellido=txtApellidos.getText().trim().toUpperCase();
    String edad=txtEdad.getText().trim();
    String telefono=txtTelefono.getText().trim();
    
    DatosPasajero objDatosPas= new DatosPasajero(nombre, apellido, edad, telefono);
    arrayDatosPasajero[0]=objDatosPas;
     System.out.println("Datos del pasajero guardados en arrayResumenVuelos");
    System.out.println(objDatosPas.toString());
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLImpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbmostrarDisponible;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
