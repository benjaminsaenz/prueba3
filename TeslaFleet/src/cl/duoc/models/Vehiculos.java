/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */


public abstract class Vehiculos implements CostoAlquiler {
    public String codigounico;
    public boolean mantenimiento;
    

    public Vehiculos() {
    }

    public Vehiculos(String codigounico, boolean mantenimiento) {
        this.codigounico = codigounico;
        this.mantenimiento = mantenimiento;
    }

    public String getCodigounico() {
        return codigounico;
    }

    public void setCodigounico(String codigounico) {
        this.codigounico = codigounico;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    /**
     *
     * @return
     */
    
    @Override
    public abstract String toString();
   
    
    }

  
    
    
    

