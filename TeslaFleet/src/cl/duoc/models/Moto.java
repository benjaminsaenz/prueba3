/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Moto extends Vehiculos{
    
    public int capacidadbateria;
    public boolean asistencia;

    public Moto(int capacidadbateria, boolean asistencia) {
        this.capacidadbateria = capacidadbateria;
        this.asistencia = asistencia;
    }

    public Moto(int capacidadbateria, boolean asistencia, String codigounico, boolean mantenimiento) {
        super(codigounico, mantenimiento);
        this.capacidadbateria = capacidadbateria;
        this.asistencia = asistencia;
    }

    public int getCapacidadbateria() {
        return capacidadbateria;
    }

    public void setCapacidadbateria(int capacidadbateria) {
        this.capacidadbateria = capacidadbateria;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Moto{" + "capacidadbateria=" + capacidadbateria + ", asistencia=" + asistencia + '}';
    }
    
    /////////////
    ///METODOS///
    /////////////
    
       public double calcularCostomo(int siono){
        double costo = VALOR_HORA_ALQUILER*siono;
        
        if(asistencia == true){
            costo *= 1.08;
            
        }
        return costo;
    }

}
