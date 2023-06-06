package ss2_loop_java.practice;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập số tiền bạn muốn gửi : ");
        double soTienMuonGui = Double.parseDouble(scanner.nextLine());

        System.out.println("Hãy nhập tỉ lệ lãi suất theo tháng : ");
        double laiXuat = Double.parseDouble(scanner.nextLine());

        System.out.println("Hãy nhập số tháng bạn muốn gửi");
        int soThang = Integer.parseInt(scanner.nextLine());

        double soTienLai = 0;
        for (int i = 0; i < soThang; i++) {
            soTienLai += soTienMuonGui * (laiXuat / 100) / 12 * soThang;

        }
        System.out.println("Số tiền lãi của bạn là : " + soTienLai);
    }
}
