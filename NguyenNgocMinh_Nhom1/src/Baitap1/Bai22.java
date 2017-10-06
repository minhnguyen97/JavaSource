/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author Minh Nguyen
 */
public class Bai22 {
    /**
     * Liệt kê các số nguyên tố có 6 chữ số chỉ bao gồm các số lẻ
     * @param args 
     */
    public static void main(String[] args) {
        // Xét các số có 6 chữ số
        
        int t;
        for(int i = 100000; i <= 999999; ++i) {
            // Kiểm tra số chỉ gồm các số lẻ
            boolean ok = true;
            t = i;
            while(t >0) {
                if(t % 2 == 0) {
                    ok = false;
                    break;
                }
                t /= 10;
            }
            // Kiểm tra số nguyên tố
            if(true == ok)
               for(int j = 2; j <= Math.sqrt(i);++j) {
                   if(i % j == 0) {
                       ok = false;
                       break;
                   }
                }
            if(true == ok) System.out.println(i);
        }
    }
}
