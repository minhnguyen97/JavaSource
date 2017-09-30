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
public class Bai19 {
    /**
     * Tính giá trị PI qua so c <<
     * @param args 
     */
    public static void main(String[] args) {
        float c;
        int n = 0;
        float pi = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số c > 0");
            c = scan.nextFloat();
        }while(c <= 0);
        while(1.0/(2 * n + 1) >= c) {
            pi += Math.pow(-1, n) * 1.0 / (2 *n + 1);
            ++n;
        }
        pi *= 4;
        System.out.println("PI = " + pi);
    }
}
