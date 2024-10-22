/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public  class Auto extends Vehiculos{
    
    public int cantidadpasajeros;
    public double autopilot;

    public Auto(int cantidadpasajeros, double autopilot) {
        this.cantidadpasajeros = cantidadpasajeros;
        this.autopilot = autopilot;
    }

    public Auto(int cantidadpasajeros, double autopilot, String codigounico, boolean mantenimiento) {
        super(codigounico, mantenimiento);
        this.cantidadpasajeros = cantidadpasajeros;
        this.autopilot = autopilot;
    }

    public int getCantidadpasajeros() {
        return cantidadpasajeros;
    }

    public void setCantidadpasajeros(int cantidadpasajeros) {
        this.cantidadpasajeros = cantidadpasajeros;
    }

    public double getAutopilot() {
        return autopilot;
    }

    public void setAutopilot(double autopilot) {
        this.autopilot = autopilot;
    }

 
    

    @Override
    public String toString() {
        return "Auto{" + "cantidadpasajeros= " + cantidadpasajeros + ", autopilot= " + autopilot + '}';
    }
    
    /////////////
    ///METODOS///
    /////////////
    
    
    
    public  double calcularCostoau(int hora){
        double costo = VALOR_HORA_ALQUILER*hora;
        
        autopilot += 60;
        
    
        return
            costo *= 1.10;
            
       
       
    }

  
}
