import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc143 = new Scanner(System.in);
        QuanLySach qlSach143 = new QuanLySach();


        while (true) {
            System.out.println("\n===== QUẢN LÝ TÀI LIỆU =====");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Tìm kiếm theo loại (sach/tapchi/bao)");
            System.out.println("3. Tìm kiếm theo mã tài liệu");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            String chon143 = sc143.nextLine();

            switch (chon143) {
                case "1":
                    qlSach143.themTaiLieu143(sc143);
                    break;
                case "2":
                    System.out.print("Nhập loại cần tìm (sach/tapchi/bao): ");
                    String loai143 = sc143.nextLine();
                    qlSach143.timKiemTheoLoai143(loai143);
                    break;
                case "3":
                    System.out.print("Nhập mã tài liệu cần tìm: ");
                    String ma143 = sc143.nextLine();
                    qlSach143.timKiemTheoMa143(ma143);
                    break;
                case "4":
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}