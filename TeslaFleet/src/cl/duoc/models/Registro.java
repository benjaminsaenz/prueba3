/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Registro {
    private List<Vehiculos>registro = new ArrayList<>();

  
    public Registro(){
        registro = new ArrayList<>();
        
    }
   public void agergarVehiculo(Vehiculos agergado){
       registro.add(agergado);
       System.out.println("Vehiculo Agregado con Exito!!!!!");
   } 
   
   public void listarVehiculos(){
       for ( Vehiculos agregado : registro){
           System.out.println("vehiculo" + agregado.getCodigounico());
       }
   }
   
    public void totalVehiculos(){
           System.out.println("Total de Vehiculos" + registro.size());
       }
   


}
