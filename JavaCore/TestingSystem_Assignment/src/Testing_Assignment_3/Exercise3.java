package Testing_Assignment_3;

public class Exercise3 {
    public static void question1(){
        Integer luong = 5000;
        float floatLuong = luong.floatValue();
        System.out.printf("%.2f",floatLuong);
    }

    public static void question2(){
        String value = "1234567";
        int valueInt = Integer.parseInt(value);
        System.out.printf("%d",valueInt);
    }

    public static void question3(){
        String value = "1234567";
        Integer valueInt = Integer.valueOf(value);
        int valueIntInt = valueInt.intValue();
        System.out.printf("%d",valueIntInt);
    }
}
