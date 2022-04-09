/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bajuerigo;
import java.util.Scanner;
/**
 *
 * @author REGIN
 */
public class BajuErigo {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        
        System.out.print("Baju yang akan anda beli bertipe : ");
        String pil = sc.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int m = sc.nextInt();
        Baju A = new Baju();
        switch(pil){
            case "a" :
                int bA = A.hargaBajuA(m);//baju A
                System.out.println(bA);
                break;
            case "b" :
                int bB = A.hargaBajuB(m);//baju B
                System.out.println(bB);
                break;
            case "c" :
                int bC = A.hargaBajuC(m);//baju C
                System.out.println("Total harga    : "+bC);
                break;
                
        }}}