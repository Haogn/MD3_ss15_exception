package baitap.bt3;

import java.util.Arrays;
import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Object[] arr = {4,5,6,8,5.5,3.3,10} ;
        int sum = 0 ;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            try {
                sum +=(int) arr[i] ;
            }catch (ClassCastException e) {
                System.out.println( arr[i] + " khong phai so nguyen");
            }
        }
        System.out.println("Tong cua cac so nguyen trong mamg = " + sum);
    }
}
