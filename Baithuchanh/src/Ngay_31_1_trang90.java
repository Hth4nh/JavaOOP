import java.util.Scanner;

public class Ngay_31_1_trang90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        System.out.print(s.replaceAll(".", "$0\n"));

        sc.close();
    }
}
