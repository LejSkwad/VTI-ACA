package DSA_Assignment_1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac gia tri cua mang");
        for(int i = 0;i < array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Mang da nhap: " + Arrays.toString(array));

        int temp;
        for(int j = 0;j < array.length - 1;j++){
            for(int k = j + 1;k < array.length;k++){
                if(array[j] > array[k]){
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
