package com.ceep.test;

import com.ceep.dominio.*;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class TestComputadoras {
    
    public static void main(String[] args) {
        //Pedido 1
        Monitor m1 = new Monitor("Gigabyte", 34);
        Teclado t1 = new Teclado("USB-C", "HP");
        Raton r1 = new Raton("Micro-USB", "trust");
        Computadora com1 = new Computadora("HP oni", m1, t1, r1);
        
        Orden pedido1 = new Orden();
        pedido1.agregarComputadora(com1);
        pedido1.mostrarOrden();
        
        //Pedido 2
        Monitor m2 = new Monitor("LG", 27);
        Teclado t2 = new Teclado("USB-Micro", "amazon");
        Raton r2 = new Raton("USB-C", "logitech");
        Computadora com2 = new Computadora("nox hummer", m2, t2, r2);
        
        Orden pedido2 = new Orden();
        pedido2.agregarComputadora(com2);
        pedido2.mostrarOrden();
    }
}
