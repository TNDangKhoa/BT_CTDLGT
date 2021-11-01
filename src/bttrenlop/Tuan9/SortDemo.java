package bttrenlop.Tuan9;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[]{1 , 21, 4, 3, 5};
        System.out.println("Mang: " + Arrays.toString(mangSoNguyen));
        selectionSort(mangSoNguyen);
        System.out.println("Mang sau xap xep: "+Arrays.toString(mangSoNguyen));
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index =j ;
                }
                
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
