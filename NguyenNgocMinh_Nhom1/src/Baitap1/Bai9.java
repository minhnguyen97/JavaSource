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
 * Return : 
 *      Print divisional number of n
 */
public class Bai9 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số nguyên : ");
        num = scan.nextInt();
        int total = 0;
        System.out.println("Các ước số của " + num + "là : ");
        for(int i = 1; i <= num; ++i) {
            if(num % i == 0)  {
                ++total;
                System.out.print(" " + i);
            }
        }
        System.out.println("\nCó tất cả " + total + " ước số.");
    }
    
}
