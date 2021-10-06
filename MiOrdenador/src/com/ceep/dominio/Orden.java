package com.ceep.dominio;

import com.ceep.dominio.*;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Orden {
    
    private final int idOrden;
    Computadora computadora[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 15;

    //Constructor
    public Orden() {
        contadorComputadoras = 0;
        computadora = new Computadora[maxComputadoras];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    //Metodos
    public void agregarComputadora(Computadora computadoras){
        if(Orden.contadorComputadoras < Orden.maxComputadoras){
            computadora[Orden.contadorComputadoras++] = computadoras;
        } else {
            System.out.println("Has llegado al maximo");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("\n----------------------\n\n" + "ID de Orden: " + this.idOrden + "\n");
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println("ID Computadora: " + computadora[i].getIdComputadora()+ " ||| Marca: " + computadora[i].getNombre()+ " ||| Monitor: " + computadora[i].getMonitor()+ " ||| raton: " + computadora[i].getRaton()+ " ||| Teclado: " + computadora[i].getTeclado());
            System.out.println("");
        }
    }
}
