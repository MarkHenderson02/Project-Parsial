/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjectabstractparsial;

/**
 *
 * @author Lab20703
 */
public class PersegiPanjang extends Geometri{
     private double p,l;
     
    public PersegiPanjang(double p,double l) {
        this.p = p;
        this.l = l;
    }
    
    public double getLuas() {
        return p*l;
    }
}
