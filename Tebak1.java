/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebak1;

/**
 *
 * @author arsa
 */

import java.util.Scanner;

public class Tebak1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan acak antara o s/d 100. Silahkan tebak ya!!!");
        System.out.println("Score Anda : 100");
        
        int x;
        x = (int) (Math.random() * 100);
        int jumlah= 0;
        int score = 100;
        int bonus = 50;
        
        for (int i=0; i<100; i++) {
            jumlah ++;
        
        System.out.println("Tebakan anda : ");
            int tebak = input.nextInt();
            
            if(tebak == x){
                if(jumlah <= 5){
                    System.out.println("Yeeee... Bilangan yang Anda tebak BENAR. Selamat!!!");
                    System.out.println("Score Anda : " + score);
                    System.out.println("Bonus : " + bonus);
                    System.out.println("Score Total Anda : " + (score + bonus));
                        break;
                }
                else{
                    System.out.println("Yeeee... Bilangan yang Anda tebak BENAR. Selamat!!!");
                    System.out.println("Score Anda : " + score);
                        break;
                }
            }else if(tebak > x){
                score -=2;
                System.out.println("Hehehe... Bilangan yang Anda tebak terlalu besar");
                System.out.println("Score Anda : " + score);
                    if(score == 0){
                        System.out.println("Maaf score Anda 0");
                            break;
                    }
            }else if(tebak < x){
                score -= 2;
                System.out.println("Hehehe... Bilangan yang Anda tebak terlalu kecil");
                System.out.println("Score Anda : " + score);
                    if(score == 0){
                        System.out.println("Maaf score Anda 0");
                            break;
                    }
            }else{
                System.out.println("Maaf data yang Anda masukan tidak sesuai. Mohon ulangi lagi!!!");
                if(score == 0){
                    System.out.println("Maaf score Anda 0");
                        break;
                }
            }
        }
    }
}