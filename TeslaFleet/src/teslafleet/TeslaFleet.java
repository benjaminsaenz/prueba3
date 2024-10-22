/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.models.Auto;
import cl.duoc.models.BicicletaElectrica;
import cl.duoc.models.Registro;
import cl.duoc.models.Vehiculos;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ////////////
        ///CLASES///
        ////////////
        BicicletaElectrica Bici = new BicicletaElectrica("weno", 25);
        Registro nuevoauto = new Registro();
      
       
        
        
        
        ///////////
        ///MENU////
        ///////////
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        
        while(opcion != 4){
            System.out.println("[1]-Elegir Transporte");
            System.out.println("[2]-Agregar Vehiculo");
            System.out.println("[3]-Arriendo");
            System.out.println("[4]-Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
             
                            
                            
                           
            }
            
        }
        
        
        
        
        
        
    }
    
}
