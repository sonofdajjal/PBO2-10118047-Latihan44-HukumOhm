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
public class Baterai {
    private float kuatArus,hambatan;
    
    public Baterai(){
        System.out.println("Hukum Ohm");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan benda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        float tegangan = kuatArus*hambatan;
        return tegangan;
    }
    
    
}
