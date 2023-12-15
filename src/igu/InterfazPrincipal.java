
package igu;

import java.util.ArrayList;
import logic.*;
public class InterfazPrincipal extends javax.swing.JFrame {

    String claveAvion="";
    
    public InterfazPrincipal() {
        initComponents();
        btnReservar.setVisible(false);
        lbCosto.setVisible(false);
    cmboxFechas.setVisible(false);
    lbFechas.setVisible(false);
    lbNumPas.setVisible(false);
    btnIncrementar.setVisible(false);
    btndecrementar.setVisible(false);
    lbContador.setVisible(false);
       
  
    }
    
ArchVuelos archVuelos= new ArchVuelos();
FormDatosPasajero formDatosP= new FormDatosPasajero();
public void agregarItems(){
     archVuelos.setTokeonsOrigen(cmboxOrigenes);
     archVuelos.setTokensDestinos(cmboxDestinos);
     
     btnReservar.setEnabled(false);

   // archVuelos.setTokensAviones(cmboxFechas, cmboxDestinos, cmboxOrigenes);
}
String costo;

public DatosPasajero arrayResumenVuelos[]= new DatosPasajero[1];
public void llenarArrayResumen0(){
    String origen= cmboxOrigenes.getSelectedItem().toString();
    System.out.println("resumen origen:"+origen);
    String destino= cmboxDestinos.getSelectedItem().toString();
    System.out.println("resumen destino:"+destino);
    String fecha= cmboxFechas.getSelectedItem().toString();
    System.out.println("resumen fecha: "+fecha);
    String numPasajeros=lbContador.getText();
    System.out.println("Num pasajeros: "+numPasajeros);
   costo=lbShowCosto.getText();
    System.out.println("costo: "+costo);
    
   DatosPasajero objResumenVuelo= new DatosPasajero(origen, destino, fecha,numPasajeros, costo);
    arrayResumenVuelos[0]=objResumenVuelo;
    System.out.println(""+arrayResumenVuelos[0].resumenToString());
    
}
    public void calcularPrecio(){
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        cmboxOrigenes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmboxDestinos = new javax.swing.JComboBox<>();
        lbFechas = new javax.swing.JLabel();
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
        lbContador = new javax.swing.JLabel();
        btndecrementar = new javax.swing.JButton();
        btnIncrementar = new javax.swing.JButton();
        lbNumPas = new javax.swing.JLabel();
        lbCosto = new javax.swing.JLabel();
        lbShowCosto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmboxOrigenes.setBackground(new java.awt.Color(241, 255, 255));
        cmboxOrigenes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmboxOrigenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 255, 255)));
        cmboxOrigenes.setPreferredSize(new java.awt.Dimension(69, 16));
        jPanel1.add(cmboxOrigenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 170, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("ORIGEN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        cmboxDestinos.setBackground(new java.awt.Color(241, 255, 255));
        cmboxDestinos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmboxDestinos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 255, 255)));
        jPanel1.add(cmboxDestinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 170, 40));

        lbFechas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbFechas.setText("FECHAS DISPONIBLES");
        jPanel1.add(lbFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("DESTINO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        cmboxFechas.setBackground(new java.awt.Color(241, 255, 255));
        cmboxFechas.setToolTipText("bzfdbdfdn");
        cmboxFechas.setBorder(null);
        cmboxFechas.setOpaque(true);
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
        jPanel1.add(cmboxFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 190, 30));

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
        jPanel1.add(btnBuscarFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 170, 30));

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
        jPanel1.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 190, 30));

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

        lbContador.setBackground(new java.awt.Color(255, 255, 255));
        lbContador.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbContador.setForeground(new java.awt.Color(153, 153, 153));
        lbContador.setText("1");
        jPanel1.add(lbContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 20, 60));

        btndecrementar.setBackground(new java.awt.Color(255, 255, 255));
        btndecrementar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menos.png"))); // NOI18N
        btndecrementar.setBorder(null);
        btndecrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndecrementarActionPerformed(evt);
            }
        });
        jPanel1.add(btndecrementar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 30, -1));

        btnIncrementar.setBackground(new java.awt.Color(255, 255, 255));
        btnIncrementar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mas.png"))); // NOI18N
        btnIncrementar.setBorder(null);
        btnIncrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncrementarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIncrementar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 30, -1));

        lbNumPas.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbNumPas.setText("NUMERO DE PASAJEROS");
        jPanel1.add(lbNumPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        lbCosto.setBackground(new java.awt.Color(255, 255, 255));
        lbCosto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lbCosto.setForeground(new java.awt.Color(14, 248, 87));
        lbCosto.setText("COSTO");
        jPanel1.add(lbCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 60, -1));

        lbShowCosto.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jPanel1.add(lbShowCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 70, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Vuelo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Info personal");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Pago");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, -1, -1));

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
        System.out.println("Encontré el vuelo");
        archVuelos.buscarFecha(btnReservar, cmboxDestinos, cmboxOrigenes, cmboxFechas, lbEncontrado, lbShowCosto, lbCosto, lbFechas, lbNumPas, btnIncrementar, btndecrementar, lbContador);
        lbContador.setText("1");
        costo=lbShowCosto.getText();
        System.out.println("prueba metodo get costo:"+ costo);
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
        String numPasajeros=arrayResumenVuelos[0].getNumeroPasajeros();
        String costoTotal=arrayResumenVuelos[0].getCostoVuelo();
        /////////////
        claveAvion=archVuelos.claveAvionSelec;
        formDatosP.setClaveavion(claveAvion);
        System.out.println(claveAvion+" prueba de que obtuve la claveAvion......");
        System.out.println("obtenida correctamente....");
        // Actualizar los campos de texto en la interfaz FormDatosPasajero
        formDatosP.actualizarResumen(origen, destino, fecha,numPasajeros,costoTotal);
        this.setVisible(false);
        
     

        
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnReservarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservarMousePressed

    private void btnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVueloActionPerformed
        
    }//GEN-LAST:event_btnVueloActionPerformed

    private void btnMiVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiVueloActionPerformed
