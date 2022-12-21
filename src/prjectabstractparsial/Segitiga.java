/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjectabstractparsial;

/**
 *
 * @author Lab20703
 */
public class Segitiga extends Geometri {
       private double a,t;
       
       public Segitiga(double a, double t) {
           this.a = a;
           this.t = t;
       }
       
       public double getLuas(){
           return a*t/2;
       }
}
