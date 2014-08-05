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
public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto2D(Ponto2D p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void movimenta(double x) {
        setX(x);
    }
    
    public void movimenta(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public void movimenta(Ponto2D p) {
        setX(p.getX());
        setY(p.getY());
    }

    @Override
    public boolean equals(Object obj) {
//        if (obj instanceof Ponto2D) {
//            Ponto2D p = (Ponto2D) obj;
//            return this.x == p.getX() && this.y == p.getY();
//        } else {
//            return false;
//        }
        if (obj instanceof Ponto2D) {
            Ponto2D p = (Ponto2D) obj;
            return this.hashCode() == p.hashCode();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
    
    public double distancia(Ponto2D p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }

    
    
    
}
