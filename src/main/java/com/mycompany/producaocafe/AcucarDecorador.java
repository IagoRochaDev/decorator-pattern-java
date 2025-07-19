/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocafe;

/**
 *
 * @author Iago R. Oliveira
 */
public class AcucarDecorador extends CafeDecorador {

    public AcucarDecorador(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double custo() {
        return super.custo() + 1;
    }
    
    @Override
    public String ingredientes() {
        return super.ingredientes() + ", Acucar";
    }
}
