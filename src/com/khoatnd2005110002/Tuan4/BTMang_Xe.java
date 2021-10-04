package com.khoatnd2005110002.Tuan4;

public class BTMang_Xe {
    
    String tenChuXe;
    String HangSX;
    String Dong;
    String GiayPhep;
    int DungTichXang;

    BTMang_Xe(){}
    BTMang_Xe(String tenChuXemoi, String HangSXmoi, String Dongmoi, String GiayPhepmoi, int DungTichXangmoi){
        tenChuXe = tenChuXemoi;
        HangSX = HangSXmoi;
        Dong = Dongmoi;
        GiayPhep = GiayPhepmoi;
        DungTichXang = DungTichXangmoi;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: " + tenChuXe);
        System.out.println("Hãng SX: " + HangSX);
        System.out.println("Dòng: " + Dong);
        System.out.println("Giấy phép: " + GiayPhep);
        System.out.println("Dung Tích Xăng: " + DungTichXang);
    }
}
