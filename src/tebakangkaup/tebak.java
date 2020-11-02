/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkaup;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class tebak {
        int angkaTebakan;
    int angkaSimpan;
    int score=100;
    int plus=5;
    void menebak(){
        Random random = new Random();
        this.angkaSimpan = random.nextInt(101);
        System.out.println("“Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d\n" +
        "100. Silakan tebak ya!!!”");
        do{
            Scanner angka = new Scanner(System.in);
            System.out.println("Tebakan anda: ");
            this.angkaTebakan = angka.nextInt();
            
            if(score == 0){
                System.out.println("Game over");
                break;
            }
            
            if(angkaTebakan > angkaSimpan){
                System.out.println("Hehe... bilangan tebakan anda terlalu besar");
                score -=2;
                plus -=1;
            }else if(angkaTebakan < angkaSimpan){
                System.out.println("Hehe... bilangan tebakan anda terlalu kecil");
                score -=2;
                plus -=1;
            }else{
                System.out.println("Yeii... bilangan tebakan anda BENAR");
                if(plus > 0){
                    score +=50;
                    System.out.println(score);
                }
                System.out.println("Nilaimu : " + score);
                break;
            }
            
        }while(angkaTebakan != angkaSimpan);
    }
}
