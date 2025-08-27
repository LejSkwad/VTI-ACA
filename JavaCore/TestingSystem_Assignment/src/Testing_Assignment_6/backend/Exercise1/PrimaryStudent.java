package Testing_Assignment_6.backend.Exercise1;

public class PrimaryStudent extends Student {
    private static int count = 0;

    public PrimaryStudent(String id, String name) {
        super(id, name);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
