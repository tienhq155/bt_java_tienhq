import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class bai_20_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Vui lòng nhập một số nguyên!");
            return;
        }
        
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
        } else {
            ArrayList<Integer> uocSo = new ArrayList<>();
            ArrayList<Integer> uocSoLe = new ArrayList<>();
            ArrayList<Integer> uocSoChan = new ArrayList<>();
            int tong = 0;
            int tich = 1;
            int tongUocSoChan = 0;
            int tichUocSoLe = 1;
            int count = uocSoChan.size();
            int tonguocnhohonn = tong - n;
            int uoclelonnhat = n;
            double sqrtN = Math.sqrt(n);

            // Tìm ước số tối ưu (chạy đến căn bậc hai của n)
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    // Thêm ước số thứ nhất
                    uocSo.add(i);
                    tong += i;
                    tich *= i;
                    if (i % 2 == 0) {
                        uocSoChan.add(i);
                        tongUocSoChan += i;
                    } else {
                        uocSoLe.add(i);
                        tichUocSoLe *= i;
                    }
                    
                    // Thêm ước số thứ hai (nếu khác số đầu)
                    if (i != n / i) {
                        int uocThuHai = n / i;
                        uocSo.add(uocThuHai);
                        tong += uocThuHai;
                        tich *= uocThuHai;
                        if (uocThuHai % 2 == 0) {
                            uocSoChan.add(uocThuHai);
                            tongUocSoChan += uocThuHai;
                        } else {
                            uocSoLe.add(uocThuHai);
                            tichUocSoLe *= uocThuHai;
                        }
                    }
                }
            }
            //while (uoclelonnhat % 2 == 0) {
            //    uoclelonnhat /= 2;
            //}   
            if(!uocSoLe.isEmpty()) {
                uoclelonnhat = Collections.max(uocSoLe);
            }
            if(tonguocnhohonn == n){
                System.out.println(n + " là số hoàn thiện");
            }
            if(uocSo.size() == 2){
                System.out.println(n + " là số nguyên tố");
            }
            if(sqrtN == (int) sqrtN){
                System.out.println(n + " là số chính phương");
            }
            Collections.sort(uocSo);
            Collections.sort(uocSoLe);
            Collections.sort(uocSoChan);
            
            // Xuất kết quả
            System.out.println("Các ước số: " + uocSo);
            System.out.println("Số lượng ước số: " + uocSo.size());
            System.out.println("Tổng các ước số: " + tong);
            System.out.println("Tích các ước số: " + tich);
            System.out.println("Các ước số lẻ: " + uocSoLe);
            System.out.println("Tích các ước số lẻ: " + tichUocSoLe);
            System.out.println("Các ước số chẵn: " + uocSoChan);
            System.out.println("Tổng các ước số chẵn: " + tongUocSoChan);
            System.out.println("Số lượng ước số chẵn: " + uocSoChan.size());
            System.out.println("Tổng số ước nhỏ hơn chính nó : " + tonguocnhohonn);
            System.out.println("Ước số lẻ lớn nhất: " + uoclelonnhat);
        }
        sc.close();
    }
}
