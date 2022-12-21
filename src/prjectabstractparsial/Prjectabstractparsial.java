/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjectabstractparsial;

/**
 *
 * @author Lab20703
 */
public class Prjectabstractparsial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran l =  new Lingkaran(10);
        l.setNama("Lingkaran");
//        System.out.println(1.getNama());
//        System.out.println(1.getLuas());
        System.out.println(l.getNama());
        System.out.println(l.getLuas());
        
        Segitiga s = new Segitiga(5, 8) {}; 
        s.setNama("Segitiga");
        System.out.println(s.getNama());
        System.out.println(s.getLuas());
        
        PersegiPanjang p = new PersegiPanjang(8,4);
        p.setNama("Persegi Panjang");
        System.out.println(p.getNama());
        System.out.println(p.getLuas());
    }
}