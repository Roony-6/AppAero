
package logic;
import igu.PnlDatosReserva;
import igu.RastrearVuelo;
import java.io.*;
import java.util.StringTokenizer;
public class RastreoVuelo extends DatosPasajero{
    
    
    String claveReserva;
    public RastreoVuelo(){
        
    }
    public RastreoVuelo(String claveReserva,String clavePasajero,String claveAvion){
        this.claveReserva=claveReserva;
        this.clavePasajero=clavePasajero;
        this.claveAvion=claveAvion;
       
    }
    
    public String toString(){
        return claveReserva+","+clavePasajero+","+claveAvion;
    }
    
    
    /*
     public void rastrearVuelo(String clavePasajero,javax.swing.JButton btnVer,javax.swing.JLabel lbVueloEncontrado){
     try{
         FileReader fr= new FileReader("E:\\ARCHIVO_DESARROLLO\\Pasajeros.txt");
         BufferedReader br= new BufferedReader(fr);

         String linea;
         boolean encontrado=false;
         while((linea=br.readLine())!=null){
             StringTokenizer tokens= new StringTokenizer(linea,",");
             String clave=tokens.nextToken().trim();
             String nombre=tokens.nextToken().trim();
             String apellido=tokens.nextToken().trim();
             String edad=tokens.nextToken().trim();
             String telefono=tokens.nextToken().trim();

             if(clave.equals(clavePasajero)){
                 encontrado=true;
                 System.out.println("Clave encontrada");
                 DatosPasajero obj= new DatosPasajero(clavePasajero, nombre, apellido, edad, telefono, null);
                 System.out.println(obj.toString());
                 arrayPasajeros[0]=obj;
                 System.out.println("para confirmarmar que se lleno el array:"+arrayPasajeros[0].toString());
                 lbVueloEncontrado.setText("Vuelo encontrado");
                 btnVer.setVisible(true);
                 break;
                 
             }else{
                 System.out.println("no se encontro");
                 lbVueloEncontrado.setText("Vuelo no encontrado");
                         
                             }
         }
         
     }   catch(Throwable e){
         System.out.println(e.getMessage());
     } 
    }
*/
 
    RastreoVuelo arrayVueloEncontrado[]= new RastreoVuelo[1];
    
    public boolean rastrearVuelo(String inputclaveReserva,javax.swing.JLabel lbVueloEncontrado,javax.swing.JPanel pnlContenido){
     boolean encontrado=false;
        try{
         FileReader frReservas= new FileReader("src/archivos/RESERVAS.txt");
         BufferedReader br= new BufferedReader(frReservas);

         String linea;
         
         while((linea=br.readLine())!=null){
             StringTokenizer tokens= new StringTokenizer(linea,",");
             String claveReserva=tokens.nextToken().trim();
             String clavePasajero=tokens.nextToken().trim();
             String claveAvion=tokens.nextToken().trim();
             
             

             if(claveReserva.equals(inputclaveReserva)){
                 
                 encontrado=true;
                 System.out.println("Clave encontrada");
                 RastreoVuelo reservaObject= new RastreoVuelo(claveReserva, clavePasajero, claveAvion);
                 arrayVueloEncontrado[0]=reservaObject;
                System.out.println(reservaObject.toString());
                
                
                
                 lbVueloEncontrado.setText("Vuelo encontrado");
                 
                 
                 
                 
                 
                 break;
                 
                 
             }else{
                 System.out.println("no se encontro");
                 
                 lbVueloEncontrado.setText("Vuelo no encontrado");
                         
                             }
         }
         
     }   catch(Throwable e){
         System.out.println(e.getMessage());
     } 
     return encontrado;
    }
    
    public void showDatos(){
        String datos= getDatosPasajero();
        StringTokenizer tok= new StringTokenizer(datos,",");
        
        String clave=tok.nextToken().trim(); System.out.println(clave);
        String nombre=tok.nextToken().trim();System.out.println(nombre);
        String ape= tok.nextToken().trim();System.out.println(ape);
        String edad= tok.nextToken().trim();System.out.println(edad);
        String tel=tok.nextToken().trim();System.out.println(tel);
        
        PnlDatosReserva obj= new PnlDatosReserva();
        obj.setClave(clave);
        obj.setNombre(nombre);
        obj.setApellido(ape);
        obj.setEdad(edad);
        obj.setTelefono(tel);
        obj.setDatos();
        
    }
    
    
    
    
    
    
    
   
    public String getDatosPasajero(){
        
    
        System.out.println("Entre");
         String claveP= arrayVueloEncontrado[0].getClavePasajero();
        System.out.println("clave pasajero "+claveP);

         String datos="";
        try{
            FileReader frPasajero= new FileReader("src/archivos/Pasajeros.txt");
            BufferedReader brPasajeros= new BufferedReader(frPasajero);
            String linea;
            
            while((linea=brPasajeros.readLine())!=null){
                
                StringTokenizer tokens= new StringTokenizer(linea,",");
              
                String cPasajero=tokens.nextToken().trim();
                String nombre=tokens.nextToken().trim();
                String apellido= tokens.nextToken().trim();
                String edad=tokens.nextToken().trim();
                String telefono= tokens.nextToken().trim();
                
                ///////////////////////////////////////////MODIFICAR////////////////////////////
                if(cPasajero.equals(claveP)){
                   
                    System.out.println("PasajeroEncontrado");
                     System.out.println("Datos del pasajero: ");
                     
                     datos=cPasajero+","+nombre+","+apellido+","+edad+","+telefono;
                     System.out.println(datos);
                         
        
                     
                            
                    
                   
                    
               break;
                    
                }
                        
  
            }
            
            
        }catch(Throwable e){
            System.out.println(e);
        }
                
     return datos;
             
        
        
    }
    
    
    
    
    
    
    
     
     
     public void setDatos(){
         
     }
     
     public void modificar(){
         
         String clavePasajero;
         String nombre;
         String apellidos;
         String edad;
         String telefono;
         
         RandomAccessFile fichero= null;
         
     }

    public String getClaveReserva() {
        return claveReserva;
    }

    public void setClaveReserva(String claveReserva) {
        this.claveReserva = claveReserva;
    }
     
     
 
     
     
     
     
     
     
     
}
