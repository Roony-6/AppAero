
package logic;

import igu.FormDatosPasajero;
import java.lang.reflect.Array;
import persistence.ControladoraResv;
import igu.InterfazPrincipal;
import java.util.ArrayList;

public class ArchVuelos {
    
    private String claveOrigen;
    private String origen;
    private String claveDestino;
    private String destino;
    private String claveAvion;
    private String modelo;
     private String fecha;
     //instanciamos un objeto de la clase controladora para acceder a la informacion leida
    ControladoraResv control= new ControladoraResv();
    //InterfazPrincipal mainInterface= new InterfazPrincipal();
            
    
    //constructores
    public ArchVuelos(){
        
    }
    public ArchVuelos(String claveOrigen, String origen,String claveDestino, String desrino){
        this.claveOrigen=claveOrigen;
        this.origen=origen;
        this.claveDestino= claveDestino;
        this.destino= desrino;
                
    }
    public ArchVuelos(String claveAvion, String modelo, String fecha, String claveOrigen,String claveDestino){
        this.claveAvion=claveAvion;
        this.modelo=modelo;
        this.fecha= fecha;
        this.claveOrigen= claveOrigen;
        this.claveDestino= claveDestino;
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
        return "origen: "+origen+" destino: "+destino+" fecha: "+fecha;
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
    public void buscarFecha(javax.swing.JButton btnReservar,javax.swing.JComboBox<String> cmboxDestinos,javax.swing.JComboBox<String> cmboxOrigenes,javax.swing.JComboBox<String> cmboxFechas, javax.swing.JLabel lbEncontrado){
     control.leerArchivoAviones();
        int selectedOrigenIndex= cmboxOrigenes.getSelectedIndex();
        System.out.println("indice origen selecconado: "+selectedOrigenIndex);
        int selectedDestinoIndex=cmboxDestinos.getSelectedIndex();
        System.out.println("indice destino seleccionado: "+selectedDestinoIndex);
        String origenselectedClave= control.arrayOrigenes.get(selectedOrigenIndex).getClaveOrigen();
        System.out.println("origen selec clave:" +origenselectedClave);
        String destinoSelectedClave= control.arrayDestinos.get(selectedDestinoIndex).getClaveDestino();
        System.out.println("dest selec clve:"+destinoSelectedClave);
      btnReservar.setEnabled(false);
        for(int i=0;i<control.arrayAviones.size();i++){
        if(origenselectedClave.equals(control.arrayAviones.get(i).getClaveOrigen())&& destinoSelectedClave.equals(control.arrayAviones.get(i).getClaveDestino())){
       cmboxFechas.removeAllItems();
       lbEncontrado.setText("");
       cmboxFechas.addItem(control.arrayAviones.get(i).getFecha());
       
       lbEncontrado.setText("Vuelo encontrado...");
      btnReservar.setEnabled(true);
        }
        }
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
    
   
    
}
