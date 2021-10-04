package com.khoatnd2005110002.Tuan4;

import java.util.Scanner;

import java.util.ArrayList;

public class BTMang_XeTestDrive {
    public static void main(String[] args) {
        ArrayList<BTMang_Xe> XeList = new ArrayList<BTMang_Xe>();

        Scanner varInput = new Scanner(System.in);
        System.out.println(" Nhập DS Xe: ");
        for(int i = 0; i < 2; i++){
            System.out.println(" nhập xe thứ "+ (i+1));
            
            System.out.println("Tên  chủ xe: ");
            String tenChuXe = varInput.nextLine();
            
            System.out.println("Hãng SX: ");
            String HangSX = varInput.nextLine();
            
            System.out.println("Dòng: ");
            String Dong = varInput.nextLine();
            
            System.out.println("Giấy Phép: ");
            String GiayPhep = varInput.nextLine();
            
            System.out.println("Dung Tích Xăng: ");
            int DungTichXang = varInput.nextInt();

            XeList.add(new BTMang_Xe(tenChuXe, HangSX, Dong, GiayPhep, DungTichXang));
        }
        System.out.println("=======Danh sách sau khi nhập=======");
        for(BTMang_Xe BTMang_Xe : XeList){
            BTMang_Xe.inThongTin();
        }
        System.out.println("Số lượng Xe là: ");
        System.out.println(XeList.size());
        
        System.out.println("Nhập Xe thứ 3: ");
        System.out.println("Tên chủ xe: ");
        String tenChuXe = varInput.nextLine();
            
        System.out.println("Tiền Lương: ");
        String HangSX = varInput.nextLine();
            
        System.out.println("Địa chỉ: ");
        String Dong = varInput.nextLine();
            
        System.out.println("Bộ phận làm việc: ");
        String GiayPhep = varInput.nextLine();
            
        System.out.println("Ngày sinh: ");
        int DungTichXang = varInput.nextInt();
        var XeThu3 = new BTMang_Xe(tenChuXe, HangSX, Dong, GiayPhep, DungTichXang);
        XeList.add(XeThu3);

        System.out.println("=======số lượng nhân viên là========");
        System.out.println(XeList.size());
        
        System.out.println("======= nhân viên mà bạn muốn xóa là nhân viên số?: ========");
        int nhanvienmuonxoa = varInput.nextInt();
        XeList.remove(nhanvienmuonxoa-1);
        varInput.close();
        for ( BTMang_Xe BTMang_Xe : XeList ){
            BTMang_Xe.inThongTin();
        }
    }
}
