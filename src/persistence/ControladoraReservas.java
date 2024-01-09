
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
           // String rutaArchivo = System.getProperty("user.home") + File.separator + "archivos/RESERVAS.txt";
           String rutaArchivo = System.getProperty("user.dir") + File.separator + "src" + File.separator + "archivos" + File.separator + "RESERVAS.txt";
           
            FileWriter fw= new FileWriter(rutaArchivo, true);
            BufferedWriter bw= new BufferedWriter(fw);

            bw.write(objectReservas.toString());
            bw.newLine();
           //si no funciona lo descomento
           bw.close();
            
            
            
        }
        catch(Throwable e){
            System.out.println(e);
        }

    }
    
    
     public String getUltimaClaveReserva(){
        try{
            //FileReader fr= new FileReader("/archivos/RESERVAS.txt");
            //BufferedReader br= new BufferedReader(fr);   
             InputStream inputStream = getClass().getClassLoader().getResourceAsStream("archivos/RESERVAS.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            
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
        //    FileReader fr= new FileReader("/archivos/RESERVAS.txt");
          //  BufferedReader br= new BufferedReader(fr);   
             InputStream inputStream = getClass().getClassLoader().getResourceAsStream("archivos/RESERVAS.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
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
