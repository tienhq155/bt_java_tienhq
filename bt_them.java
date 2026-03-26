
// nhập vào 1 số a, đếm số lượng chữ số a, tính tổng và tìm chữ số đảo ngược 
import java.util.Scanner;

public class bt_them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        int n1 = 0;
        int sum = 0;
        long temp = a;
        long sodaonguoc = 0;

        while (temp > 0) {
            long chuso = temp % 10;
            sum += chuso;
            n1++;
            sodaonguoc = sodaonguoc * 10 + chuso;
            temp /= 10;

        }
        System.out.print("Số lượng các chữ số là " + n1);
        System.out.print("Tổng của các chữ số là " + sum);
        System.out.print("Số đảo ngược của chữ số là " + sodaonguoc);
    }
}