package Testing_Assignment_2;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.GroupAccount;

import java.util.ArrayList;
import java.util.List;

public class Exercise1{
    public static void question1(Account[] accounts) {
        Account acc = accounts[1];
        if (acc.getDepartment() == null) {
            System.out.println("Nhan vien chua co phong ban");
        } else {
            System.out.println("Phong ban cua nhan vien nay la " + acc.getDepartment().getDepartmentName());
        }
    }

    public static void question2(GroupAccount[] groupAccounts, Account[] accounts) {
        Account acc = accounts[1];

        List<Group> joinedGroup = new ArrayList<>();

        for (GroupAccount ga : groupAccounts) {
            if (ga.getAccount().getAccountID() == acc.getAccountID()) {
                joinedGroup.add(ga.getGroup());
            }
        }
        int count = joinedGroup.size();
        if (count == 0) {
            System.out.println("Nhân viên này chưa có Group");
        } else if (count == 1 || count == 2) {
            System.out.println("Group của nhân vieên này là Java, Fresher, C# Fresher");
        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trong tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public static void question3(Account[] accounts) {
        Account acc = accounts[1];
        System.out.println(acc.getDepartment() == null ? "Nhân viên chưa có phòng ban" : "Phòng ban của nhân viên này là " + acc.getDepartment().getDepartmentName());
    }

    public static void question4(Account[] accounts) {
        Account acc = accounts[0];
        String Position = acc.getPosition().getPositionName();
        System.out.println(Position.equals("Dev") ? "Đây là Developer" : "Người này không phải là Developer");
    }

    public static void question5(GroupAccount[] groupAccounts, Group[] groups) {
        Group group = groups[0];
        List<Account> joinedAccount = new ArrayList<>();
        for(GroupAccount ga : groupAccounts) {
            if(ga.getGroup().getGroupID() == group.getGroupID()) {
                joinedAccount.add(ga.getAccount());
            }
        }
        int count = joinedAccount.size();
        String Message = switch (count) {
            case 1 -> "Nhóm có một thành viên";
            case 2 -> "Nhóm có hai thành viên";
            case 3 -> "Nhóm có ba thành viên";
            default -> "Nhóm có nhiều thành viên";
        };
        System.out.println(Message);
    }

    public static void question6(GroupAccount[] groupAccounts, Account[] accounts) {
        Account acc = accounts[1];

        List<Group> joinedGroup = new ArrayList<>();

        for (GroupAccount ga : groupAccounts) {
            if (ga.getAccount().getAccountID() == acc.getAccountID()) {
                joinedGroup.add(ga.getGroup());
            }
        }
        int count = joinedGroup.size();
        String Message = switch (count){
            case 0 -> "Nhân viên này chưa có group";
            case 1 -> "Group của nhân viên này là Java, Fresher, C# Fresher";
            case 2 -> "Group của nhân viên này là Java, Fresher, C# Fresher";
            case 3 -> "Nhân viên này là người quan trọng, tham gia nhiều group";
            default -> "Nhân viên này là người hóng chuyện, tham gia tất cả các group";
        };
        System.out.println(Message);
    }

    public static void question7(Account[] accounts) {
        Account acc = accounts[0];
        String Position = acc.getPosition().getPositionName();
        String Message = switch(Position){
            case "Dev" -> "Đây là Developer";
            default -> "Người này không phải là Developer";
        };
        System.out.println(Message);
    }

    public static void question8(Account[] accounts) {
        for (Account acc : accounts) {
            System.out.println("ID: " + acc.getAccountID());
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Username: " + acc.getUsername());
            System.out.println("Full Name: " + acc.getFullName());
            System.out.println("Department: " + (acc.getDepartment().getDepartmentName()));
            System.out.println("Position: " + (acc.getPosition().getPositionName()));
            System.out.println("Create Date: " + acc.getCreateDate());
        }
    }

    public static void question9(Department[] departments) {
        for (Department department : departments) {
            System.out.println("ID: " + department.getDepartmentID());
            System.out.println("Name: " + department.getDepartmentName());
        }
    }

    public static void question10(Account[] accounts){
        int Number_of_Account = accounts.length;
        for(int i = 0; i < Number_of_Account; i++){
            System.out.println("Thông tin account thứ " + (i+1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getUsername());
            System.out.println("Phòng Ban: " + accounts[i].getDepartment().getDepartmentName());
        }
    }

    public static void question11(Department[] departments){
        int Number_of_Department = departments.length;
        for(int i = 0; i < Number_of_Department; i++){
            System.out.println("Thông tin department thứ " + (i+1) + " là: ");
            System.out.println("Id: " + departments[i].getDepartmentID());
            System.out.println("Name: " + departments[i].getDepartmentName());
        }
    }

    public static void question12(Department[] departments){
        for(int i = 0; i < 2; i++ ){
            System.out.println("Thông tin department thứ " + (i+1) + " là: ");
            System.out.println("Id: " + departments[i].getDepartmentID());
            System.out.println("Name: " + departments[i].getDepartmentName());
        }
    }

    public static void question13(Account[] accounts){
        int Number_of_Account = accounts.length;
        for(int i = 0; i < Number_of_Account; i++){
            if (i != 2){
                System.out.println("Thông tin account thứ " + (i+1) + " là:");
                System.out.println("Email: " + accounts[i].getEmail());
                System.out.println("Full Name: " + accounts[i].getUsername());
                System.out.println("Phòng Ban: " + accounts[i].getDepartment().getDepartmentName());
            }
        }
    }

    public static void question14(Account[] accounts){
        for(int i = 0; i < 3; i++ ){
            System.out.println("Thông tin account thứ " + (i+1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getUsername());
            System.out.println("Phòng Ban: " + accounts[i].getDepartment().getDepartmentName());
        }
    }

    public static void question15(){
        for(int i = 0 ; i < 20 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void question16(Account[] accounts, Department[] departments) {
        //Q10 redo
        int Number_of_Account = accounts.length;
        int i = 0;
        while (i < Number_of_Account) {
            System.out.println("Thông tin account thứ " + (i+1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full Name: " + accounts[i].getUsername());
            System.out.println("Phòng Ban: " + accounts[i].getDepartment().getDepartmentName());
            i++;
        }

        //Q11 redo
        System.out.println("---------------------------------");
        int Number_of_Department = departments.length;
        int j = 0;
        while (j < Number_of_Department) {
            System.out.println("Thông tin department thứ " + (j+1) + " là: ");
            System.out.println("Id: " + departments[j].getDepartmentID());
            System.out.println("Name: " + departments[j].getDepartmentName());
            j++;
        }

        //Q12 redo
        System.out.println("---------------------------------");
        int a = 0;
        while(a < 2){
            System.out.println("Thông tin department thứ " + (a+1) + " là: ");
            System.out.println("Id: " + departments[a].getDepartmentID());
            System.out.println("Name: " + departments[a].getDepartmentName());
            a++;
        }

        //Q13 redo
        System.out.println("---------------------------------");
        int b = 0;
        while(b < Number_of_Account){
            if(b == 1){
                b++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (b + 1) + " là:");
            System.out.println("Email: " + accounts[b].getEmail());
            System.out.println("Full Name: " + accounts[b].getUsername());
            System.out.println("Phòng Ban: " + accounts[b].getDepartment().getDepartmentName());
            b++;
        }

        //Q14 redo
        System.out.println("---------------------------------");
        int c = 0;
        while(c < 3){
            System.out.println("Thông tin account thứ " + (c+1) + " là:");
            System.out.println("Email: " + accounts[c].getEmail());
            System.out.println("Full Name: " + accounts[c].getUsername());
            System.out.println("Phòng Ban: " + accounts[c].getDepartment().getDepartmentName());
            c++;
        }
        //Q15 redo
        System.out.println("---------------------------------");
        int d = 0;
        while(d < 20){
            if(d % 2 != 0){
                d++;
                continue;
            }
            System.out.println(d);
            d++;
        }
    }

    public static void question17(){

    }
}
