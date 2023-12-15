
package logic;

import igu.FormDatosPasajero;
import java.lang.reflect.Array;
import persistence.ControladoraResv;
import igu.InterfazPrincipal;
import igu.Payment;
import java.util.ArrayList;

public class ArchVuelos {
    
    private String claveOrigen;
    private String origen;
    private String claveDestino;
    private String destino;
    private String claveAvion;
    private String modelo;
     private String fecha;
     private String costoVuelo;
     private int indice=0;
     //instanciamos un objeto de la clase controladora para acceder a la informacion leida
    ControladoraResv control= new ControladoraResv();
    //InterfazPrincipal mainInterface= new InterfazPrincipal();
          
    public String claveAvionSelec;
    
    //constructores
    public ArchVuelos(){
        
    }
    public ArchVuelos(String claveOrigen, String origen,String claveDestino, String desrino){
        this.claveOrigen=claveOrigen;
        this.origen=origen;
        this.claveDestino= claveDestino;
        this.destino= desrino;
                
    }
    public ArchVuelos(String claveAvion, String modelo, String fecha, String claveOrigen,String claveDestino, String costoVuelo){
        this.claveAvion=claveAvion;
        this.modelo=modelo;
        this.fecha= fecha;
        this.claveOrigen= claveOrigen;
        this.claveDestino= claveDestino;
        this.costoVuelo=costoVuelo;
    }

    public ArchVuelos(String origen, String destino, String fecha) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }
    
    public String toString(){
        return "Clave Origen: "+claveOrigen+"\nOrigen: "+origen;
    }
    public String prueba(){
        return "origen: "+origen+" destino: "+destino+" fecha: "+fecha+ " costo:"+costoVuelo;
    }
    //metodo para mostrar los destinos disponibles leidos desde del archivo destinos
    public void setTokeonsOrigen(javax.swing.JComboBox<String> cmboxOrigenes){
        System.out.println("hola");
        control.leerArchivoOrigenes();
                
        for(int i=0;i<control.arrayOrigenes.size();i++){
            
            String origen=control.arrayOrigenes.get(i).getOrigen();
            System.out.println(origen);
            cmboxOrigenes.addItem(origen);
            
        }    
    }
    //metodo para mostrar los origenes disponibles  leidos del archivo destinos
    public void setTokensDestinos(javax.swing.JComboBox<String> cmboxDestinos){
     control.leerArchivoDestinos();
        System.out.println("Destinos: ");
        for(int i=0;i<control.arrayDestinos.size();i++){
            String destino= control.arrayDestinos.get(i).getDestino();
            System.out.println(destino);
            cmboxDestinos.addItem(destino);
            
        }
    }
  // metodo que busca y muestra los vuelos disponibles de acuerdo al Origen y Destino seleccionado
    //////
    Payment o = new Payment();
    public void buscarFecha(javax.swing.JButton btnReservar,javax.swing.JComboBox<String> cmboxDestinos,javax.swing.JComboBox<String> cmboxOrigenes,javax.swing.JComboBox<String> cmboxFechas, javax.swing.JLabel lbEncontrado,javax.swing.JLabel lbShowCosto
   ,javax.swing.JLabel lbCosto, javax.swing.JLabel lbFechas, javax.swing.JLabel lbNumPas, javax.swing.JButton btnIncrementar,javax.swing.JButton btndecrementar
    ,javax.swing.JLabel lbContador){
        control.leerArchivoAviones();
        int selectedOrigenIndex= cmboxOrigenes.getSelectedIndex();
        System.out.println("indice origen selecconado: "+selectedOrigenIndex);
        int selectedDestinoIndex=cmboxDestinos.getSelectedIndex();
        System.out.println("indice destino seleccionado: "+selectedDestinoIndex);
        String origenselectedClave= control.arrayOrigenes.get(selectedOrigenIndex).getClaveOrigen();
        System.out.println("origen selec clave:" +origenselectedClave);
        String destinoSelectedClave= control.arrayDestinos.get(selectedDestinoIndex).getClaveDestino();
        System.out.println("dest selec clve:"+destinoSelectedClave);
        String costoVuelo;
      String claveAvion;
      //btnReservar.setEnabled(false);
      

       
               
              
        for(int i=0;i<control.arrayAviones.size();i++){
            
        lbEncontrado.setText("");    
        if(origenselectedClave.equals(control.arrayAviones.get(i).getClaveOrigen())&& destinoSelectedClave.equals(control.arrayAviones.get(i).getClaveDestino())){
       cmboxFechas.removeAllItems();
       indice=i;
       costoVuelo=control.arrayAviones.get(i).getCostoVuelo();
       claveAvionSelec=control.arrayAviones.get(i).getClaveAvion();
            System.out.println("Clave Avion "+claveAvionSelec);
            claveAvion=control.arrayAviones.get(i).getClaveAvion();
            
            
            System.out.println("Indice de avion: "+indice);
       cmboxFechas.addItem(control.arrayAviones.get(i).getFecha());
       
       
       lbEncontrado.setText("Vuelo encontrado...");
       lbShowCosto.setText(costoVuelo);
       btnReservar.setVisible(true);
     btnReservar.setEnabled(true);
     
     lbCosto.setVisible(true);
    cmboxFechas.setVisible(true);
    lbFechas.setVisible(true);
    lbNumPas.setVisible(true);
    btnIncrementar.setVisible(true);
    btndecrementar.setVisible(true);
    lbContador.setVisible(true);
     
     /*
     
      javax.swing.JLabel lbCosto
   javax.swing.JComboBox<String> cmboxFechas
    javax.swing.JLabel lbFechas
     javax.swing.JLabel lbNumPas
             javax.swing.JButton btnIncrementar
                     javax.swing.JButton btndecrementar
                             javax.swing.JLabel lbContador
     
     
     
     
     
     */
     
     
     
     
        }
        }
    }
    
    ////MODIFICAR ESTE METODO
    public int getCosto(){
        String costoVuelo=control.arrayAviones.get(indice).getCostoVuelo();
        int consto=Integer.parseInt(costoVuelo);
        return consto;
    }
    


    //getters (por si se ocupan)

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public void main(){
        
    }
    public String getClaveOrigen() {
        return claveOrigen;
    }

    public String getClaveDestino() {
        return claveDestino;
    }

    public String getClaveAvion() {
        return claveAvion;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCostoVuelo() {
        return costoVuelo;
    }
    
    
   
    
}
