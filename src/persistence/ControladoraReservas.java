
package persistence;
import java.io.*;
import java.util.StringTokenizer;
import logic.Reserva;
public class ControladoraReservas {
    
    
    String claveReserva;
    String clavPasajero;
    String claveAvion;
    
    
    
    public void guardarReserva(Reserva objectReservas){
        
        try{
            FileWriter fw= new FileWriter("E:\\ARCHIVO_DESARROLLO\\RESERVAS.txt", true);
            BufferedWriter bw= new BufferedWriter(fw);

            bw.write(objectReservas.toString());
            bw.newLine();
            bw.close();
            
            
            
        }
        catch(Throwable e){
            System.out.println(e);
        }

    }
    
    
     public String getUltimaClaveReserva(){
        try{
            FileReader fr= new FileReader("E:\\ARCHIVO_DESARROLLO\\RESERVAS.txt");
            BufferedReader br= new BufferedReader(fr);   
            
            String linea;
            
            while((linea=br.readLine())!=null){
                
                StringTokenizer tokens= new StringTokenizer(linea,",");
                
                String claveReserva=tokens.nextToken().trim();

            }
              
        }catch(Throwable e){
            System.out.println(e);
        }
        return claveReserva;
    }
            
     
    Reserva arrayReservas[]= new Reserva[1];
    public void readArchivoReservas(){
        try{
            FileReader fr= new FileReader("E:\\ARCHIVO_DESARROLLO\\RESERVAS.txt");
            BufferedReader br= new BufferedReader(fr);   
            
            String linea;
            while((linea=br.readLine())!=null){
                
                StringTokenizer tokens= new StringTokenizer(linea,",");
                
                String claveReserva=tokens.nextToken().trim();
                String clavePasajero=tokens.nextToken().trim();
                String claveAvion= tokens.nextToken().trim();
                Reserva objetoReserva= new Reserva(claveReserva, clavePasajero, claveAvion);
                arrayReservas[0]= objetoReserva;
                System.out.println(arrayReservas[0].toString());
            }
        }catch(Throwable e){
            System.out.println(e);
        }
    }
    
    
    
    
    
}
