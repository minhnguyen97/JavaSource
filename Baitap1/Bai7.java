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
public class Bai7 {
    /**
     * Sum odd or even number from 1 to n
     * @param args 
     * Input : 
     *      A number
     * Return :
     *  Sum all odd or even number from 1 to n
     */
    public static void main(String[] args) {
        int num = 0;
        long sum;
        int step;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Nhập số nguyên dương : ");
            num = scan.nextInt();
        }while(num < 0);
        step = num % 2 == 0 ?  2 : 1;
        sum = 0;
        for(;step <= num; step += 2) {
            sum += step;
        }
        System.out.println("Tổng = " + sum);
    } // end main
}
