import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<BienLai> dsBienLai143 = new ArrayList<>();
    int chon143;

    do {
        System.out.println("\n===== MENU QUAN LY BIEN LAI TIEN DIEN =====");
        System.out.println("1. Nhap thong tin cac ho su dung dien");
        System.out.println("2. Hien thi thong tin cac bien lai");
        System.out.println("3. Tim kiem theo ma so cong to");
        System.out.println("4. Thoat");
        System.out.print("Nhap lua chon: ");
        chon143 = sc.nextInt();

        switch (chon143) {
            case 1 -> {
                System.out.print("Nhap so ho su dung dien: ");
                int n143 = sc.nextInt();
                for (int i = 0; i < n143; i++) {
                    System.out.println("\n--- Ho thu " + (i + 1) + " ---");
                    BienLai bl143 = new BienLai();
                    bl143.nhap143(sc);
                    dsBienLai143.add(bl143);
                }
            }
            case 2 -> {
                if (dsBienLai143.isEmpty()) {
                    System.out.println("Chua co du lieu. Vui long nhap truoc!");
                } else {
                    System.out.println("\n=== DANH SACH BIEN LAI ===");
                    for (int i = 0; i < dsBienLai143.size(); i++) {
                        System.out.println("\n--- Bien lai thu " + (i + 1) + " ---");
                        dsBienLai143.get(i).hienThi143();
                    }
                }
            }
            case 3 -> {
                if (dsBienLai143.isEmpty()) {
                    System.out.println("Chua co du lieu. Vui long nhap truoc!");
                } else {
                    sc.nextLine(); // bỏ dòng thừa
                    System.out.print("Nhap ma so cong to can tim: ");
                    String maTim143 = sc.nextLine();
                    boolean timThay143 = false;
                    for (BienLai bl143 : dsBienLai143) {
                        if (bl143.getMaSoCongTo143().equalsIgnoreCase(maTim143)) {
                            System.out.println("\n=== Thong tin ho co ma so cong to " + maTim143 + " ===");
                            bl143.hienThi143();
                            timThay143 = true;
                        }
                    }
                    if (!timThay143) {
                        System.out.println("Khong tim thay ho co ma so cong to nay!");
                    }
                }
            }
            case 4 -> System.out.println("Thoat chuong trinh!");
            default -> System.out.println("Lua chon khong hop le. Moi nhap lai!");
        }
    } while (chon143 != 4);

    sc.close();
}}