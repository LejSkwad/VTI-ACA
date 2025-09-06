package frontend;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerFrontend {
    private final Scanner sc = new Scanner(System.in);


    public String inputEmail() {
        while (true) {
            System.out.print("Nhập Email: ");
            String email = sc.nextLine().trim();
            if (isValidEmail(email)) return email;
            System.out.println("Email không hợp lệ. VD: nguyen.vannam@vti.com.vn");
        }
    }

    public String inputPassword() {
        while (true) {
            System.out.print("Nhập Password (6-12 ký tự): ");
            String password = sc.nextLine().trim();
            if (isValidPassword(password)) return password;
            System.out.println("Password phải có độ dài từ 6 tới 12 ký tự.");
        }
    }

    private boolean isValidEmail(String email) {
        String regex = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 6 && password.length() <= 12;
    }
}
