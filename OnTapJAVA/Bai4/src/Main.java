import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc143 = new Scanner(System.in);
        TuyenSinh qlTuyenSinh143 = new TuyenSinh();

        while (true) {
            System.out.println("\n===== QUẢN LÝ THÍ SINH =====");
            System.out.println("1. Nhập thí sinh");
            System.out.println("2. Hiển thị tất cả thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            String chon143 = sc143.nextLine();

            switch (chon143) {
                case "1":
                    qlTuyenSinh143.nhapThiSinh143(sc143);
                    break;
                case "2":
                    qlTuyenSinh143.hienThiTatCa143();
                    break;
                case "3":
                    System.out.print("Nhập số báo danh cần tìm: ");
                    String sbd143 = sc143.nextLine();
                    qlTuyenSinh143.timKiemTheoSBD143(sbd143);
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