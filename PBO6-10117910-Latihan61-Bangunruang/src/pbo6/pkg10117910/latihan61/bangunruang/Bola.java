/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan61.bangunruang;

/**
 *
 * @author User
 */
public class Bola implements Bangunruang{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double volume() {
    return 4*22*(r*r*r)/3/7;    
    }
}
