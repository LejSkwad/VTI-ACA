package frontend;

import java.util.Scanner;

public class EmployeeFrontend {
    private final Scanner sc = new Scanner(System.in);

    public int inputProjectId() {
        while (true) {
            System.out.print("Nhập project_id: ");
            try {
                return Math.toIntExact(Long.parseLong(sc.nextLine().trim()));
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, hãy nhập số.");
            }
        }
    }
}