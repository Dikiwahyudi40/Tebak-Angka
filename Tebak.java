/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak;

/**
 *
 * @author arsa
 */

import java.util.Scanner;

public class Tebak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan acak antara o s/d 100. Silahkan tebak ya!!!");
        
        int x;
        x = (int) (Math.random() * 100);
        
        for (int i=0; i<100; i++) {
        
        System.out.println("Tebakan anda : ");
            int tebak = input.nextInt();
            
            if(tebak == x){
                System.out.println("Yeeee... Bilangan yang Anda tebak BENAR. Selamat!!!");
                break;
            }else if(tebak > x){
                System.out.println("Hehehe... Bilangan yang Anda tebak terlalu besar");
            }else if(tebak < x){
                System.out.println("Hehehe... Bilangan yang Anda tebak terlalu kecil");
            }else{
                System.out.println("Maaf data yang Anda masukan tidak sesuai. Mohon ulangi lagi!!!");
            }
        }
    }
}