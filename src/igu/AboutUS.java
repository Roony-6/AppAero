
package igu;

public class AboutUS extends javax.swing.JFrame {
    
    private String texto="Bienvenido a Burroswings, una aerolínea líder que se dedica a brindar experiencias de viaje excepcionales a nuestros pasajeros. Con un enfoque en la comodidad y la eficiencia, estamos comprometidos a proporcionar un servicio de reserva y gestión de vuelos de primera clase.\n" +
"\n" +"\n"+
"En Burroswings, comprendemos que cada viaje es una oportunidad para crear momentos inolvidables. Nuestra plataforma intuitiva y fácil de usar te permite reservar vuelos con total confianza y comodidad. Ya sea que estés planificando una escapada de negocios o unas merecidas vacaciones, estamos aquí para hacer que tu experiencia de vuelo sea fluida y sin complicaciones.\n" +
"\n" +
"Nuestro equipo está compuesto por profesionales apasionados que se esfuerzan por superar tus expectativas en cada etapa del viaje. Desde la elección de tu destino hasta el aterrizaje final, te ofrecemos un servicio de alta calidad respaldado por una dedicación inquebrantable hacia la satisfacción del cliente.\n" +
"\n" +
"Agradecemos la confianza que depositas en nosotros al elegir a Burroswings como tu compañía de confianza para tus viajes aéreos. Esperamos ser parte de tus aventuras y ayudarte a llegar a donde deseas, de la manera más conveniente y segura posible.\n" +
"\n" +
"¡Bienvenido a bordo de Burroswings!\n" +
"\n" +
"";
    
    public String strHtml(String texto){
        return "<html><p><justify>"+texto+"</justify></p></html>";
    }
    
    
    public AboutUS() {
        initComponents();
        lbAboutUs.setText(strHtml(texto));
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnVuelo = new javax.swing.JButton();
        btnMiVuelo = new javax.swing.JButton();
        btAboutUs = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnAboutUs = new javax.swing.JButton();
        btnComoReservar = new javax.swing.JButton();
        btnMetodosDPago = new javax.swing.JButton();
        btnPrivacidad = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        lbAboutUs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(14, 150, 203));
        jPanel3.setForeground(new java.awt.Color(0, 0, 204));

        jLabel4.setBackground(new java.awt.Color(14, 150, 203));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burro.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMiVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(btAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMiVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 90));

        jPanel4.setBackground(new java.awt.Color(14, 150, 203));

        btnAboutUs.setBackground(new java.awt.Color(14, 150, 203));
        btnAboutUs.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(255, 255, 255));
        btnAboutUs.setText("ABOUT US");
        btnAboutUs.setBorder(null);
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        btnComoReservar.setBackground(new java.awt.Color(14, 150, 203));
        btnComoReservar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnComoReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnComoReservar.setText("¿CÓMO RESEVAR?");
        btnComoReservar.setBorder(null);
        btnComoReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoReservarActionPerformed(evt);
            }
        });

        btnMetodosDPago.setBackground(new java.awt.Color(14, 150, 203));
        btnMetodosDPago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMetodosDPago.setForeground(new java.awt.Color(255, 255, 255));
        btnMetodosDPago.setText("METODOS DE PAGO");
        btnMetodosDPago.setBorder(null);
        btnMetodosDPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetodosDPagoActionPerformed(evt);
            }
        });

        btnPrivacidad.setBackground(new java.awt.Color(14, 150, 203));
        btnPrivacidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPrivacidad.setForeground(new java.awt.Color(255, 255, 255));
        btnPrivacidad.setText("PRIVACIDAD");
        btnPrivacidad.setBorder(null);
        btnPrivacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivacidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnComoReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMetodosDPago, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(btnPrivacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComoReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMetodosDPago, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 510));

        lbAboutUs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAboutUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel2.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 900, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVueloActionPerformed
        this.setVisible(false);
        InterfazPrincipal objectInterfazPrincipal= new InterfazPrincipal();
        objectInterfazPrincipal.setVisible(true);
        objectInterfazPrincipal.setLocationRelativeTo(null);
         objectInterfazPrincipal.agregarItems();//con metodo de la interfaz principal agregamos informacion obtenida de los archivos leidos 
     
    }//GEN-LAST:event_btnVueloActionPerformed

    private void btnMiVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiVueloActionPerformed

     this.setVisible(false);
     RastrearVuelo objedctRastreoVuelo= new RastrearVuelo();
     objedctRastreoVuelo.setVisible(true);
     objedctRastreoVuelo.setLocationRelativeTo(null);
     
    }//GEN-LAST:event_btnMiVueloActionPerformed

    private void btAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAboutUsActionPerformed

    }//GEN-LAST:event_btAboutUsActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
     
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void btnComoReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComoReservarActionPerformed

    private void btnMetodosDPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetodosDPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMetodosDPagoActionPerformed

    private void btnPrivacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrivacidadActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAboutUs;
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnComoReservar;
    private javax.swing.JButton btnMetodosDPago;
    private javax.swing.JButton btnMiVuelo;
    private javax.swing.JButton btnPrivacidad;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVuelo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAboutUs;
    private javax.swing.JPanel pnlContenido;
    // End of variables declaration//GEN-END:variables
}
