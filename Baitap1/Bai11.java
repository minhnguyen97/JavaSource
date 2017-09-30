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
public class Bai11 {
    public static void main(String[] args) {
        int a,b;
        int gcd;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào 2 số a và b [a,b]: ");
        do {
            a = scan.nextInt();
            b = scan.nextInt();
        }while(a > b);
        System.out.println("Các cặp số nguyên tố cùng nhau : ");
        for(int i = a; i <= b; ++i) {
            for(int j =  i; j <= b; ++j) {        
                int temp_a = Math.abs(i);
                int temp_b = Math.abs(j);

                // Find LCD of a and b
                while(temp_b != 0) {
                    int mod = temp_a % temp_b;
                    temp_a = temp_b;
                    temp_b = mod;
                }
                gcd = temp_a;
                if(1 == gcd) System.out.print(i + " - " + j + ", ");
            }
            
        }
    }//end main
}
