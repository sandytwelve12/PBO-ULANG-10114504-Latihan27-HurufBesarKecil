/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan27.hurufbesarkecil;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program huruf besar dan kecil
 */
import java.util.Scanner;
public class PBOULANG10114504Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        String kalimat ;
        String besar ;
        String kecil ;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukan Kalimat : ");
        kalimat = scan.nextLine();
        
        besar = kalimat.toUpperCase();
        kecil = kalimat.toLowerCase();
        
        System.out.println("===Hasil Formating===");
        System.out.println("Huruf besar : "+besar);
        System.out.println("Huruf Kecil : "+kecil);
    }
    
}
