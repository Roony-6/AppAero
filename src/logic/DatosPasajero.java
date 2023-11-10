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
    public DatosPasajero(){        
    }
    //constructor
    public DatosPasajero(String origen, String destino,String fecha){
        this.origen=origen;
        this.destino=destino;
        this.fecha=fecha;
    }

    public DatosPasajero(String nombre, String apellido, String edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    public String toString(){
        return nombre +","+apellido+","+edad +","+telefono;
    }

    
    public DatosPasajero arrayPasajeros[]= new DatosPasajero[1];
 
    
    public void getDatosPasajeros(DatosPasajero arraDatosPasajero[]){
        
        FormDatosPasajero objdatosPas= new FormDatosPasajero();// array donde se guardó la informacion del pasajero (interfaz FormDatosPasajeros)
        System.out.println("Entré a este metodo");
        System.out.println(arraDatosPasajero[0].toString());//verificamos por consola el objeto
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



    
}
