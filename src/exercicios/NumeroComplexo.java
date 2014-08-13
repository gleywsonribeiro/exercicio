/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Gleywson Ribeiro
 */
public class NumeroComplexo {

    private double r;
    private double i;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public NumeroComplexo(double real, double imaginario) {
        this.r = real;
        this.i = imaginario;
    }

    public void soma(NumeroComplexo complexo) {
        this.r += complexo.getR();
        this.i += complexo.i;
    }

    public void subtrai(NumeroComplexo complexo) {
        this.r -= complexo.getR();
        this.i -= complexo.i;
    }
    
    public void multiplica(NumeroComplexo nc) {
        this.r = this.r * nc.getR()- this.i * nc.getI();
        this.i = this.r * nc.i + this.i * nc.r;
    }

    

}
