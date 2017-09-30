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
public class Bai12 {
    /**
     * 
     * @param args 
     * Input : 
     *      1 số nguyên
     * Output :
     *      Tổng các chữ số của số nguyên đó
     */
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên :");
        num = scan.nextInt();
        int temp = Math.abs(num);
        while(temp > 0) {
            sum +=  (temp % 10);
            temp /= 10;
        }
        System.out.println("Tổng các chữ số của " + num +           " là : " + sum);
        
    }
}
