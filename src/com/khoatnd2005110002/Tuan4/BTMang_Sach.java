package com.khoatnd2005110002.Tuan4;

public class BTMang_Sach {
    String tensach;
    String nhaXuatban;
    int namXuatban;
    Double giaBan;
    int soLuong;
    String theloai;
    int sachmuonxoa;
    BTMang_Sach(){}
    BTMang_Sach(String tensachmoi, String nhaxuatbanmoi, int namxuatbanmoi, double giabanmoi, int soluongmoi, String theloaimoi){
        tensach = tensachmoi ;
        nhaXuatban = nhaxuatbanmoi;
        namXuatban = namxuatbanmoi;
        giaBan = giabanmoi;
        soLuong = soluongmoi;
        theloai = theloaimoi;

    }

void inthongtin(){
    System.out.println(" Ten sach : "+ tensach + " NXB : "+ nhaXuatban + " Nam xuat ban : "+ namXuatban + "Gia : "+ giaBan +"So luong : "+ soLuong  + " The loai : " + theloai);
    }
}
