package exercise06;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        // Khai báo các biến kiểu float theo yêu cầu
        float width;
        float height;
        float area;
        float circumference;

        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều rộng và chiều cao hình chữ nhật từ bàn phím
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        width = scanner.nextFloat();

        System.out.print("Nhập chiều cao hình chữ nhật: ");
        height = scanner.nextFloat();

        // Tính diện tích và chu vi
        area = width * height;                  // Diện tích = chiều rộng * chiều cao
        circumference = 2 * (width + height);   // Chu vi = 2 * (chiều rộng + chiều cao)[cite: 12]

        // In kết quả ra màn hình
        System.out.printf("Diện tích hình chữ nhật là: %.2f\n", area);
        System.out.printf("Chu vi hình chữ nhật là: %.2f\n", circumference);

        // Đóng scanner
        scanner.close();
    }
}