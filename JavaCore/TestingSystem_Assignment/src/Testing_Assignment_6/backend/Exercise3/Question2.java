package Testing_Assignment_6.backend.Exercise3;

public class Question2 {
    public static void main(String[] args) {
        float result = divide(7,0);

        System.out.println(result);
    }

    public static float divide(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            throw new ArithmeticException("Cannot divide by zero");
        }finally{
            System.out.println("divide complete");
        }
    }
}
