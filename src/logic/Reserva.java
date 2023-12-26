
package logic;

import igu.FormDatosPasajero;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Reserva  {
    
    private String claveReserva;
    private String clavePasajero;
    private String claveAvion;
    
    public Reserva(){
        
    }
 
    public Reserva(String claveReserva, String clavePasajero, String claveAvion){
     this.claveReserva= claveReserva;
    this.clavePasajero= clavePasajero;
   this.claveAvion= claveAvion;
            
 }
    public String toString(){
        return claveReserva+","+clavePasajero+","+claveAvion;
    }
    
    

 public String generarClaveReserva(String clavePasajero,String claveAvion){
     //La clave reserva va ser generada automaticamente
     //iniciara desde '1' e irá incrementando de uno en uno cada que se registre un nuevo vuelo
     String clavePas=""+clavePasajero.charAt(0)+clavePasajero.charAt(1)+clavePasajero.charAt(2)+clavePasajero.charAt(3);
     String claveAv=""+claveAvion.charAt(2)+claveAvion.charAt(3);
             
     String  claveReserva= clavePas+claveAv;
     return claveReserva;
 }
 

   


    public String getClaveReserva(){
        try{
            FileReader fr= new FileReader("src/archivos/RESERVAS.txt");
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


}
