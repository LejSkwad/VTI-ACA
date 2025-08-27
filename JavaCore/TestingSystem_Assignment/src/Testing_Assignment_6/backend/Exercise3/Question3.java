package Testing_Assignment_6.backend.Exercise3;

public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Vuot qua gioi han phan tu");
        }
    }
}
