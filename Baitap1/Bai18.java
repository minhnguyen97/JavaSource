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
public class Bai18 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào 2 số a và b [a,b]: ");
        do {
            a = scan.nextInt();
            b = scan.nextInt();
        }while(a > b);
        int count = 0;
        
        System.out.println("Các số chính phương [" + a + " , " + b + "] là : ");
        for(int i = a; i <= b; ++i) {
            if((int)(Math.sqrt(i)) * (int)(Math.sqrt(i)) == i) {
                ++count;
                System.out.print(i+ " ");
            }
        }
        
        System.out.println("\nCó " + count + " số chính phương.");
        
    }
}
