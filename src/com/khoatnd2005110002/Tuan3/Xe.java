package com.khoatnd2005110002.Tuan3;

public class Xe {
    // thuộc tính
    String TenChuXe;
    String HangSanXuat;
    String Dong;
    String GiayPhep;
    String DungTichXang;
    // Phương thức
    void inThongTinXe(){
        System.out.println("Chủ xe: "+TenChuXe);
        System.out.println("Hãng sản xuất: "+HangSanXuat);
        System.out.println("Dòng: "+Dong);
        System.out.println("Số giấy phép: "+GiayPhep);
        System.out.println("Dung tích xăng :"+DungTichXang);
    }
}