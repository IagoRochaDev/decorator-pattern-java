/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.producaocafe;

/**
 *
 * @author Iago R. Oliveira
 */
public class ProducaoCafe {

    public static void main(String[] args) {
        Cafe cafe = new CafeSimples();
        System.out.println(cafe.custo() + " | " + cafe.ingredientes());

        cafe = new LeiteDecorador(cafe);
        System.out.println(cafe.custo() + " | " + cafe.ingredientes());

        cafe = new AcucarDecorador(cafe);
        System.out.println(cafe.custo() + " | " + cafe.ingredientes());
    }
}
