
package igu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import logic.DatosPasajero;
import logic.RastreoVuelo;

public class PnlDatosReserva extends javax.swing.JPanel {
    public PnlDatosReserva() {
        initComponents();
    }
   public String clave;
   public String nombre;
   public String apellido;
   public String edad;
   public String telefono;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtAvion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 150, 206));
        jLabel1.setText("INFORMACION DEL VUELO ");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setText("Destino");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Avion");

        txtDestino.setEditable(false);
        txtDestino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtAvion.setEditable(false);
        txtAvion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtDestino, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAvion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(13, 150, 206));
        jLabel5.setText("INFORMACION DEL PASAJERO");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("Clave del Pasajero");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Apellido");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Edad");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("Telefono");

        txtClave.setEditable(false);
        txtClave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtEdad.setEditable(false);
        txtEdad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(16, 150, 206));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MODIFICAR INFORMACION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtClave)
                            .addComponent(txtApellido)
                            .addComponent(txtEdad)
                            .addComponent(txtTelefono))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        jButton2.setBackground(new java.awt.Color(255, 34, 75));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCELAR VUELO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(118, 118, 118))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
        
    }//GEN-LAST:event_txtDestinoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nuevoTelefono=JOptionPane.showInputDialog("Dame el nuevo numero de telefono");
        String datos=getDatosPasajero();System.out.println(datos);
        modificarRegistro(nuevoTelefono, datos);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        String claveReserva= JOptionPane.showInputDialog("Para proceder con la cancelacion del vuelo necesitamos que me proporciones"
                + "\n nuevamente tu CALVE DE RESERVA");
        
     //   String clavePasajero= JOptionPane.showInputDialog("Para proceder con la cancelacion del vuelo necesitamos que me proporciones"
       //         + "\n nuevamente tu CLAVE DE PASAJERO");
 borrarRegistro(claveReserva);
        //borrarRegistroPasasjero(clavePasajero);


    }//GEN-LAST:event_jButton2ActionPerformed
    public void setDatos(){
        System.out.println("metodo setDatos, prueba0");
        System.out.println("clave "+clave);
        System.out.println("nombre "+nombre);
        System.out.println("apllido "+ apellido);
        
        String c= clave;
        String n=nombre;
        String a=apellido;
        String e= edad;
        String t= telefono;
                
      txtClave.setText(c);
      txtNombre.setText(n);
      txtApellido.setText(a);
      txtEdad.setText(e);
      txtTelefono.setText(t);
        System.out.println("llego hasta acá?");
    }
    
     RastreoVuelo arrayVueloEncontrado[]= new RastreoVuelo[1];
    
      public boolean rastrearVueloPnlDatosReserva(String inputclaveReserva,javax.swing.JLabel lbVueloEncontrado,javax.swing.JPanel pnlContenido){
     boolean encontrado=false;
        try{
         FileReader frReservas= new FileReader("E:\\ARCHIVO_DESARROLLO\\RESERVAS.txt");
         BufferedReader br= new BufferedReader(frReservas);
         String linea;
         while((linea=br.readLine())!=null){
             StringTokenizer tokens= new StringTokenizer(linea,",");
             String claveReserva=tokens.nextToken().trim();
             String clavePasajero=tokens.nextToken().trim();
             String claveAvion=tokens.nextToken().trim();
             
             if(claveReserva.equals(inputclaveReserva)){
                 
                 encontrado=true;
                 System.out.println("Clave encontrada");
                 RastreoVuelo reservaObject= new RastreoVuelo(claveReserva, clavePasajero, claveAvion);
                 arrayVueloEncontrado[0]=reservaObject;
                System.out.println(reservaObject.toString());
                
                 lbVueloEncontrado.setText("Vuelo encontrado");
                 break;
             }else{
                 System.out.println("no se encontro");
                 
                 lbVueloEncontrado.setText("Vuelo no encontrado");
                         
                             }
         }
         
     }   catch(Throwable e){
         System.out.println(e.getMessage());
     } 
 return encontrado;
    }
      
       public String getDatosPasajero(){
        System.out.println("Entre");
         String claveP= arrayVueloEncontrado[0].getClavePasajero();
        System.out.println("clave pasajero "+claveP);

         String datos="";
        try{
            FileReader frPasajero= new FileReader("E:\\ARCHIVO_DESARROLLO\\Pasajeros.txt");
            BufferedReader brPasajeros= new BufferedReader(frPasajero);
            String linea;
            
            while((linea=brPasajeros.readLine())!=null){
                
                StringTokenizer tokens= new StringTokenizer(linea,",");
              
                String cPasajero=tokens.nextToken().trim();
                String nombre=tokens.nextToken().trim();
                String apellido= tokens.nextToken().trim();
                String edad=tokens.nextToken().trim();
                String telefono= tokens.nextToken().trim();
                
                if(cPasajero.equals(claveP)){
                   
                    System.out.println("PasajeroEncontrado");
                     System.out.println("Datos del pasajero: ");
                     
                     datos=cPasajero+","+nombre+","+apellido+","+edad+","+telefono;
                     System.out.println(datos);

               break;
                    
                }
            }
            
            
        }catch(Throwable e){
            System.out.println(e);
        }
                
     return datos;
        
    }

       public String getDatosAvion(){
           String claveAvion= arrayVueloEncontrado[0].getClaveAvion();
           System.out.println("Clave Avion: "+claveAvion);
           String datosAvion="";
           String datosAvionNecesarios="";
           
           try{
                FileReader frPasajero= new FileReader("E:\\ARCHIVO_DESARROLLO\\AVIONES.txt");
            BufferedReader brPasajeros= new BufferedReader(frPasajero);
            String linea;
            
            while((linea=brPasajeros.readLine())!=null){
                
                StringTokenizer tokens= new StringTokenizer(linea,",");
              
                String cAvion=tokens.nextToken().trim();
                String modelo=tokens.nextToken().trim();
                String fecha= tokens.nextToken().trim();
                String origen=tokens.nextToken().trim();
                String destino= tokens.nextToken().trim();
                String costo= tokens.nextToken().trim();
                if(cAvion.equals(claveAvion)){
                   
                    System.out.println("Avion Encontrado");
                     System.out.println("Datos del avion: ");
                     
                     datosAvion=cAvion+","+modelo+","+fecha+","+origen+","+destino+","+costo;
                     System.out.println(datosAvion);
                     datosAvionNecesarios=fecha+","+destino+","+modelo;

               break;
                    
                }
            }
           }catch(Throwable e){
               System.out.println(e);
           }
         return datosAvionNecesarios;  

       }
       
       public void showDatosVuelo(String datosAvionNecesarios){
           StringTokenizer tokens= new StringTokenizer(datosAvionNecesarios,",");
           String fecha= tokens.nextToken().trim();
                    String cDestino=tokens.nextToken().trim();
           String modelo= tokens.nextToken();
           
           String destino=getDestino(cDestino);
           txtFecha.setText(fecha);
           txtAvion.setText(modelo);
           txtDestino.setText(destino);
       }
       
       public String getDestino(String claveDestino){
           String dest="";
           try{
            FileReader frPasajero= new FileReader("E:\\ARCHIVO_DESARROLLO\\DESTINOS.txt");
            BufferedReader brPasajeros= new BufferedReader(frPasajero);
            String linea;
            
            while((linea=brPasajeros.readLine())!=null){
                
                StringTokenizer tokens= new StringTokenizer(linea,",");
              
                String cDestino=tokens.nextToken().trim();
                String destino=tokens.nextToken().trim();
                
                if(cDestino.equals(claveDestino)){
                   
                    System.out.println("Destino encontrado");
                     System.out.println("Destino: ");
                     
                     dest=destino;
                     System.out.println(dest);

               break;
                    
                }
            }
       }catch(Throwable e){
            System.out.println(e);
        }
                
     return dest;
       }
       public void showDatosPasajero(String datos){
       
           StringTokenizer tokens=new StringTokenizer(datos,",");
           String clave= tokens.nextToken().trim();
           String nombre= tokens.nextToken().trim();
           String apellido= tokens.nextToken().trim();
           String edad= tokens.nextToken().trim();
           String teleefono= tokens.nextToken().trim();
           
           txtClave.setText(clave);
           txtNombre.setText(nombre);
           txtApellido.setText(apellido);
           txtEdad.setText(edad);
           txtTelefono.setText(teleefono);
           
       }
    
  

    public  void modificarRegistro(String cadenaModificada,String registroAModificar) {
        try {
            FileReader fr= new FileReader("E:\\ARCHIVO_DESARROLLO\\Pasajeros.txt");
            BufferedReader br= new BufferedReader(fr);
            String linea;
            
            StringBuilder nuevoContenido = new StringBuilder();

            while ((linea = br.readLine()) != null) {
                
                if (linea.equals(registroAModificar)) {
                    // Modificar la edad en el registro
                    String[] partes = linea.split(",");
                    partes[4] = String.valueOf(cadenaModificada);
                    linea = String.join(",", partes);
                }
                nuevoContenido.append(linea).append("\n");
            }

            
           
            
            // Escribir el archivo modificado en consola
            System.out.println("Archivo modificado:");
            System.out.println(nuevoContenido.toString());
            

            // Cierra los flujos
            br.close();
            
            
              FileWriter fw = new FileWriter("E:\\ARCHIVO_DESARROLLO\\Pasajeros.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(nuevoContenido.toString());
            bw.close();
            

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
    
    
     public static void borrarRegistro( String claveReserva) {
        try {
            // Ruta del archivo
            File file = new File("E:\\ARCHIVO_DESARROLLO\\RESERVAS.txt");
            File file2= new File("E:\\ARCHIVO_DESARROLLO\\Pasajeros.txt");

            // Clave del usuario a dar de baja
            String claveVuelo = claveReserva;

            // Leer el archivo
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String lineaActual;
            StringBuilder nuevoContenido = new StringBuilder();

            while ((lineaActual = br.readLine()) != null) {
                // Verificar si la línea contiene la clave a dar de baja
                if (lineaActual.startsWith(claveVuelo + ",")) {
                    StringTokenizer tok= new StringTokenizer(lineaActual,",");
                    String cR= tok.nextToken().trim();System.out.println(cR);
                    String cPasajero= tok.nextToken().trim();System.out.println(cPasajero);
                    
                    borrarRegistroPasasjero(cPasajero);
                    // Se encuentra la clave, se omite la escritura y se elimina el registro
                    continue;
                }
                nuevoContenido.append(lineaActual).append("\n");
            }

            // Escribir el archivo modificado en consola
            System.out.println("Archivo modificado:");
            System.out.println(nuevoContenido.toString());

            // Cierra los flujos
            br.close();

            // Guardar el contenido modificado en el archivo
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            FileWriter fw2 = new FileWriter(file);
            BufferedWriter bw2 = new BufferedWriter(fw2);

            bw.write(nuevoContenido.toString());
            bw2.write(nuevoContenido.toString());

            // Cierra los flujos de escritura
            bw.close();
            bw2.close();

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
     
     public static void borrarRegistroPasasjero( String clavePasajero) {
        try {
            // Ruta del archivo
            
            File file2= new File("E:\\ARCHIVO_DESARROLLO\\Pasajeros.txt");

            // Clave del usuario a dar de baja
            String clavePasajer = clavePasajero;

            // Leer el archivo
            FileReader fr = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);

            String lineaActual;
            StringBuilder nuevoContenido = new StringBuilder();

            while ((lineaActual = br.readLine()) != null) {
                // Verificar si la línea contiene la clave a dar de baja
                if (lineaActual.startsWith(clavePasajer + ",")) {
                    // Se encuentra la clave, se omite la escritura y se elimina el registro
                    continue;
                }
                nuevoContenido.append(lineaActual).append("\n");
            }

            // Escribir el archivo modificado en consola
            System.out.println("Archivo modificado:");
            System.out.println(nuevoContenido.toString());

            // Cierra los flujos
            br.close();

            // Guardar el contenido modificado en el archivo
            
           
            FileWriter fw2 = new FileWriter(file2);
            BufferedWriter bw2 = new BufferedWriter(fw2);

          
            bw2.write(nuevoContenido.toString());

            // Cierra los flujos de escritura
            
            bw2.close();

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
      
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /////////////////////////////////GETTERS AND SETTERS/////////////////////////////////////
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave =clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAvion;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
