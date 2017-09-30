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
public class Bai13 {
    /**
     * Input :
     *      1 số nguyên
     * Output :
     *      Phân tích ra tích thừa số nguyên tố
     * @param args
     */
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên : ");
        num = scan.nextInt();
        
        System.out.print(num + " = " + (num < 0 ? "- " : ""));
        num = Math.abs(num);
        if(num == 1) System.out.println("1");
        int i = 2;
        while(num != 1) {
            if(num % i == 0) {
                num /= i;
                System.out.print(i + (num != 1 ? " x " : ""));
               
            }
            else ++i;
        }
        System.out.println("");
    }
}
