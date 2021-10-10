package com.khoatnd2005110002.Tuan1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên:");
        String hoTen = scanner.nextLine();
        System.out.println("Điểm trung bình:");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s",hoTen);
        System.out.printf("Diem TB: %.2f",diemTB);
    }
}
