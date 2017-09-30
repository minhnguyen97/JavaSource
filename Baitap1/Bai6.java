/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Minh Nguyen
 */
public class Bai6 {
    /**
     * Nhập số nguyên trong khoảng 10..99. Lấy ngẫu nhiên cho đến khi có số trùng
     * In kết quả từng bước và số bước thực hiên
     * @param args 
     */
    public static void main(String[] args) {
        int target;
        int step;
        int randNum;
        Random rand;
        rand = new Random();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Nhập số nguyên ( trong khoảng 10 .. 99 ) : ");
            target = scan.nextByte();
        }while(target < 10 || target > 99);
        step = 0;
        do {
            ++step;
            randNum = 10 + rand.nextInt(90);
            System.out.printf("Step %d : %d\n",step,randNum);
        }
        while(randNum != target);
        System.out.println("Total " + step + " step.\n");
        
    }// end main
}
