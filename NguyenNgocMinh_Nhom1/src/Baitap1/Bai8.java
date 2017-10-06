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
public class Bai8 {
    /**
     * 
     * @param args 
     * Return 
     *    1 + 1/2 + .. + 1/n
     */
    public static void main(String[] args) {
        int num;
        float sum;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Nhập số tự nhiên : ");
            num = scan.nextInt();
        }while(num < 0);
        
        sum = 0;
        for(int i = 1; i <= num; ++i) {
            sum += 1.0f/i;
        }
        
        System.out.println("Tổng = " + sum);
    }
}
