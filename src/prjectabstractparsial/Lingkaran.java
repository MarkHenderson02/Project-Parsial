/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjectabstractparsial;

/**
 *
 * @author Lab20703
 */
public class Lingkaran extends Geometri {
    private double jejari;

    public Lingkaran(int par) {
        jejari=par;
    }
         public void setJejari(double r){

                  jejari=r;

         }

         public double getJejari(){

            return(jejari);

        }

       public double getLuas(){

            return(jejari*jejari*Math.PI);

       }
}

