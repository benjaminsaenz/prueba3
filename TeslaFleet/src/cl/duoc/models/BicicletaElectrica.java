/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculos{
    
    public String tipodeFreno;
    public int capacidadbateriakm;

    public BicicletaElectrica(String tipodeFreno, int capacidadbateriakm) {
        this.tipodeFreno = tipodeFreno;
        this.capacidadbateriakm = capacidadbateriakm;
    }

    public BicicletaElectrica(String tipodeFreno, int capacidadbateriakm, String codigounico, boolean mantenimiento) {
        super(codigounico, mantenimiento);
        this.tipodeFreno = tipodeFreno;
        this.capacidadbateriakm = capacidadbateriakm;
    }

    public String getTipodeFreno() {
        return tipodeFreno;
    }

    public void setTipodeFreno(String tipodeFreno) {
        this.tipodeFreno = tipodeFreno;
    }

    public int getCapacidadbateriakm() {
        return capacidadbateriakm;
    }

    public void setCapacidadbateriakm(int capacidadbateriakm) {
        this.capacidadbateriakm = capacidadbateriakm;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" + "tipodeFreno=" + tipodeFreno + ", capacidadbateriakm=" + capacidadbateriakm + '}';
    }
    ////////////
    ///METODOS//
    ////////////
    
    public double calcularCostobi(int siono){
     double costo = VALOR_HORA_ALQUILER*siono;
        
        if(capacidadbateriakm < 20){
            costo *= 0.95;
            
        }
        return costo;
    }

    
}
