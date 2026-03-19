import java.util.Scanner;
public class bai70{
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
    public static void new_1_main(String[] args) {
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

//bài 72: Tính S(x,n) = x - x^2/2! + x^3/3! - ... + (-1)^(n+1)*x^n/n!
//nk = ((-1)^k*2*x^k)/k(k+1)
    public static void new_2_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble(); 
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double luythuax = 1;
        double s = 0;

        for (int k = 1; k <= n; k++){
            luythuax *= x;
            double ts = 2*luythuax;
            double ms = (double) k * (k + 1);
            double nk = ts/ms;
            if (k % 2 != 0) {
                nk = -nk;
            }
            s += nk;
        System.out.printf("Kết quả S(x,n) = %.5f%n", s);
    }}


//bài 73: Tính S(x,n) = -1 + x^2/2! - x^4/4! + ... + (-1)^(n+1)*x^2n/2n! 

public static void new_3_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble(); 
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double luythuax = 1;
        double s = -1;

        for (int k = 1; k <= n; k++){
            luythuax *= (x * x);
            double ts = luythuax;
            double ms = (double) (2 * k) * (2 * k - 1);
            double nk = ts/ms;
            if (k % 2 != 0) {
                nk = -nk;
            }
            s += nk;
        }
        System.out.printf("Kết quả S(x,n) = %.5f%n", s);
    }
//bài 74: Tính S(x,n) = 1 - x + x^3/3! - x^5/5! + ... + (-1)^(n-1)*x^(2n+1)/(2n+1)!

    public static void new_4_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble(); 
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double luythuax = 1;
        double s = 1 - x;

        for (int k = 1; k <= n; k++){
            luythuax *=  x * x;
            double ts = luythuax;
            double ms = (double) (2 * k + 1) * (2 * k);
            double nk = ts/ms;
            if (k % 2 == 0) {
                nk = -nk;
            }
            s += nk;
        }
        System.out.printf("Kết quả S(x,n) = %.5f%n", s);
    }
}

