package chuong2;
import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.println("So nho nhat trong hai so la: " + Math.min(a, b));

        sc.close();
    }
}
