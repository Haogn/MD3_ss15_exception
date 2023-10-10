package baitap.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        minArr(sc);
    }
    private static void minArr(Scanner sc)  {
        System.out.println("Nhap vao so phan tu trong mang");
        int n = Integer.parseInt(sc.nextLine()) ;
        if (n == 0 ) {
            try {
                throw new RuntimeException("So phan tu trong mang phai > 0 ") ;
            } catch ( RuntimeException e) {
                System.out.println(e.getMessage());
                minArr(sc);
            }
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("phan tu thu " + (i+1) + " ");
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println(Arrays.toString(arr));
            int min = arr[0] ;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i] ;
                    break;
                }
            }
            System.out.println("So nho nhat trong mang la " + min);
        }


    }
}
