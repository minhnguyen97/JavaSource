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
public class Bai3 {
    /**
     * Print a triangle with height
     * VAR : height
     * @Return 
     * Example height = 3
     *     *
     *    ***
     *   *****
     *        
     */
    public static void main(String[] args) {
        int height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều cao hình tam giác");
        height = scan.nextInt();
        for(int i = 1; i <= height; ++i) {
            for(int j = height; j >i; --j) 
                System.out.print(" ");
            for(int j = 1 ; j <= 2 * i - 1; ++j) 
                System.out.print("*");
            System.out.println("");
        }
    }
}
