package baitap.bt5;

import javafx.scene.transform.Scale;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
      toanHoc(sc);

    }

    private static void toanHoc(Scanner sc) {
        try {
            System.out.println("Nhập vào 2 số nguyên a và b ");
            System.out.print("a = ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("b = ");
            int b = Integer.parseInt(sc.nextLine());
            int f = a - b ;
            System.out.println("Ket qua cua a tru b = " + f );
            int d = a * b ;
            System.out.println("Ket qua cua a nhan b = " + d );
            int e = a + b ;
            System.out.println("Ket qua cua a cong b = " + e );
            try {
                if ( b == 0 ) {
                    throw new ArithmeticException("Mau cua phep chia khong duoc = 0 ") ;
                }
                float rs = (float) a / b ;
                System.out.println("Thuong cua a va b = " + rs);
            } catch (ArithmeticException ar) {
                System.out.println(ar.getMessage());
                toanHoc(sc);
            }


        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("a hoac b chua dung dinh dang ");
            toanHoc(sc);
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
