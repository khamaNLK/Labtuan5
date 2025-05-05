package LABTUAN5;
import java.util.Scanner;

public class Mainbai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Hinh[] ds = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nChon loai hinh se nhap:");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");

            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    break;
                default:
                    System.out.println("Chon sai, mac dinh la hinh vuong");
                    ds[i] = new HinhVuong();
                    break;
            }

            ds[i].nhap();
        }
        System.out.println("\nDanh sach cac hinh:");
        for (Hinh h : ds) {
            h.xuat();
        }


        Hinh hinhDienTichLonNhat = ds[0];
        for (int i = 1; i < ds.length; i++) {
            if (ds[i].dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = ds[i];
            }
        }

        System.out.println("\nHinh co dien tich lon nhat:");
        hinhDienTichLonNhat.xuat();
    }
}