package com.khoatnd2005110002.Tuan4;

public class BTMang_NhanVien {
    String tenNhanVien;
    int Luong;
    String DiaChi;
    String BoPhanLamViec;
    String NgaySinh;
    int sinhvienmuonxoa;

    BTMang_NhanVien(){}
    BTMang_NhanVien(String tenNhanVienmoi, int Luongmoi, String DiaChimoi, String BoPhanLamViecmoi, String NgaySinhmoi){
        tenNhanVien = BoPhanLamViecmoi;
        Luong = Luongmoi;
        DiaChi = DiaChimoi;
        BoPhanLamViec = BoPhanLamViecmoi;
        NgaySinh = NgaySinhmoi;
    }
    void inThongTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong: " + Luong);
        System.out.println("Dia chi: " + DiaChi);
        System.out.println("Bo phan lam viec: " + BoPhanLamViec);
        System.out.println("Ngay sinh: " + NgaySinh);
    }
}
