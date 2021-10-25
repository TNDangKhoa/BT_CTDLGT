package com.khoatnd2005110002.kiemtragiuaki;

public class Apple {
    int Ma;
    int KhoiLuong;
    String MauSac;

    Apple(){}

    Apple(int id, int weigh, String color){
        Ma = id;
        KhoiLuong = weigh;
        MauSac = color;
    }
    void inThongTin(){
        System.out.println("Mã ID: " +Ma);
        System.out.println("Khối Lượng: " +KhoiLuong);
        System.out.println("Màu sắc: " +MauSac);
    }
}
