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
public class Bai25 {
    /** 
     * Lập tam giác pascal độ cao h
     *
     * @param args
     */
    public static void main(String[] args) {
        int height;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập vào chiều cao tam giác Pascal : ");
        height = scan.nextInt();
        for(int n = 0; n < height; ++n) {
            for(int k = 0; k <= n; ++k) {
                long res = C(k,n);
                System.out.print(res + " ");
            }
            System.out.println();
        }
        
    }
    private static long C(int k,int n) {
        if(k == 0 || k == n) return 1;
        return C(k,n-1) + C(k - 1, n-1);
    }
}
