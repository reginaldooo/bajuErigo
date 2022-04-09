/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bajuerigo;

/**
 *
 * @author REGIN
 */
public class Baju {
    private int bajuA   = 100000;
    private int bajuB   = 125000;
    private int bajuC   = 175000;
    private int jumlah=0;
    
    int hargaBajuA(int jumlah){
       this.jumlah = jumlah;
        if(bajuA>100){
            bajuA = 95000;
        }
        System.out.println("Harga per buah : "+bajuA);
        return jumlah = jumlah*bajuA;
    }
    int hargaBajuB(int jumlah){
        this.jumlah = jumlah;
        if(bajuB>100){
            bajuB = 120000;
        }
        System.out.println("Harga per buah : "+bajuB);
        return jumlah = jumlah*bajuB;
    }
    int hargaBajuC(int jumlah){
        this.jumlah = jumlah;
        if(bajuC>100){
            bajuC = 160000;
        }
        System.out.println("Harga per buah : "+bajuC);
        return jumlah = jumlah*bajuC;
    }
}