package com.khoatnd2005110002.Tuan3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
    int[] SoNguyen = new int [5];
    //nhập mảng
    Scanner Mang = new Scanner(System.in);
    for(int i = 0; i < SoNguyen.length; i++){
        System.out.println("số thứ "+(i+1));
        SoNguyen[i] = Mang.nextInt();
        
    }
    //xuất mảng vừa nhập
    System.out.println("mảng vừa nhập");
    for (int i : SoNguyen) {
        System.out.print("\t"+i);
    }
    //xuất mảng theo thứ tự tăng dần
    System.out.println("mảng sau khi sắp xếp:");
    Arrays.sort(SoNguyen);
    for (int i : SoNguyen) {
        System.out.print("\t"+i);
    }
    //tìm giá trị nhỏ nhất
    int Min = SoNguyen[0];
    for(int i = 0; i< SoNguyen.length; i++){
        Min = Math.min(Min, SoNguyen[i]);
    }
    System.out.print("\nPhần tử có giá trị nhỏ nhất:"+Min);
    //tính trung bình cộng các số chia hết cho 3
    int tong = 0;
    int dem = 0;
    for(int i=0; i < SoNguyen.length; i++){
        if(SoNguyen[i] % 3 == 0){
            tong+=SoNguyen[i];
            dem++;
        }
    }
    System.out.println("\ntrung bình cộng các số chia hết cho 3:"+(tong/dem));
}
}