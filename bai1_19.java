import java.util.Scanner;
public class bai1_19{
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        System.out.print("Nhap x: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int sum = 0;      
        double sum1 = 0;  
        int sum2 = 1;

        //bài 1: Tính S(n) = 1 + 2 + 3 + ... + n 

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("S(" + n + ") = " + sum);
        scanner.close();
    
        //--------------------------------------------------
        //bài 2: Tính S(n) = 1^2+2^2+3^2+...+n^2

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("S(" + n + ") = " + sum);
        scanner.close();

        //--------------------------------------------------
        //bài 3: tính S(n)= 1/1 + 1/2 + 1/3 + ... + 1/n

        for (int i = 1; i <= n; i++) {
            sum1 += 1.0 / i;
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();
        
        //--------------------------------------------------
        //bài 4: tính 1/2+1/4+1/6+...+1/2n

        for (int i = 1; i <= n; i++) {
            sum1 += 1.0 / (2 * i);
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();
        
        //--------------------------------------------------
        //bài 5: tính S(n) = 1/3 + 1/5 + 1/7 + ... + 1/2n+1
        
        for (int i = 0; i < n; i++) {
            sum1 += 1.0 / (2 * i + 1);
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();
        
        //--------------------------------------------------
        //bài 6: tính S(n) = 1/1*2 + 1/2*3 + 1/3*4 + ... + 1/n*(n+1)

        for (int i = 1; i <= n; i++) {
            sum1 += 1.0 / (i * (i + 1));
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();
        
        //--------------------------------------------------
        //bài 7: tính S(n) = 1/2 + 2/3 + 3/4 + ... + n/n+1

        for (int i = 1; i <= n; i++) {
            sum1 += (double) i / (i + 1);
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();

        //--------------------------------------------------
        //bài 8: tính S(n) = 1/2 + 3/4 + 5/6 + ... + (2n+1)/(2n+2) - Sai đề bài
        //sửa đề tính S(n) = 1/2 + 3/4 + 5/6 + ... + (2n-1)/(2n) 
        for (int i = 1; i < n; i++ ){
            sum += (double) (2*i + 1)/ (2*i);
        }
        System.out.println("S(" + n + ") = " + sum);
        scanner.close();

        //---------------------------------------------------
        //bài 9: tính S(n) =1 x 2 x 3 x 4 x ... x n

        for (int i = 1; i <= n; i++) {
            sum2 *= i;
        }
        System.out.println("S(" + n + ") = " + sum2);
        scanner.close();
        
        // -------------------------------------------------
        //bài 10: tính S(n,x) = n^x

        sum1 = Math.pow(n, x);
        System.out.println("S(" + n + ", " + x + ") = " + sum1);
        scanner.close();

        // -------------------------------------------------
        //bài 11: tính S(n) = 1 + 1 x 2 + 1 x 2 x 3 + ... + 1 x 2 x 3 x ... x n

        for (int i = 1; i < n; i++) {
            sum2 *= i;
            sum1 += sum2;
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();

        // -------------------------------------------------
        //bài 12: tính S(n) = x^1 + x^2 + x^3 + ... + x^n

        for (int i = 1; i <= n; i++) {
            sum1 += Math.pow(x, i);
        }
        System.out.println("S(" + n + ", " + x + ") = " + sum1);
        scanner.close();

        // -------------------------------------------------
        //bài 13: tính S(n) = x^2 + x^4 + x^6 + ... + x^2n

        for (int i = 1; i <= n; i++) {
            sum1 += Math.pow(x, 2 * i);
        }
        System.out.println("S(" + n + ", " + x + ") = " + sum1);
        scanner.close();

        // -------------------------------------------------
        //bài 14: tính S(n) = x^1 + x^3 + x^5 + ... + x^(2n+1)

        for (int i = 0; i < n; i++) {
            sum1 += Math.pow(x, 2 * i + 1);
        }
        System.out.println("S(" + n + ", " + x + ") = " + sum1);
        scanner.close();

        // -------------------------------------------------
        //bài 15: tính S(n) = 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+3+...+n)

        for (int i = 1; i <= n; i++) {
            sum += i;
            sum1 += 1/ sum;
        }
        System.out.println("S(" + n + ") = " + sum1);
        scanner.close();

        // -------------------------------------------------
        //bài 16: S(n) = x + (x^2)/(1+2) + (x^3)/(1+2+3) + ... + (x^n)/(1+2+3+...+n)

        for (int i = 1; i <= n; i++) {
            sum *= x;
            sum1 += i;
            sum2 += sum/sum1;
        }
        System.out.println("S(" + n + ", " + x + ") = " + sum2);
        scanner.close();

        //-------------------------------------------------
        //bài 17: S(n) = x + (x^2)/2! + (x^3)/3! + ... + (x^n)/n!
        
        
        for (int i = 1; i <= n; i++) {
            sum1 *= x;    
            sum *= i;
            sum2 += sum1/sum;
        }
        System.out.println("S(" + n + ", " + x + ") = " + sum2);
        scanner.close();
        
        //-------------------------------------------------
        //bài 18: S(n) = 1 + (x^2)/2! + (x^4)/4! + ... + (x^(2n))/(2n)!

        for (int i = 1; i <= n; i++) {
            sum1 *= x * x;    
            sum *= (i * 2 - 1) * (i * 2);
            sum2 += sum1/sum;
        }
        System.out.println("S(" + n + ", " + x + ") = " + sum2);
        scanner.close();

        // -------------------------------------------------
        //bài 19: S(n) = 1 + x + (x^3)/3! + (x^5)/5! + ... + (x^(2n+1))/(2n+1)!
        
        for (int i = 0; i < n; i++){
            sum1 *= x * x ;    
            sum *= (i * 2 + 1) * (i * 2);
            sum2 += sum1/sum;
        }

        //-------------------------------------------------
        //bài 67: Tính S(x,n) = x - x^2 + x^3 - x^4 + ... + (-1)^(n+1) * x^n

        double kq = (x * (1 - Math.pow(-x, n ))) / (1 + x);
        System.out.println("S(" + n + ", " + x + ") = " + kq);

        //-------------------------------------------------
        //bài 68: Tính S(x,n) = -x^2 + x^4 + ... + (-1)^n*x^(2n+1)

        double kq1 = (-Math.pow(x,2)*(1-Math.pow(-Math.pow(x, 2), n)))/(1-(-Math.pow(x, 2)));
        System.out.println("S(" + n + ", " + x + ") = " + kq1);

        // -------------------------------------------------
        //bài 69: Tính S(x,n) = x - x^3 + x^5 - x^7 + ... + (-1)^n*x^(2n+1)

        double kq2 = (x * (1 - Math.pow(-Math.pow(x, 2), n+1)))/(1 - (-Math.pow(x, 2)));
        System.out.println("S(" + n + ", " + x + ") = " + kq2);

        // -------------------------------------------------
        //bài 70: Tính S(x,n) = 1 - 1/(1+2) + 1/(1+2+3) - ... + (-1)^n*1/(1+2+3+...+n)
     
        
        //bài 33
    }
    public static void new_1_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        double s = 0;
        double gt = 1;
        for(int k = 1; k<= x; k++){
            s = Math.sqrt(2 + s);
        }
        //-----------------------------------------------
        for(int k = 1; k<= x; k++){
            s = Math.sqrt(s - 1);
            if (s == 0) {
                break;
            }
        }
        //------------------------------------------------
        for(int k = 1; k<= x; k++){
            s = Math.sqrt(s + 1);
        }
        //------------------------------------------------
        for(int k = 1; k<= x; k++){
            gt *= k;
            s = Math.sqrt(gt + s);
        }
        //------------------------------------------------
        s = Math.pow(2, 1.0/2);
        for(int k = 3; k<= x; k++){
            s = Math.pow(k + s, 1.0/k);
        }
        // ------------------------------------------------
        for(int k = 1; k<=x; k++)
            {
                s = Math.pow(k + s, 1.0/(k+1));
            }  
        //-------------------------------------------------
        for(int k = 1; k <=x ; k++){
            gt *= k;
            s = Math.pow(gt+s,1.0/(k+1));
        }
        //-------------------------------------------------
        for(int k = 1; k<=x; k++){
            gt*=x;
            s= Math.sqrt(gt+s);
        }
        //-------------------------------------------------

        System.out.printf("Kết quả S(x,n) = %.5f%n", s);
    }
    public static void new_2_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        double s = 1 ;
        for ( int k = 1; k <= x; k++){
            s = 1.0 /(1 + s);
        }
    }
    public static int new_3_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        int k = 0;
        int s = 0;
        while (s+(k+1)<x) {
            k++;
            s += k;
        }
        return k;
    }

}
