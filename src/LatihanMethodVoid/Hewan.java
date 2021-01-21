/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanMethodVoid;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Hewan {
    String[]  Hewan = {"","Anjing", "Kucing", "Ayam","Babi","Kelinci","Monyet","Keluar"};
    
    void Perulangan (){
        for (int i=1; i<8; i++ ){
                System.out.println(i+". "+Hewan[i]);
            }
    }
    
    void Percabangan (){
        Scanner input = new Scanner (System.in);
        int PilihanHewan =9 ;
        do{
        System.out.println("");
        System.out.print("Lihat Deskripsi Hewan Nomor : ");
        PilihanHewan = input.nextInt();
        System.out.println("");
        
        switch(PilihanHewan){
            case 1 :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Nama Hewan : "+Hewan[1]);
                System.out.println("Jenis Hewan : Karnivora");
                
                break;
            case 2 :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Nama Hewan : "+Hewan[2]);
                System.out.println("Jenis Hewan : Karnivora");
                break;
            case 3 :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Nama Hewan : "+Hewan[3]);
                System.out.println("Jenis Hewan : Omnivora");
                break;
            case 4 :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Nama Hewan : "+Hewan[4]);
                System.out.println("Jenis Hewan : Omnivora");
                break;
            case 5 :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Nama Hewan : "+Hewan[5]);
                System.out.println("Jenis Hewan : Herbivora");
                break;
            case 6 :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Nama Hewan : "+Hewan[6]);
                System.out.println("Jenis Hewan : Herbivora");
                break;
            default :
                System.out.println("Deskripsi Hewan");
                System.out.println("===============");
                System.out.println("Tidak tersedia");
        }
        
        }while ( PilihanHewan !=7);
        
        
        
    }
    
    
    
}
