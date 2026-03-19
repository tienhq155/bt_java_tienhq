import java.util.Scanner;
public class bai43_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        long n = sc.nextLong(); // Nhập số nguyên dương n từ bàn phím
        
        long temp = n; // Lưu giá trị ban đầu của n để sử dụng sau này
        long temp1 = n; // Biến tạm để tính tổng các chữ số
        long temp2 = n; // Biến tạm để tính tích các chữ số

        int n1 = 0; // Biến đếm số chữ số
        int sum = 0;
        int tich = 1;
        int sole = 0;
        int sochan = 0;
        int tongchusochan = 0;
        int tichchusole = 0;
        while (temp2 >= 10) temp2 /= 10; // Lấy chữ số đầu tiên
        long chusodautien = temp2; // Lưu chữ số đầu tiên
        int cout_first = 0;
        long sodaonguoc = 0;
        long max = 0;
        int count_max = 0;
        long min = 9;
        int count_min = 0;
        long temp3 = -1; // Biến tạm để đếm số chữ số
        
        boolean toanle = true; // Biến kiểm tra xem tất cả chữ số có phải là lẻ hay không
        boolean toanchan = true; // Biến kiểm tra xem tất cả chữ số có phải là chẵn hay không
        boolean tangdan = true; // Biến kiểm tra xem các chữ số có tăng dần hay không
        boolean giamdan = true; // Biến kiểm tra xem các chữ số có giảm


        while(temp > 0){
            long chuso = temp % 10; // Lấy chữ số cuối cùng
            n1++; // Tăng số lượng chữ số
            sum += chuso; // Cộng chữ số vào tổng
            tich *= chuso; // Nhân chữ số vào tích
            sodaonguoc = sodaonguoc * 10 + chuso; // Xây dựng số đảo ngược
            max = Math.max(max, chuso); // Cập nhật số lớn nhất
            if (chuso > max) {
                max = chuso; // Cập nhật số lớn nhất
                count_max = 1; // Reset đếm số lần xuất hiện của số lớn nhất
            }
            else if (chuso == max) {
                count_max++; // Đếm số lần xuất hiện của số lớn nhất
            }
            min = Math.min(min, chuso); // Cập nhật số nhỏ nhất
            if  (chuso < min) {
                min = chuso; // Cập nhật số nhỏ nhất
                count_min = 1; // Reset đếm số lần xuất hiện của số nhỏ nhất
            }
            else if (chuso == min) {
                count_min++; // Đếm số lần xuất hiện của số nhỏ nhất
            }
            if(chuso % 2 != 0){ // Nếu chữ số là lẻ
                sole++; // Tăng số lượng chữ số lẻ
                tichchusole *= chuso; // Nhân chữ số lẻ vào tích
                toanchan = false; // Đánh dấu rằng không phải tất cả chữ số đều là chẵn
            }
            else { // Nếu chữ số là chẵn
                sochan++; // Tăng số lượng chữ số chẵn
                tongchusochan += chuso; // Cộng chữ số chẵn vào tổng
                toanle = false; // Đánh dấu rằng không phải tất cả chữ số đều là lẻ
            }
            /*if(temp < 10) {
                chusodautien = temp; // Lưu chữ số đầu tiên
            }*/
            if (temp3 != -1) { // Nếu không phải là lần đầu tiên
                if (chuso < temp3) {
                    tangdan = false; // Đánh dấu rằng các chữ số không tăng dần
                }
                else if (chuso > temp3) {
                    giamdan = false; // Đánh dấu rằng các chữ số không giảm dần
                }
            }
            temp3 = chuso; // Cập nhật giá trị của temp3 cho lần tiếp theo

            while (temp1 > 0 ) {
                if(temp1 % 10 == chusodautien) {
                    cout_first++; // Đếm số lần xuất hiện của chữ số đầu tiên
                }
                temp1 /= 10; // Loại bỏ chữ số cuối cùng để tiếp tục kiểm tra với chữ số tiếp theo 
            }
            temp /= 10;//bỏ chữ số cuối cùng để tiếp tục vòng lặp với chữ số tiếp theo
        }

        // In kết quả
        System.out.println("Tổng số chữ số của " + n + " là: " + n1);
        System.out.println("Tổng các chữ số của " + n + " là: " + sum);
        System.out.println("Tích các chữ số của " + n + " là: " + tich);
        System.out.println("Số lượng chữ số lẻ của " + n + " là: " + sole);
        System.out.println("Số lượng chữ số chẵn của " + n + " là: " + sochan);
        System.out.println("Tổng các chữ số chẵn của " + n + " là: " + tongchusochan);
        System.out.println("Tích các chữ số lẻ của " + n + " là: " + tichchusole);
        System.out.println("Chữ số đầu tiên của " + n + " là: " + chusodautien);
        System.out.println("Số lớn nhất của " + n + " là: " + max);
        System.out.println("Số nhỏ nhất của " + n + " là: " + min);
        System.out.println("Số đảo ngược của " + n + " là: " + sodaonguoc);
        System.out.println("Số lần xuất hiện của số lớn nhất " + max + " là: " + count_max);
        System.out.println("Số lần xuất hiện của số nhỏ nhất " + min + " là: " + count_min);
        System.out.println("Số lần xuất hiện của chữ số đầu tiên " + chusodautien + " là: " + cout_first);
        System.out.println("Toàn bộ chữ số của " + n + " đều là lẻ: " + (toanle ? "Có" : "Không"));
        System.out.println("Toàn bộ chữ số của " + n + " đều là chẵn: " + (toanchan ? "Có" : "Không"));
        System.out.println("Các chữ số của " + n + " có tăng dần: " + (tangdan ? "Có" : "Không"));
        System.out.println("Các chữ số của " + n + " có giảm dần: " + (giamdan ? "Có" : "Không"));
    }
}
        /* 
        long temp = n; // Lưu giá trị ban đầu của n để sử dụng sau này
        long temp1 = n; // Biến tạm để tính tổng các chữ số
        long temp2 = n; // Biến tạm để tính tích các chữ số
        long temp3 = n; // Biến tạm để đếm số chữ số
        long temp4 = n; // Biến tạm để tính tổng các chữ số chẵn và tích các chữ số lẻ
        int n1 = 0; // Biến đếm số chữ số
        int sum = 0;
        int tich = 1;
        int sole = 0;
        int sochan = 0;
        int tongchusochan = 0;
        int tichchusole = 1;
        //long temp = n; // Lưu giá trị ban đầu của n để sử dụng sau này
        //String s = String.valueOf(n);
        //int soChuSo = s.length();
        while(temp > 0){
            n1++;
            temp /= 10;
        }
        while (temp1 > 0) {
            sum += temp1 % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            temp1 /= 10; // Loại bỏ chữ số cuối cùng
        }
        while (temp2 > 0) {
            tich *= temp2 % 10; // Lấy chữ số cuối cùng và nhân vào tích
            temp2 /= 10; // Loại bỏ chữ số cuối cùng
            
        }
        while (temp3 > 0 ) {
            temp += temp3 % 10; // Lấy chữ số cuối cùng và cộng vào tổng số lẻ
            if(temp % 2 != 0){
                sole ++;
                tichchusole *= temp;
            }
            else {
                sochan++;
                tongchusochan += temp;
                
            }
            temp3 /= 10;
            }
        
        // In kết quả
        System.out.println("Tổng số chữ số của " + n + " là: " + n1);
        System.out.println("Tổng các chữ số của " + n + " là: " + sum);
        System.out.println("Tích các chữ số của " + n + " là: " + tich);
        System.out.println("Số lượng chữ số lẻ của " + n + " là: " + sole);
        System.out.println("Số lượng chữ số chẵn của " + n + " là: " + sochan);
        System.out.println("Tổng các chữ số chẵn của " + n + " là: " + tongchusochan);
        System.out.println("Tích các chữ số lẻ của " + n + " là: " + tichchusole);
    }

}*/