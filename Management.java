import java.util.Scanner;

public class Management {
    private AccountManager accountManager;

    public Management() {
        this.accountManager = new AccountManager();
    }

    public void displayMenu(){
        System.out.println("*********************************************");
        System.out.println("Management Panel");
        System.out.println("Add user (Individual or Enterprise ");
        System.out.println("Login");
        System.out.println("Show list Accounts");
        System.out.println("Exit");
        System.out.println("*********************************************");
        System.out.println("Please enter your choice");

    }

    public void addUser(String userType, String name, String surname,
                        String email,String password, String profession, int age){
        User user = new User(name, surname, email, password, profession, age);
        if (userType.equalsIgnoreCase("I")){
            Account account = new 
        }
    }

}
