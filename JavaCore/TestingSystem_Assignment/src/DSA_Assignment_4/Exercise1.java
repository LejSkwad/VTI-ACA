package DSA_Assignment_4;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = sc.nextInt();
        }

        Map<Integer, Integer> tansuat = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (tansuat.containsKey(array[i])) {
                tansuat.put(array[i], tansuat.get(array[i]) + 1);
            }else  {
                tansuat.put(array[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : tansuat.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
