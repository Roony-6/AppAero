
package logic;
import persistence.*;
import igu.*;
public class Main {
     public static void main(String[] args) {
        ControladoraResv obj= new ControladoraResv();//instanciamos objeto de la controladora 

        
        InterfazPrincipal mainInterface= new InterfazPrincipal();//instanciamos objeto de la interfaz

        FormDatosPasajero formPasa= new FormDatosPasajero();//instanciamos objeto de la interfaz

        mainInterface.setVisible(true);//hacemos visible la interfaz principal
        mainInterface.setLocationRelativeTo(null);//posicionamos al centro la interfaz principal
                
       mainInterface.agregarItems();//con metodo de la interfaz principal agregamos informacion obtenida de los archivos leidos 

       
    }
     
     
     
}
