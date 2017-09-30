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
public class Bai24 {
    /**
     * liệt kê các số nguyên có 7 chữ số thoả mãn:
        a)Là số nguyên tố.
        b)Tất cả các chữ số là nguyên tố
        c)Đảo của nó cũng là một số nguyên tố
     * @param args 
     */
    public static void main(String[] args) {
        // 
        for(int i = 1000000; i<= 9999999; ++i) {
            boolean ok = true;
            int rev,t;
            t = i;
            rev = 0;
            // Kiem tra tat ca chu so la nguyen to
            while(t>0) {
                if(t %  10 == 2 || t % 10 == 3 || t % 10 == 5|| t % 10 == 7);
                else {
                    ok = false;
                    break;
                }
                rev *= 10;
                rev += t % 10;
                t /= 10;
            }
            // Kiem tra i la nguyen to
            if(ok ){
                for(int j = 2; j <= Math.sqrt(i); ++j) {
                    if(i % j == 0) {
                        ok = false;
                        break;
                    }
                }
            }
            //  Kiểm tra đảo của i cũng là số nguyên tố
            if(ok) {
                for(int j = 2; j <= Math.sqrt(i); ++j) {
                    if(rev % j == 0) {
                        ok = false;
                        break;
                    }
                }
            }
            if(ok ) System.out.println(i);
        }
    }
}
