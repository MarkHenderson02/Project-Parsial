/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjectabstractparsial;

/**
 *
 * @author Lab20703
 */
abstract class Geometri {

         private String nama;

         public void setNama(String nama){

                this.nama=nama;

         }

         public String getNama(){

                 return(nama);

         }

         public abstract double getLuas();

}

