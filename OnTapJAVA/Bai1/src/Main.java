import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_143 = new Scanner(System.in);

        PhanSo sp1_143 = new PhanSo();
        PhanSo sp2_143 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        sp1_143.nhap_143(sc_143);

        System.out.println("Nhập phân số thứ hai:");
        sp2_143.nhap_143(sc_143);

        PhanSo spTong_143 = sp1_143.cong_143(sp2_143);
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println(sp1_143 + " + " + sp2_143 + " = " + spTong_143);
        System.out.println(sp1_143 + " - " + sp2_143 + " = " + sp1_143.tru_143(sp2_143));
        System.out.println(sp1_143 + " * " + sp2_143 + " = " + sp1_143.nhan_143(sp2_143));
        System.out.println(sp1_143 + " / " + sp2_143 + " = " + sp1_143.chia_143(sp2_143));

        System.out.println("Phân số tổng " + (spTong_143.laToiGian_143() ? "đã tối giản." : "chưa tối giản."));
    }
}