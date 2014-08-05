/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import exercicios.Ponto2D;

/**
 *
 * @author Gleywson Ribeiro
 */
public class TestaPonto2D {

    public static void main(String[] args) throws CloneNotSupportedException {
        Ponto2D p = new Ponto2D(1, 1);
        Ponto2D d = new Ponto2D(p);
        System.out.println(p);
        System.out.println(d);
        System.out.println(p.equals(d));
        System.out.println(d.distancia(p));

        p.movimenta(5);
        System.out.println("depois de movimentar");

        System.out.println(p);
        System.out.println(d);
        System.out.println(p.equals(d));
        System.out.println(p.distancia(d));
    }
}
