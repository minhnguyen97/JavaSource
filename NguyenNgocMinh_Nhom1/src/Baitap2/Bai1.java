/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap2;

/**
 *  Selection Sort
 *  Result write to file SXCHON.OUT
 * @author Minh Nguyen
 */


public class Bai1 {
               
    public static int[] SelectionSort(int array[],int d,int c) {
        int res[] = array;
        for(int index = d; index <=c ;++index) {
           
            int imin = index;
            for(int offset = index + 1; offset <= c; ++offset ){
                if(res[imin] > res[offset]) imin = offset;
            }
            int t = res[index];
            res[index] = res[imin];
            res[imin] = t; 
        }
        return res;
    }
    
    public static void Print(int array[],int d, int c, String msg) {
        System.out.println(msg);
        for(int i = d; i <= c; ++i) {
            System.out.printf(" %d",array[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,1001,123,5,12,2};
        Print(arr,0,7,"Mang truoc khi sap");
        int res[] = SelectionSort(arr,0,7);
        Print(res,0,7,"Mang sau khi sap : ");
    }
}
