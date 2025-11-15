import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        while (true) {
            System.out.println("\n===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    qlcb.themCanBo(sc);
                    break;
                case "2":
                    System.out.print("Nhập họ tên cần tìm: ");
                    String hoTen = sc.nextLine();
                    qlcb.timKiemTheoTen(hoTen);
                    break;
                case "3":
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}