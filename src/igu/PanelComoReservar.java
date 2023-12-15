
package igu;


public class PanelComoReservar extends javax.swing.JPanel {


    
private String texto = "¡Hola Pasajero! En esta sección, te explicaré paso a paso cómo realizar una reserva en nuestra App. " + "\n"
        + "<ol>"
        + "<li>Dirígete a la interfaz principal. Una vez allí, selecciona el origen y destino de tu viaje.</li>"
        + "<li>Después de elegir el origen y destino, presiona el botón 'BUSCAR'. Esto verificará la disponibilidad de fechas de vuelo. También, elige el número de pasajeros (máximo 7).</li>"
        + "<li>Cuando estés seguro de tu elección, presiona 'RESERVAR'.</li>"
        + "<li>Completa el formulario con tus datos personales. Después de llenar todos los campos, presiona 'GUARDAR'.</li>"
        + "<li>Continúa con el pago. Ingresa los datos de tu tarjeta y selecciona 'REALIZAR PAGO'.</li>"
        + "<li>¡Todo listo! Ahora, solo queda disfrutar de tu vuelo.</li>"
        + "</ol>";



public String strHtml(String texto) {
    return "<html><p style='text-align: justify;'>" + texto + "</p></html>";
}


    public PanelComoReservar() {
        initComponents();
        lbinfo.setText(strHtml(texto));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbinfo = new javax.swing.JLabel();

        lbinfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lbinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbinfo;
    // End of variables declaration//GEN-END:variables
}
