package DSA_Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        List<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap cac gia tri cua mang");
            array.add(sc.nextInt());
            System.out.println("Ban co muon nhap tiep khong?  Y/N ");
            String choice = sc.next().toLowerCase();
            if(choice.equals("n")){
                break;
            }
        }
        System.out.println("Mang da nhap: " + array.toString());

        for(int i = 0; i < array.size(); i++){
            int minPostition = i;
            for(int j = i + 1; j < array.size(); j++){
                if(array.get(j) < array.get(minPostition)){
                    minPostition = j;
                }
            }
            int temp = array.get(i);
            array.set(i, array.get(minPostition));
            array.set(minPostition, temp);
            System.out.println(array.toString());
        }
        System.out.println("Mang da sap xep " + array.toString());
    }
}
