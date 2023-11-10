
package persistence;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import logic.ArchVuelos;
public class ControladoraResv {
    //esta clase se encarga de leer todos los archivos relacionaods a la reserva
    
    //a falta de base de datos, guardamos los datos en un array para que el archivo solo se lea una vez
    public ArrayList<ArchVuelos> arrayOrigenes= new ArrayList<ArchVuelos>();
    public void leerArchivoOrigenes(){//metodo para leer el archivo origenes
        try(FileReader frOrigenes= new FileReader("E:\\ARCHIVO_DESARROLLO\\ORIGEN.txt");
            BufferedReader br= new BufferedReader(frOrigenes);){
            
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
                StringTokenizer tokens= new StringTokenizer(linea,",");
                String claveOrigen=tokens.nextToken().trim();
                String origen= tokens.nextToken().trim();
                ArchVuelos objOr=new ArchVuelos(claveOrigen, origen,null,null);
                arrayOrigenes.add(objOr);
                System.out.println(objOr.toString());
            }
        }catch(Throwable e){
            System.out.println(e);
        }
    }
    public ArrayList<ArchVuelos> arrayDestinos= new ArrayList<ArchVuelos>();
    public void leerArchivoDestinos(){//metodo para leer el archivo destinos
        try(FileReader frDestinos= new FileReader("E:\\ARCHIVO_DESARROLLO\\DESTINOS.txt");
                    BufferedReader brDestinos= new BufferedReader(frDestinos);){
            
                    String linea;
                    while((linea=brDestinos.readLine())!=null){
                        StringTokenizer tokens= new StringTokenizer(linea,",");
                        String claveDestinos= tokens.nextToken().trim();
                        String desrino= tokens.nextToken().trim();
                        
                        ArchVuelos objDestinos= new ArchVuelos(null,null,claveDestinos, desrino);
                         arrayDestinos.add(objDestinos);
                         
                    }
            
        }catch(Throwable e){
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<ArchVuelos> arrayAviones= new ArrayList<ArchVuelos>();
    public void leerArchivoAviones(){//metodo para leer el archivo aviones
        try(FileReader frAviones= new FileReader("E:\\ARCHIVO_DESARROLLO\\AVIONES.txt");
            BufferedReader brAviones= new BufferedReader(frAviones);){
            
            String linea;
            while((linea=brAviones.readLine())!=null){//tokenizamos
                StringTokenizer tokens= new StringTokenizer(linea,",");
                String claveAvion= tokens.nextToken().trim();
                String modelo= tokens.nextToken().trim();
                String fecha=tokens.nextToken().trim();
                String claveOrigen=tokens.nextToken().trim();
                String claveDestino= tokens.nextToken().trim();
                String costoVuelo= tokens.nextToken().trim();
                ArchVuelos objAvion=new ArchVuelos(claveAvion, modelo, fecha, claveOrigen, claveDestino,costoVuelo);
                arrayAviones.add(objAvion);
            }
            
        }catch(Throwable e){
            System.out.println(e.getMessage());
        }
    }
    
}
