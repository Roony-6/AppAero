package igu;

import java.awt.BorderLayout;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logic.RastreoVuelo;

public class RastrearVuelo extends javax.swing.JFrame {

    
    public RastrearVuelo() {
        initComponents();
      //  btnVer.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVuelo = new javax.swing.JButton();
        btnMiVuelo = new javax.swing.JButton();
        btAboutUs = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClavePasajero = new javax.swing.JTextField();
        btnRastrear = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lbVueloEncontrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                        .addContainerGap())))
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

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 150, 206));
        jLabel1.setText("RASTREA TU VUELO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 300, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INTRODUCE LA CLAVE DEL VUELO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        txtClavePasajero.setBackground(new java.awt.Color(255, 255, 255));
        txtClavePasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClavePasajeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClavePasajeroKeyTyped(evt);
            }
        });
        jPanel1.add(txtClavePasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 190, 30));

        btnRastrear.setBackground(new java.awt.Color(14, 150, 206));
        btnRastrear.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnRastrear.setForeground(new java.awt.Color(255, 255, 255));
        btnRastrear.setText("BUSCAR VUELO");
        btnRastrear.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), null));
        btnRastrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRastrearActionPerformed(evt);
            }
        });
        btnRastrear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRastrearKeyPressed(evt);
            }
        });
        jPanel1.add(btnRastrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 130, 30));

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 890, 410));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 910, 10));
        jPanel1.add(lbVueloEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVueloActionPerformed

        
        this.setVisible(false);
        InterfazPrincipal objectInterfazPrincipal=new InterfazPrincipal();
        objectInterfazPrincipal.setVisible(true);
        objectInterfazPrincipal.setLocationRelativeTo(null);
         objectInterfazPrincipal.agregarItems();//con metodo de la interfaz principal agregamos informacion obtenida de los archivos leidos 
    }//GEN-LAST:event_btnVueloActionPerformed

    private void btnMiVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiVueloActionPerformed

    private void btAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAboutUsActionPerformed
        this.setVisible(false);
        AboutUS abtUs= new AboutUS();
        abtUs.setVisible(true);
        abtUs.setLocationRelativeTo(null);

    }//GEN-LAST:event_btAboutUsActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRastrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRastrearActionPerformed

        RastreoVuelo objectRastroVuelo= new RastreoVuelo();
        String inputclaveReserva= txtClavePasajero.getText().trim();
/*
    boolean found= objectRastroVuelo.rastrearVuelo(inputclaveReserva,lbVueloEncontrado,pnlContenido);
      PnlDatosReserva o= new PnlDatosReserva();
      
      if(found){
          
          showPanel(o);

         objectRastroVuelo.showDatos();
          
         //o.showDatosPasajeros();
          
          
      }else
      {
          System.out.println("Vuevlo no encontrado");
          JOptionPane.showMessageDialog(null, "Vuelo no encontrado");
      }
 */PnlDatosReserva panelDatos= new PnlDatosReserva();
 
    boolean encontrado= panelDatos.rastrearVueloPnlDatosReserva(inputclaveReserva, lbVueloEncontrado, pnlContenido);
    
    if(encontrado){
       showPanel(panelDatos);
        String datosPasajero=panelDatos.getDatosPasajero();
        panelDatos.showDatosPasajero(datosPasajero);
        String datosAvion=panelDatos.getDatosAvion();
        panelDatos.showDatosVuelo(datosAvion);
    }






    }//GEN-LAST:event_btnRastrearActionPerformed

    private void txtClavePasajeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClavePasajeroKeyPressed

    if(evt.getExtendedKeyCode()== evt.VK_ENTER){
           btnRastrear.requestFocus();
           btnRastrear.doClick();
   
    }
        
    }//GEN-LAST:event_txtClavePasajeroKeyPressed


    private void txtClavePasajeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClavePasajeroKeyTyped

        
       
    }//GEN-LAST:event_txtClavePasajeroKeyTyped

    private void btnRastrearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRastrearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRastrearKeyPressed

    
    public void showPanel(JPanel panel)
    {
       panel.setSize(890, 410);
       panel.setLocation(0,0);
       
       
        pnlContenido.removeAll();
        pnlContenido.add(panel,BorderLayout.CENTER);
        pnlContenido.revalidate();
        pnlContenido.repaint();
         
         
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAboutUs;
    private javax.swing.JButton btnMiVuelo;
    private javax.swing.JButton btnRastrear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbVueloEncontrado;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JTextField txtClavePasajero;
    // End of variables declaration//GEN-END:variables
}
