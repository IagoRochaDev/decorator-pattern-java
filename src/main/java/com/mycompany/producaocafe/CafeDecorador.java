/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocafe;

/**
 *
 * @author Iago R. Oliveira 
 */
public class CafeDecorador implements Cafe {

    protected Cafe cafeDecorado;

    public CafeDecorador(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    @Override
    public double custo() {
        return cafeDecorado.custo();
    }
    
    @Override
    public String ingredientes() {
        return cafeDecorado.ingredientes();
    }
}
