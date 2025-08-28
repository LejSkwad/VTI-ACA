package DSA_Assignment_4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("Nhap so can tim");
        int number =  sc.nextInt();
        BinarySearch(array,number);
    }

    public static void BinarySearch(int[] array, int number){
        int high = array.length - 1;
        int low = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(array[mid] == number){
                System.out.println("So can tim nam o vi tri thu: " + (mid + 1));
                break;
            }if(array[mid] < number){
                low = mid + 1;
            }
            if(array[mid] > number){
                high = mid - 1;
            }else{
                System.out.println("Khong tim thay phan tu");
                break;
            }
        }
    }
}
