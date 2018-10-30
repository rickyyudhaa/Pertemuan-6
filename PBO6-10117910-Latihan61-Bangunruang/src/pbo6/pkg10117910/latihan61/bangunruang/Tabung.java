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
public class Tabung implements Bangunruang{
    private double r, h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    
    @Override
    public double volume() {
        return 22*r*r*h/7;
    }
}
