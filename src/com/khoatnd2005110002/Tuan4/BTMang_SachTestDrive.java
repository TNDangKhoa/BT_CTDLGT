package com.khoatnd2005110002.Tuan4;
import java.util.Scanner;
import java.util.ArrayList;
public class BTMang_SachTestDrive {
    public static void main(String[] args) {

        ArrayList<BTMang_Sach> sachList = new ArrayList<BTMang_Sach>(); 


        Scanner varInput = new Scanner(System.in);
        System.out.println(" nhap danh sách sách");
        
        for(int i = 0; i < 2; i++){
            System.out.println(" nhập sách thứ "+ (i+1));

            System.out.println("tên sách");
            String tensach = varInput.nextLine();

            System.out.println("nhà xuất bản");
            String nhaXuatban = varInput.nextLine();

            System.out.println("năm xuất bản");
            int namXuatban = varInput.nextInt();

            System.out.println("giá bán");
            Double giaBan = varInput.nextDouble();

            System.out.println("số lượng");
            int soLuong = varInput.nextInt();
            varInput.nextLine();

            System.out.println("thể loại ");
            String theloai = varInput.nextLine();

            sachList.add(new BTMang_Sach(tensach,nhaXuatban,namXuatban,giaBan,soLuong,theloai));
        } 
        System.out.println("=======in danh sách sách sau khi nhập========");
        for ( BTMang_Sach BTMang_Sach : sachList ){
            BTMang_Sach.inthongtin();
            
        }

        System.out.println("=======số lượng sách là========");
        System.out.println(sachList.size());


        System.out.println(" nhập sách thứ 3 ");

        System.out.println("tên sách");
        String tensach = varInput.nextLine();

        System.out.println("nhà xuất bản");
        String nhaXuatban = varInput.nextLine();

        System.out.println("năm xuất bản");
        int namXuatban = varInput.nextInt();

        System.out.println("giá bán");
        Double giaBan = varInput.nextDouble();

        System.out.println("số lượng");
        int soLuong = varInput.nextInt();
        varInput.nextLine();

        System.out.println("thể loại ");
        String theloai = varInput.nextLine();
        var sachthu3 = new BTMang_Sach(tensach,nhaXuatban,namXuatban,giaBan,soLuong,theloai);
        sachList.add(sachthu3);

        System.out.println("=======số lượng sách là========");
        System.out.println(sachList.size());
        
    
        System.out.println("======= sách mà bạn muốn xóa là sách số ========");
        int sachmuonxoa = varInput.nextInt();
        sachList.remove(sachmuonxoa-1);
        varInput.close();
        for ( BTMang_Sach BTMang_Sach : sachList ){
            BTMang_Sach.inthongtin();
        
        }
    }
}
