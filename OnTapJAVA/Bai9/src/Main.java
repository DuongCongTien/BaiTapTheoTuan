import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc143 = new Scanner(System.in);
        QuanLyTheMuon qltm143 = new QuanLyTheMuon();

        int chon143;
        do {
            System.out.println("\n===== MENU QUẢN LÝ THẺ MƯỢN =====");
            System.out.println("1. Nhập danh sách thẻ mượn");
            System.out.println("2. Hiển thị toàn bộ danh sách thẻ mượn");
            System.out.println("3. Hiển thị thẻ mượn có hạn trả cuối tháng");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon143 = Integer.parseInt(sc143.nextLine());

            switch (chon143) {
                case 1 -> qltm143.nhapDanhSach143(sc143);
                case 2 -> qltm143.hienThiTatCa143();
                case 3 -> qltm143.hienThiHanTraCuoiThang143();
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("⚠ Lựa chọn không hợp lệ!");
            }
        } while (chon143 != 0);

        sc143.close();
    }
}