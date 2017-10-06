/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

import java.util.Scanner;

/**
 *
 * @author Minh Nguyen
 */
public class Bai14 {
    /**
     * 
     * @param args 
     * 
     * Output :
     *      In ra nguyên tố nhỏ hơn n
     * Limit :
     *      
     */
    
    public static void main(String[] args) {
       int num;
       Scanner scan = new Scanner(System.in);
       System.out.println("Nhập vào số nguyên : ");
       num = scan.nextInt();
       System.out.println("Các số nguyên tố nhỏ hơn " + num + " là : ");
       for(int i = 2; i <= num; ++i) {
           boolean isPrime = true;
           for(int j = 2; j <= Math.sqrt(i); ++j) {
               if(i % j == 0) {
                   isPrime = false;
                   break;
               }
           }
           if(isPrime) System.out.print(i + " ");
       }
        
       
        
        
    }
          
}
