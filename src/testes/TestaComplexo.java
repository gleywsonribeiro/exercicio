/*,
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import exercicios.NumeroComplexo;

/**
 *
 * @author Gleywson Ribeiro
 */
public class TestaComplexo {

    public static void main(String[] args) {
        NumeroComplexo a = new NumeroComplexo(5, 3);
        NumeroComplexo b = new NumeroComplexo(15, -8);
        NumeroComplexo c = new NumeroComplexo(8, 0);
        NumeroComplexo d = new NumeroComplexo(0, -1);
        NumeroComplexo e = new NumeroComplexo(0, 0);
        
        System.out.println("a:"+a);
        System.out.println("b: "+b);
        a.soma(b);
        System.out.println("a + b: "+a);
        System.out.println(a);
    }
    
}
