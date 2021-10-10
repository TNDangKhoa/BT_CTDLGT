package com.khoatnd2005110002.Tuan3;

public class MayTinh {
    // thuộc tính
    String nhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String RAM;
    String CPU;
    int gia;
    int namBaoHanh;

    // Phương thức
    void inThongTinMayTinh(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.println("Năm sản xuất: "+namSanXuat);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.println("Ram: "+RAM);
        System.out.println("CPU: "+CPU);
        System.out.println("Giá bán: "+gia);
        System.out.println("Năm bảo hành: "+namBaoHanh);
    }
}
