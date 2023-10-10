package baitap.bt1;

import java.util.Scanner;

public class Bt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        addInterger(sc) ;

    }

    private static void addInterger(Scanner sc) {
        try {
            System.out.println("Nhap vao 2 so a va b ");
            System.out.println("a = ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.println("b = ");
            int b = Integer.parseInt(sc.nextLine());
            int sum = a + b ;
            System.out.println("Tong 2 so a va b = " + sum );
        } catch (NumberFormatException e ) {
            System.out.println("Dau vao khong hop le. Hay thu lai");
            addInterger(sc);
        }
    }
}
