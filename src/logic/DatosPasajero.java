package logic;
import igu.*;
import java.util.ArrayList;
import persistence.ControladoraDatosPasajero;
public class DatosPasajero {
    private String origen;
    private String destino;
    private String fecha;
    private String nombre;
    private String apellido;
    private String edad;
    private String telefono;
    private String numeroPasajeros;
    private String costoVuelo;
    protected String clavePasajero;
    protected String claveAvion;
    public DatosPasajero(){        
    }
    /////////////////////////////////////////////NOTA MUY IMPORTANTE//////////////////////////////////////////////////////
    //Recien me doy cuenta que en estas clases puedo ocupar herencia
    //Nota: Modificar codigo para reutilizar codigo y mejorar la eficiencia
    //constructor
    public DatosPasajero(String origen, String destino,String fecha,String numPasajeros,String costoVuelo){
        this.origen=origen;
        this.destino=destino;
        this.fecha=fecha;
        this.numeroPasajeros=numPasajeros;
        this.costoVuelo= costoVuelo;
        
    }

    public DatosPasajero(String clavePasajero,String nombre, String apellido, String edad, String telefono, String numerPasajeros) {
       this.clavePasajero=clavePasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public String toString(){
        return clavePasajero+","+nombre +","+apellido+","+edad +","+telefono;
    }

    public String resumenToString(){
        return "Origen: "+origen+" Destino: "+destino+" Fecha: "+" NumPasajeros: "+numeroPasajeros+"  costo: "+costoVuelo;
    }
    
    public DatosPasajero arrayPasajeros[]= new DatosPasajero[1];
 
    //////MODIFICAR PARA QUE LOS DATOS SE GUARDEN CUANDO SE REALICE EL PAGO////////////////////////////////////
    
    
    
    public void getDatosPasajeros(DatosPasajero arraDatosPasajero[]){
        
        FormDatosPasajero objdatosPas= new FormDatosPasajero();// array donde se guardó la informacion del pasajero (interfaz FormDatosPasajeros)
        System.out.println("Entré a este metodo");
        System.out.println(arraDatosPasajero[0].toString());//verificamos por consola el objeto
        
        //registra el objeto en el archivo
        
        ControladoraDatosPasajero controladoraPasajero= new ControladoraDatosPasajero();
        
        controladoraPasajero.archivoPasajeros(arraDatosPasajero[0]);
        System.out.println("Guardé los datos correctamente...");
          
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setCostoVuelo(String costoVuelo) {
        this.costoVuelo = costoVuelo;
    }

    public String getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public String getClavePasajero() {
        return clavePasajero;
    }

    public String getCostoVuelo() {
        return costoVuelo;
    }

    public String getClaveAvion() {
        return claveAvion;
    }
 

    

    
}
