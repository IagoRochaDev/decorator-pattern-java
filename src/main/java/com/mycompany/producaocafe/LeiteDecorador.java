/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocafe;

/**
 *
 * @author Iago R. Oliveira
 */
public class LeiteDecorador extends CafeDecorador {

    public LeiteDecorador(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo() {
        return super.custo() + 2;
    }

    @Override
    public String ingredientes() {
        return super.ingredientes() + ", Leite";
    }
}
