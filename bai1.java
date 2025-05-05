package LABTUAN5;
import java.util.ArrayList;
abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;
    public NhanVien(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }
    public abstract double tinhLuong();
    public void xuat() {
        System.out.println("Mã NV: " + maNhanVien);
        System.out.println("Tên NV: " + tenNhanVien);
        System.out.println("Trình độ: " + trinhDo);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Lương thực nhận: " + tinhLuong());
    }
}
class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapChucVu;
    public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenMon, double phuCapChucVu) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapChucVu;
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyên môn: " + chuyenMon);
        System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
    }
}
class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;
    public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenMon, double phuCapDocHai) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyên môn: " + chuyenMon);
        System.out.println("Phụ cấp độc hại: " + phuCapDocHai);
    }
}
class PhucVu extends NhanVien {
    public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
    @Override
    public void xuat() {
        super.xuat();
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        danhSachNhanVien.add(new QuanLy("QL01", "Nguyen Van A", "Đại học", 8000000, "Quản trị", 2000000));
        danhSachNhanVien.add(new NghienCuu("NC01", "Nguyen Lu Kham", "Thạc sĩ", 75000000, "Sinh học", 1500000));
        danhSachNhanVien.add(new PhucVu("PV01", "Le Van C", "Cao đẳng", 6000000));
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println("Thông tin nhân viên");
            nv.xuat();
            System.out.println();
        }
    }
}