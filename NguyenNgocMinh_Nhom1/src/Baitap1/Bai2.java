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


public class Bai2 {
    /**
     * 
     * Print a rectangle with height and width
     * @var width is an integer
     * @var height is an integer
     * @Return 
     *      *****
     *      *   *
     *      *****
     */
    public static void main(String[] args) {
        int width,height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chiều rộng hình chữ nhật");
        width = scan.nextInt();
        System.out.println("Nhập chiều dài hình chữ nhật");
        height = scan.nextInt();
        for(int i = 1; i <= height; ++i) {
            for(int j = 1; j <= width; ++j) {
                if(i == 1 || i == height || j == 1 || j == width) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
