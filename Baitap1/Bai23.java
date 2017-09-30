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
public class Bai23 {
    /**
        Liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn:
        a)Là số thuận nghịch.
        b)Chỉ có chữ số 0, 6, 8
        c)Tổng chữ số chia hết cho 10
     * @param args
    */
    public static void main(String[] args) {
        for(int i = 1000000; i <= 999999999; ++i) {
            boolean ok = true;
            int t,sum,rev;
            t = i;
            sum = rev = 0;
            while(t > 0) {
                if(t % 10 != 0 && t % 10 != 6 && t % 10 != 8) {
                    ok = false;
                    break;
                }
                rev *= 10;
                rev += t % 10;
                sum += t %10;
                t /= 10;
            }
            if(ok && i == rev && sum % 10 == 0) System.out.println(i);
        }
    }
}
