package com.khoatnd2005110002.kiemtragiuaki;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Apple> list = new ArrayList<Apple>();
    
    //nhập
    static void nhap(){
        scanner.nextLine();
        while(true){
            Apple apple = new Apple();
            System.out.print("Nhập màu sắc: ");
            apple.MauSac = scanner.nextLine();
            System.out.print("Nhập mã ID: ");
            apple.Ma = scanner.nextInt();
            System.out.print("Nhập khối lượng: ");
            apple.KhoiLuong = scanner.nextInt();
            list.add(apple);
            scanner.nextLine();
            System.out.print("Nhập thêm (y/n)?: ");
            if(scanner.nextLine().equals("n"))
                break;
            }
        }
        //Xuất
        static void xuat(){
            scanner.nextLine();
            for (Apple a : list){
                a.inThongTin();
            }
        }
        //Tìm táo theo màu
        static void search(){
                scanner.nextLine();
                System.out.println("Nhập màu của táo: ");
                String colorName = scanner.next();
                for (Apple a: list){
                    if((a.MauSac).equals(colorName)){
                        a.inThongTin();
                    }else{
                        System.out.println("Không có táo màu này!");
                    }
                }
            }

    public static void main(String[] args) {
        
    int suLuaChon;
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Nhập thông tin Táo.");
            System.out.println("2. Xuất DS Táo.");
            System.out.println("3. Tìm táo theo màu sắc.");
            System.out.println("4. Kết thúc chương trình.");
            System.out.println("Chọn chức năng: ");
            System.out.println("------------------MENU------------------");
            suLuaChon = scanner.nextInt();
            switch(suLuaChon){
                case 1:nhap();break;
                case 2:xuat();break;
                case 3:search(); break;
                default: System.out.println("kết thúc chương trình");
            }}while(suLuaChon >= 1 && suLuaChon <= 3);
}
}
