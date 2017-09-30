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
public class Bai4 {
    /**
     * Print a triangle number with height
     * @param args 
     * Return
     *    1
     *   121
     *  12321
     */
    public static void main(String[] args) {
        int height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều cao hình tam giác : ");
        height = scan.nextInt();
        // Print triangle
        for(int line = 1; line <= height; ++line) {
            for(int space = height - line; space >= 1; --space) System.out.print(" ");
            for(int num = 1; num <= line; ++num) System.out.print(num);
            for(int num = line-1; num >= 1; --num) System.out.print(num);
            System.out.println("");
        }
    }
}