this.setVisible(false);
        RastrearVuelo objRastrearVuelo= new RastrearVuelo();
       objRastrearVuelo.setVisible(true);
       objRastrearVuelo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMiVueloActionPerformed

    private void btAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAboutUsActionPerformed
this.setVisible(false);
        AboutUS abtUs= new AboutUS();
abtUs.setVisible(true);
abtUs.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btAboutUsActionPerformed

    private void cmboxFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxFechasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxFechasActionPerformed

    private void btndecrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndecrementarActionPerformed
        int costoVuelo=Integer.parseInt(costo);
        int totalAPagar=costoVuelo
                ;
        int contadoramenos= getIdexPasajeros();
        if(contadoramenos>1){
            System.out.println("Disminuí");
             contadoramenos--;
             totalAPagar=costoVuelo*contadoramenos;
              setNumPasajeros(contadoramenos);
              lbShowCosto.setText(String.valueOf(totalAPagar));
        }
        
        
    }//GEN-LAST:event_btndecrementarActionPerformed

    private void btnIncrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncrementarActionPerformed
       int costoVuelo=Integer.parseInt(costo);
        int contadorMas= getIdexPasajeros();
        int totalAPagar=costoVuelo;
        
        if(contadorMas<7){
            System.out.println("Aumenté");
            
            contadorMas++;
            totalAPagar=costoVuelo*contadorMas;
                    
              
            setNumPasajeros(contadorMas);
            lbShowCosto.setText(String.valueOf(totalAPagar));
                    
            
        }
    }//GEN-LAST:event_btnIncrementarActionPerformed

    //Este metodo obtiene el numero de pasajeros seleccionasdos
    public int getIdexPasajeros(){
        int contador= Integer.parseInt(lbContador.getText());       
        return contador;
                
    }
    //Este metodo setea la etiqueta numero de pasajros
    public void setNumPasajeros(int contador){
       
        lbContador.setText(String.valueOf(contador));
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAboutUs;
    private javax.swing.JButton btnBuscarFechas;
    private javax.swing.JButton btnIncrementar;
    private javax.swing.JButton btnMiVuelo;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVuelo;
    private javax.swing.JButton btndecrementar;
    private javax.swing.JComboBox<String> cmboxDestinos;
    private javax.swing.JComboBox<String> cmboxFechas;
    private javax.swing.JComboBox<String> cmboxOrigenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel lbContador;
    private javax.swing.JLabel lbCosto;
    private javax.swing.JLabel lbEncontrado;
    private javax.swing.JLabel lbFechas;
    private javax.swing.JLabel lbNumPas;
    private javax.swing.JLabel lbShowCosto;
    private javax.swing.JLabel lbmostrarDisponible;
    // End of variables declaration//GEN-END:variables
}
