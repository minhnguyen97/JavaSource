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
public class Bai21 {
    
    /**
     * Liệt kê các số thuận nghịch có 6 chữ số và tổng các số chia hết cho 10
     * @param args 
     */
    public static void main(String[] args) {
        int rev;
        int sum;
        int t;
        // In ra cac so thuan nghich chia het cho 10
        for(int i = 100000; i <= 999999;++i) {
            rev = sum = 0;
            t = i;
            while(t > 0) {
                sum += t % 10;
                rev = rev * 10 + t % 10;
                t /= 10;
            }
            if(rev == i && sum % 10 == 0) System.out.println(i);
        }
    }
}
