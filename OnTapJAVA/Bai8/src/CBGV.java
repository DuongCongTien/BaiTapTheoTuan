class CBGV {
    private Nguoi nguoi143;
    private double luongCung143;
    private double thuong143;
    private double phat143;

    public CBGV(Nguoi nguoi143, double luongCung143, double thuong143, double phat143) {
        this.nguoi143 = nguoi143;
        this.luongCung143 = luongCung143;
        this.thuong143 = thuong143;
        this.phat143 = phat143;
    }

    public double tinhLuongThucLinh143() {
        return luongCung143 + thuong143 - phat143;
    }

    public void hienThi143() {
        nguoi143.hienThi143();
        System.out.println("Lương cứng: " + luongCung143);
        System.out.println("Thưởng: " + thuong143);
        System.out.println("Phạt: " + phat143);
        System.out.println("Lương thực lĩnh: " + tinhLuongThucLinh143());
    }
}