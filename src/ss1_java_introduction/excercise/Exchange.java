package ss1_java_introduction.excercise;

import java.util.Scanner;

//Bước 1: Tạo dự án mới và khai báo hàm main()
//Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD.
//Hiện nay, tỉ giá có thể là 23000 VND/USD.
//Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào.
//Bước 4: Tính giá trị VND và hiển thị ra màn hình.
public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;

        System.out.println("Enter your USD : ");

        double exchange = Double.parseDouble(scanner.nextLine());
        double result;

        result = exchange * vnd;

        System.out.printf("%f USD exchange to VND is : %f ", exchange, result);
    }
}
