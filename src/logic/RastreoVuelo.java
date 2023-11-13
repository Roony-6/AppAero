
package logic;
import java.io.*;
import java.util.StringTokenizer;
public class RastreoVuelo extends DatosPasajero{
    
    
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
     
     
}
