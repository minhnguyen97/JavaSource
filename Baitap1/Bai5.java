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
public class Bai5 {
    /**
     * Print multiplication table from 1 to 10
     * @param args 
     */
    public static void main(String[] args) {
        
        System.out.println("BẢNG CỬU CHƯƠNG");
        // Multiplication table from 1 to 5
        for(int i = 1; i <= 10; ++i) {
            for(int j = 1; j <= 5 ; ++j) {
                System.out.printf("%d x %d = %d\t",j,i,i * j);
            }
            System.out.println("");
        }
        System.out.println("");
        // Multiplication table from 6 to 10
        for(int i = 1; i <= 10; ++i) {
            for(int j = 6; j <= 10 ; ++j) {
                System.out.printf("%d x %d = %d\t",j,i,i * j);
            }
            System.out.println("");
        }
    }
}
