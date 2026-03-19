import java.util.Scanner;
public class bai_80{
//bài 70: Tính S(x,n) = 1 - 1/(1+2) + 1/(1+2+3) - ... + (-1)^n*1/(1+2+3+...+n)
//nk = (2*(-1)^(k+1))/(k*(k+1))
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double s = 0;
        int dau = 1;
        for (int k = 1; k <= n; k++){
            double ms = (double) k * (k + 1)/2;
            s += dau * (1.0/ms);
            dau = -dau;
        }
        System.out.printf("Kết quả S(n) = %.5f%n", s); 
    }
//bài 71: Tính S(x,n) = -x + X^2/(1+2) - x^3/(1+2+3) + ... + (-1)^n*x^n/(1+2+...+n)
//nk = (((-1)^k)*(2*x^k))/(k*(k+1))
    public static void newmain(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double s = 0;
        int dau = 1;
        for (int k = 1; k <= n; k++){
            double ms = (double) k * (k + 1)/2;
            s += dau * (-Math.pow(x, k) / ms);
            dau = -dau;
        }
        System.out.printf("Kết quả S(x,n) = %.5f%n", s);
    }
}
