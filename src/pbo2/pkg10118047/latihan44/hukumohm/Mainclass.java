/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan44.hukumohm;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai();
        
        Baterai btr2 = new Baterai(3 , 12);
        btr.equals(btr);
        System.out.println("");
        System.out.println("Kuat Arus : " + btr2.getKuatArus()+"ampere");
        System.out.println("Hambatan : " + btr2.getHambatan()+"ohm");
        System.out.println("Hasil tegangan : " + btr2.hitungTegangan()+ " Volt ");
    }
    
}
