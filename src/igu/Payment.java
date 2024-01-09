package igu;

import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;


import logic.*;
import persistence.ControladoraReservas;
import com.itextpdf.text.Document;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

public class Payment extends javax.swing.JFrame {

    
    String claveAvionn="";
    String origen="";
    String destino="";
    String fecha="";
    String clavePas="";

    String claveReserva;
    
    
    public Payment() {
        initComponents();
        btnHome.setVisible(false);
        
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbPago = new javax.swing.JLabel();
        lbmostrarDisponible = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbmostrarDisponible1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPago = new javax.swing.JButton();
        txtNumTarjeta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVigencia = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtNombreTitular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnHome = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/billetera.png"))); // NOI18N
        jPanel1.add(lbPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 40, 40));

        lbmostrarDisponible.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lbmostrarDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garrapata.png"))); // NOI18N
        jPanel1.add(lbmostrarDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 40, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Pago");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 255, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 255, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 340, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Completado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Completado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        lbmostrarDisponible1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lbmostrarDisponible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garrapata.png"))); // NOI18N
        jPanel1.add(lbmostrarDisponible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 255, 0));
        jSeparator4.setForeground(new java.awt.Color(51, 255, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 340, 30));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRE DEL TITULAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("NUMERO DE TARJETA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        btnPago.setBackground(new java.awt.Color(14, 150, 206));
        btnPago.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnPago.setText("REALIZAR PAGO");
        btnPago.setBorder(null);
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 120, 30));

        txtNumTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumTarjetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumTarjetaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 190, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("CLAVE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("VIGENCIA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        txtVigencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVigenciaKeyTyped(evt);
            }
        });
        jPanel1.add(txtVigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 190, 30));

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 190, 30));

        txtNombreTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTitularActionPerformed(evt);
            }
        });
        txtNombreTitular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTitularKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 190, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 160, 206));
        jLabel7.setText("PAGO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 910, 10));

        btnHome.setBackground(new java.awt.Color(16, 150, 206));
        btnHome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnHome.setText("VOLVER AL INICIO ");
        btnHome.setBorder(null);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 450, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendario.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 40, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/us.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 40, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clave.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 40, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tarjeta.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 40, 50));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void datosReserva(){

      //  ArchVuelos getClave= new ArchVuelos();
        //claveAvionn= getClave.claveAvionSelec;
        
        //System.out.println("Obtenido correctamente claveAvion "+ claveAvionn);
        
        
                
    }

  
    
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed

        //datosReserva();

        
 
        System.out.println("Lo obtube correctamente ...."+claveAvionn);
        System.out.println("Lo ontuve correctamente... "+clavePas);

        
        
        
        comprobarCamposLlenos();
        
        
        
        
        
        

        
    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
    this.setVisible(false);
        InterfazPrincipal objectInterfazPrincipal= new InterfazPrincipal();
        objectInterfazPrincipal.setVisible(true);
        objectInterfazPrincipal.setLocationRelativeTo(null);
         objectInterfazPrincipal.agregarItems();//con metodo de la interfaz principal agregamos informacion obtenida de los archivos leidos 
    }//GEN-LAST:event_btnHomeActionPerformed

    private void txtNumTarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTarjetaKeyPressed


            
    }//GEN-LAST:event_txtNumTarjetaKeyPressed

    private void txtNumTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumTarjetaKeyTyped
 char c = evt.getKeyChar();
                if (!Character.isDigit(c) || txtNumTarjeta.getText().length() >= 16) {
                   getToolkit().beep();
                    evt.consume(); // Consume el evento si no es un dígito o se excede la longitud
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumTarjetaKeyTyped

    private void txtNombreTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTitularActionPerformed

    private void txtNombreTitularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTitularKeyTyped
 char c = evt.getKeyChar();
                if (Character.isDigit(c)) {
                   getToolkit().beep();
                    evt.consume(); // Consume el evento si no es un dígito o se excede la longitud
                }        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTitularKeyTyped

    private void txtVigenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVigenciaKeyTyped

        char c = evt.getKeyChar();
                if (Character.isLetter(c)) {
                   getToolkit().beep();
                    evt.consume(); // Consume el evento si no es un dígito o se excede la longitud
                } 


    }//GEN-LAST:event_txtVigenciaKeyTyped

    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyTyped


      

    }//GEN-LAST:event_txtClaveKeyTyped

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed


        if(evt.getExtendedKeyCode()== evt.VK_ENTER){
           btnPago.requestFocus();
           btnPago.doClick();
   
    }
        

        
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        FormDatosPasajero formPaas= new FormDatosPasajero();
        formPaas.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed
 boolean camposLlenos=false;
 Reserva objectReserva= new Reserva();
 
 
    public void comprobarCamposLlenos(){
        
       
        
        String numtarjeta=txtNumTarjeta.getText();
        String nombreTitu= txtNombreTitular.getText();
        String vigencia= txtVigencia.getText();
        String claveTarjeta= txtClave.getText();
        if(numtarjeta.isEmpty()||nombreTitu.isEmpty()||vigencia.isEmpty()||claveTarjeta.isEmpty()){
          
        
        
            JOptionPane.showMessageDialog(null,"Campos incompletos");
           
            
        }else{
             
            claveReserva= objectReserva.generarClaveReserva(clavePas, claveAvionn);
        System.out.println("generada correctamente..... "+claveReserva);
        Reserva objetoResv= new Reserva(claveReserva, clavePas, claveAvionn);
        System.out.println(objetoResv.toString());
        ControladoraReservas obj= new ControladoraReservas();
        obj.guardarReserva(objetoResv);
        
            camposLlenos=true;
            JOptionPane.showMessageDialog(null,"Reservacion realizada correctamente");
            lbPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/garrapata.png")));
           
            btnHome.setVisible(true);
            pdf();
        }
        
        
        
    }
    
    public void setClavePas(String clavePas) {
        this.clavePas = clavePas;
    }

    public void setClaveAvionn(String claveAvionn) {
        this.claveAvionn = claveAvionn;
    }
    ///////////////////////////////////
   
      private static byte[] convertirImagenABytes(BufferedImage bufferedImage) throws IOException {
        // Convertir BufferedImage a bytes
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          ImageIO.write(bufferedImage, "png", baos);
        return baos.toByteArray();
    }

    
  
    
    public void pdf(){
        try{
            FileOutputStream archivo;
   
            File file = new File("src/pdf/Ticket_Reserva_"+claveReserva+".pdf");
            archivo= new FileOutputStream(file);
         
                // Ruta de la imagen
            String rutaImagen = "ruta/a/tu/imagen.png";

            // Crear un objeto Image
            
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            documento.open();
           // Image logo= new Image.getInstance("E:\\Avance\\AppAerolinea\\src\\Images\\burrologo.png") 
            //;
             File fileImagen=new File("src\\Images\\burrologo.png");
    BufferedImage bufferedImage = ImageIO.read(fileImagen);
    
       byte[] imageBytes = convertirImagenABytes(bufferedImage);
       
            
    
    
    
            Paragraph fecha= new Paragraph();
            Font negrita= new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK);
            
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            
                    
            fecha.add("Fecha: "+ new SimpleDateFormat("dd-mm-yyyy").format(date)+"\n");
            
            PdfPTable header= new PdfPTable(4);
            header.setWidthPercentage(100);
            header.getDefaultCell().setBorder(0);
            float[] columnsHeader = new float[]{30f,40f, 46f, 36f};
            header.setWidths(columnsHeader);
            
            header.setHorizontalAlignment(Element.ALIGN_LEFT);
           header.addCell(Image.getInstance(imageBytes));
            header.addCell("");
            String nombre= "BURROSWINGS";
            String tel= "5526916007";
            String direccion= "Cecyt 3";
            String razon= "Reservas";
            
            header.addCell(nombre+"\nTelefono: "+tel+"\nDireccion: "+direccion+"\nRazon: "+razon);
            header.addCell(fecha);
            documento.add(header);
            
            
            
            PdfPTable body= new PdfPTable(1);
            body.getDefaultCell().setBorder(0);
            float[] columnsBody = new float[]{50f,50f};
            body.setWidthPercentage(100);
            body.setHorizontalAlignment(Element.ALIGN_LEFT);
            body.addCell("Tu clave de reserva es: "+claveReserva);
            
            //body.addCell("Clave Pasajero: "+""+"\nNombre: "+""+"\nApellido: "+""+"\nEdad: "+""+"\nContacto: ");
            documento.add(body);
            documento.close();
            archivo.close();
            System.out.println("Pdf creado exitosamente");
                    
         
            
            
            
            
            
        }catch(Throwable e){
            System.out.println(e);
        }
    }

   
   
  
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbPago;
    private javax.swing.JLabel lbmostrarDisponible;
    private javax.swing.JLabel lbmostrarDisponible1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombreTitular;
    private javax.swing.JTextField txtNumTarjeta;
    private javax.swing.JTextField txtVigencia;
    // End of variables declaration//GEN-END:variables
}
