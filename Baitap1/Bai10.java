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
public class Bai10 {
    /**
     * 
     * @param args 
     * 
     * @return 
     *      Longest Common Divisional
     *      Lowest Common Multiple
     */
    public static void main(String[] args) {
        int a,b;
        int gcd;
        long lcm;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào 2 số a và b : ");
        a = scan.nextInt();
        b = scan.nextInt();
        int temp_a = Math.abs(a);
        int temp_b = Math.abs(b);
        
        // Find LCD of a and b
        while(temp_b != 0) {
            int mod = temp_a % temp_b;
            temp_a = temp_b;
            temp_b = mod;
        }
        gcd = temp_a;
        // Find LCM of and b
        lcm = (long)(a * b ) / gcd;
        System.out.println("Ước chung lớn nhất là : " + gcd);
        System.out.println("Bội chung nhỏ nhất là : " + lcm);
    }
    
}
