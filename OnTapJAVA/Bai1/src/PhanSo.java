import java.util.Scanner;

class PhanSo {
    private int tuSo_143;
    private int mauSo_143;

    public PhanSo() {
        this.tuSo_143 = 0;
        this.mauSo_143 = 1;
    }

    public PhanSo(int tuSo_143, int mauSo_143) {
        if (mauSo_143 == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }
        this.tuSo_143 = tuSo_143;
        this.mauSo_143 = mauSo_143;
        rutGon_143();
    }

    private int gcd_143(int a_143, int b_143) {
        a_143 = Math.abs(a_143);
        b_143 = Math.abs(b_143);
        while (b_143 != 0) {
            int temp_143 = b_143;
            b_143 = a_143 % b_143;
            a_143 = temp_143;
        }
        return a_143;
    }

    public boolean laToiGian_143() {
        return gcd_143(tuSo_143, mauSo_143) == 1;
    }

    public void rutGon_143() {
        int ucln_143 = gcd_143(tuSo_143, mauSo_143);
        tuSo_143 /= ucln_143;
        mauSo_143 /= ucln_143;
        if (mauSo_143 < 0) {
            tuSo_143 *= -1;
            mauSo_143 *= -1;
        }
    }

    public PhanSo cong_143(PhanSo ps_143) {
        int tu_143 = this.tuSo_143 * ps_143.mauSo_143 + ps_143.tuSo_143 * this.mauSo_143;
        int mau_143 = this.mauSo_143 * ps_143.mauSo_143;
        return new PhanSo(tu_143, mau_143);
    }

    public PhanSo tru_143(PhanSo ps_143) {
        int tu_143 = this.tuSo_143 * ps_143.mauSo_143 - ps_143.tuSo_143 * this.mauSo_143;
        int mau_143 = this.mauSo_143 * ps_143.mauSo_143;
        return new PhanSo(tu_143, mau_143);
    }

    public PhanSo nhan_143(PhanSo ps_143) {
        int tu_143 = this.tuSo_143 * ps_143.tuSo_143;
        int mau_143 = this.mauSo_143 * ps_143.mauSo_143;
        return new PhanSo(tu_143, mau_143);
    }

    public PhanSo chia_143(PhanSo ps_143) {
        if (ps_143.tuSo_143 == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0");
        }
        int tu_143 = this.tuSo_143 * ps_143.mauSo_143;
        int mau_143 = this.mauSo_143 * ps_143.tuSo_143;
        return new PhanSo(tu_143, mau_143);
    }

    @Override
    public String toString() {
        if (mauSo_143 == 1) return tuSo_143 + "";
        return tuSo_143 + "/" + mauSo_143;
    }

    public void nhap_143(Scanner sc_143) {
        System.out.print("Nhập tử số: ");
        this.tuSo_143 = sc_143.nextInt();

        do {
            System.out.print("Nhập mẫu số (khác 0): ");
            this.mauSo_143 = sc_143.nextInt();
            if (this.mauSo_143 == 0) {
                System.out.println("⚠ Mẫu số phải khác 0. Vui lòng nhập lại!");
            }
        } while (this.mauSo_143 == 0);

        rutGon_143();
    }
}