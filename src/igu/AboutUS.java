
package igu;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

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
    
  
public String strHtml(String texto) {
    return "<html><p style='text-align: justify;'>" + texto + "</p></html>";
}
    
    public AboutUS() {
        initComponents();
        lbAboutUs.setText(strHtml(texto));
        
    }
    
    
    
     public void showPanel(JPanel panel)
    {
       panel.setSize(900, 510);
       panel.setLocation(0,0);
       
       
        pnlContenido.removeAll();
        pnlContenido.add(panel,BorderLayout.CENTER);
        pnlContenido.revalidate();
        pnlContenido.repaint();
         
         
        
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
        btnCancelarVuelo = new javax.swing.JButton();
        btnPrivacidad1 = new javax.swing.JButton();
        btnCondiciones = new javax.swing.JButton();
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
        btnVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVueloMouseExited(evt);
            }
        });
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
        btnMiVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMiVueloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMiVueloMouseExited(evt);
            }
        });
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
        btAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAboutUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAboutUsMouseExited(evt);
            }
        });
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMiVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
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

        btnCancelarVuelo.setBackground(new java.awt.Color(14, 150, 203));
        btnCancelarVuelo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelarVuelo.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVuelo.setText("¿CANCELAR VUELO?");
        btnCancelarVuelo.setBorder(null);
        btnCancelarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVueloActionPerformed(evt);
            }
        });

        btnPrivacidad1.setBackground(new java.awt.Color(14, 150, 203));
        btnPrivacidad1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPrivacidad1.setForeground(new java.awt.Color(255, 255, 255));
        btnPrivacidad1.setText("PRIVACIDAD");
        btnPrivacidad1.setBorder(null);
        btnPrivacidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrivacidad1ActionPerformed(evt);
            }
        });

        btnCondiciones.setBackground(new java.awt.Color(14, 150, 203));
        btnCondiciones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCondiciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCondiciones.setText("CONDICIONES DE USO");
        btnCondiciones.setBorder(null);
        btnCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondicionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnPrivacidad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComoReservar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComoReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrivacidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, 510));

        lbAboutUs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAboutUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenidoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenidoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbAboutUs, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
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

       AU ob= new AU();
        showPanel(ob);
     
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void btnComoReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoReservarActionPerformed
PanelComoReservar panelComoreservar= new PanelComoReservar();
        showPanel(panelComoreservar);


    }//GEN-LAST:event_btnComoReservarActionPerformed

    private void btnCancelarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVueloActionPerformed

panelCancelarVuelo panelCancelar= new panelCancelarVuelo();
        showPanel(panelCancelar);
        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarVueloActionPerformed

    private void btnPrivacidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrivacidad1ActionPerformed


        PanelPrivacidad pnlPrivacidad= new PanelPrivacidad();
        showPanel(pnlPrivacidad);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrivacidad1ActionPerformed

    private void btnVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVueloMouseEntered
 
        btnVuelo.setBackground(new Color(16,160,216));


        // TODO add your handling code here:
    }//GEN-LAST:event_btnVueloMouseEntered

    private void btnCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondicionesActionPerformed

        panelCondiciones panelCondiciones= new panelCondiciones();
        showPanel(panelCondiciones);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCondicionesActionPerformed

    private void btnVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVueloMouseExited
 btnVuelo.setBackground(new Color(14,150,203));        // TODO add your handling code here:
    }//GEN-LAST:event_btnVueloMouseExited

    private void btnMiVueloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiVueloMouseExited
 btnMiVuelo.setBackground(new Color(14,150,203));        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiVueloMouseExited

    private void btAboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAboutUsMouseExited

        btAboutUs.setBackground(new Color(14,150,203)); // TODO add your handling code here:
    }//GEN-LAST:event_btAboutUsMouseExited

    private void btnMiVueloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiVueloMouseEntered
btnMiVuelo.setBackground(new Color(16,160,216));        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiVueloMouseEntered

    private void btAboutUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAboutUsMouseEntered
btAboutUs.setBackground(new Color(16,160,216));        // TODO add your handling code here:
    }//GEN-LAST:event_btAboutUsMouseEntered

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAboutUs;
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnCancelarVuelo;
    private javax.swing.JButton btnComoReservar;
    private javax.swing.JButton btnCondiciones;
    private javax.swing.JButton btnMiVuelo;
    private javax.swing.JButton btnPrivacidad1;
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
