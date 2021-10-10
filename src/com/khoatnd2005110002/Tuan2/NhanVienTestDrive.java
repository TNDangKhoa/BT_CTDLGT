package com.khoatnd2005110002.Tuan2;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = "Nguyễn Văn A";
        nhanVien.ngaySinh = "21 8 1994";
        nhanVien.boPhanLamViec = "phòng kế toán";
        nhanVien.Luong = 60000000;
        nhanVien.diaChi = "TP.Hồ Chí Minh";
        nhanVien.inThongTinNhanVien();
    }
}
