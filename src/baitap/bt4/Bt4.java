package baitap.bt4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập vào 1 số : ");
        String number = sc.nextLine();
        List<Integer> n = new ArrayList<>();
        try {
            n.add(Integer.parseInt(number)) ;
        } catch (Exception e) {
            System.out.println("Nhap vao so nguyen ");
        }
    }
}
