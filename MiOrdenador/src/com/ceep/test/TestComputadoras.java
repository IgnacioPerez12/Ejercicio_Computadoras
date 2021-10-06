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
        Teclado t1 = new Teclado(0, 0);
        Raton r1 = new Raton(0, 0);
        Computadora com1 = new Computadora("HP oni", m1, t1, r1);
        
        Orden pedido1 = new Orden();
        pedido1.mostrarOrden();
    }
}
