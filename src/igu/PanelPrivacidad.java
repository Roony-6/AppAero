package igu;

public class PanelPrivacidad extends javax.swing.JPanel {

    public PanelPrivacidad() {
        initComponents();
        lbPrivacidad.setText(strHtmlPrivacidad(textoPrivacidad));
    }

    private String textoPrivacidad = "En nuestra compañía, nos preocupamos por la seguridad y privacidad de tus datos. Queremos asegurarte que tu información personal está en buenas manos. A continuación, te proporcionamos algunos detalles sobre nuestra política de privacidad: " + "<ul>"
        + "<li>Recopilamos solo la información necesaria para procesar tus reservas y mejorar nuestros servicios.</li>"
        + "<li>No compartimos tu información con terceros sin tu consentimiento expreso.</li>"
        + "<li>Tu historial de vuelo y detalles de pago están protegidos mediante protocolos de seguridad avanzados.</li>"
        + "<li>Siempre tienes el control de tus preferencias de comunicación y puedes optar por no recibir correos electrónicos promocionales.</li>"
        + "</ul>"
        + "Nos esforzamos por mantener la transparencia y brindarte la mejor experiencia posible. Si tienes alguna pregunta o inquietud sobre nuestra política de privacidad, no dudes en ponerte en contacto con nuestro equipo de atención al cliente.";

public String strHtmlPrivacidad(String textoPrivacidad) {
    return "<html><p style='text-align: justify;'>" + textoPrivacidad + "</p></html>";
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPrivacidad = new javax.swing.JLabel();

        lbPrivacidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lbPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbPrivacidad;
    // End of variables declaration//GEN-END:variables
}
