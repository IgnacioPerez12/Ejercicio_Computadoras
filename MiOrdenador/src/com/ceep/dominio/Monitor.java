package com.ceep.dominio;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamaño;
    private int contadorMonitores;

    //Constructores
    public Monitor() {
    }

    public Monitor(String marca, double tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;
    }
    
    //Getter and Setter
    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }
    
    public void setContadorMonitores(int contadorMonitores) {    
        this.contadorMonitores = contadorMonitores;
    }

    //ToString
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", contadorMonitores=" + contadorMonitores + '}';
    }
    
    
}
