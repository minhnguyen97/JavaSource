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
public class Bai16 {
    /**
     * 
     * @param args 
     * 
     * Fibonacci
     *  f(0) = 0
     *  f(1) = 1
     *  f(n) = f(n-1) + f(n-2)
     */
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Nhập số nguyên (2 <= n <= 90 ) ");
            n = scan.nextInt();
        }while(n <2 || n > 90);
        int[] fib = new int[100];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= n; ++i) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println(n + " số fibonacci đầu tiên : ");
        for(int i = 0; i < n ; ++i) {
            System.out.print( fib[i] + " ");
        }
    } // end main
    
}
