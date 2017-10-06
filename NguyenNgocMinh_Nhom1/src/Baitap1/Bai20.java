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
public class Bai20 {
    /**
    * Tính giá trị e^x qua so c 
    * @param args 
    */
    public static void main(String[] args) {
        float c,x;
        float e = 0;
        int n = 1;
        long gt = 1;
        long xpow = 1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số c > 0");
            c = scan.nextFloat();
        }while(c <= 0);
        System.out.println("Nhập vào số thực x : ");
        x = scan.nextFloat();
        while(Math.abs((float)(xpow)/gt) >= c) {
            e += (float)(xpow)/gt;
            gt *= n;
            xpow *= x;
            ++n;
        }
        System.out.println("e^" + x + " = " + e);
    }
}
