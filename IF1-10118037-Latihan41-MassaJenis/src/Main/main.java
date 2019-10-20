/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menghitung massa jenis
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MassaJenis msJenis = new MassaJenis();
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("+++++MASSA JENIS KUBUS+++++");
        System.out.print("Sisi : ");
        msJenis.setSisi(input.nextInt()) ;
        
        System.out.print("Massa : ");
        msJenis.setMassa(input.nextInt());
        
        //output
        System.out.println("\n+++++Hasil Perhitungan+++++");
        System.out.println("Volume : " + msJenis.hitungVolume(msJenis.getSisi()));
        System.out.println("Massa Jenis : " +
                msJenis.hitungMassaJenis(msJenis.getMassa(), msJenis.hitungVolume(msJenis.getSisi())));
        
    }
    
}
