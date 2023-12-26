
package persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import logic.DatosPasajero;

public class ControladoraDatosPasajero {
    //Esta clase se encarga de leer y escribir en el archivo pasajeros
    
    private String nombre;
    private String apellidos;
    private String edad;
    private String telefono;
    
    
    //metodo para escribir el archivo pasajeros
    public void archivoPasajeros(DatosPasajero objDatosPas){
        
    try{
       
        FileWriter fw= new FileWriter("src/archivos/Pasajeros.txt", true);
        BufferedWriter bw= new BufferedWriter(fw);
        
        bw.write(objDatosPas.toString());
         bw.newLine();
        
        bw.close();
       
        
        
    }catch(Throwable e){
        System.out.println(e);
    }    
    }
    
    
    
}
