package com.khoatnd2005110002.Tuan4;

import java.util.Scanner;

import java.util.ArrayList;

public class BTMang_NhanVienTestDrive {
    public static void main(String[] args) {
        ArrayList<BTMang_NhanVien> NhanVienList = new ArrayList<BTMang_NhanVien>();

        Scanner varInput = new Scanner(System.in);
        System.out.println(" nhap danh sach nhan vien");
        for(int i = 0; i < 2; i++){
            System.out.println(" nhập nhân viên thứ "+ (i+1));
            
            System.out.println("Tên nhân viên: ");
            String tenNhanVien = varInput.nextLine();
            
            System.out.println("Tiền Lương: ");
            int Luong = varInput.nextInt();
            
            System.out.println("Địa chỉ: ");
            String DiaChi = varInput.nextLine();
            
            System.out.println("Bộ phận làm việc: ");
            String BoPhanLamViec = varInput.nextLine();
            
            System.out.println("Ngày sinh: ");
            String NgaySinh = varInput.nextLine();

            NhanVienList.add(new BTMang_NhanVien(tenNhanVien, Luong, DiaChi, BoPhanLamViec, NgaySinh));
        }
        System.out.println("=======Danh sách sau khi nhập=======");
        for(BTMang_NhanVien BTMang_NhanVien : NhanVienList){
            BTMang_NhanVien.inThongTin();
        }
        System.out.println("Số lượng nhân viên là: ");
        System.out.println(NhanVienList.size());
        
        System.out.println("Nhập nhân viên thứ 3: ");
        System.out.println("Tên nhân viên: ");
        String tenNhanVien = varInput.nextLine();
            
        System.out.println("Tiền Lương: ");
        int Luong = varInput.nextInt();
            
        System.out.println("Địa chỉ: ");
        String DiaChi = varInput.nextLine();
            
        System.out.println("Bộ phận làm việc: ");
        String BoPhanLamViec = varInput.nextLine();
            
        System.out.println("Ngày sinh: ");
        String NgaySinh = varInput.nextLine();
        var sachthu3 = new BTMang_NhanVien(tenNhanVien, Luong, DiaChi, BoPhanLamViec, NgaySinh);
        NhanVienList.add(sachthu3);

        System.out.println("=======số lượng nhân viên là========");
        System.out.println(NhanVienList.size());
        
        System.out.println("======= nhân viên mà bạn muốn xóa là nhân viên số?: ========");
        int nhanvienmuonxoa = varInput.nextInt();
        NhanVienList.remove(nhanvienmuonxoa-1);
        varInput.close();
        for ( BTMang_NhanVien BTMang_NhanVien : NhanVienList ){
            BTMang_NhanVien.inThongTin();
        }
    }
}
