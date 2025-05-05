package LABTUAN5;
import java.util.Scanner;
class HinhChuNhat implements Hinh {
    private float dai;
    private float rong;

    public HinhChuNhat() {
        this.dai = 0;
        this.rong = 0;
    }
    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong: ");
        this.rong = scanner.nextFloat();
    }
    @Override
    public void xuat() {
        System.out.println("Hinh chu nhat - Dai: " + dai + ", Rong: " + rong + ", Dien tich: " + dienTich());
    }
    @Override
    public float dienTich() {
        return dai * rong;
    }
}
