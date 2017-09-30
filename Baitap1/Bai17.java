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
public class Bai17 {
    /**
     * Liệt kê các số thuận nghịch có 6 chữ số
     * @param args 
     *  
     */
    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số là : "); 
        for(int i = 100000; i <= 999999; ++i) {
            String s = Integer.toString(i);
            StringBuilder rev = new StringBuilder(s);
           if(0 == s.compareTo(rev.reverse().toString() )) {
               System.out.println(i);
           }
        }
    }
}
