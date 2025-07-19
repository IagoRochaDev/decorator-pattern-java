/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocafe;

/**
 *
 * @author Iago R. Oliveira
 */
public class CafeSimples implements Cafe {

    @Override
    public double custo() {
        return 5;
    }

    @Override
    public String ingredientes() {
        return "Cafe";
    }
}
