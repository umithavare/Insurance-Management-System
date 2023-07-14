import java.util.Scanner;
public class Management {
    private AccountManager accountManager;

    public Management() {
        this.accountManager = new AccountManager();
    }

    public void displayMenu(){
        System.out.println("*********************************************");
        System.out.println("Management Panel");
        System.out.println("1- Add user (Individual or Enterprise ");
        System.out.println("2- Login");
        System.out.println("3- Show list Accounts");
        System.out.println("0- Exit");
        System.out.println("*********************************************");
        System.out.println("Please enter your choice");

    }

    public void addUser(String userType, String name, String surname,
                        String email,String password, String profession, int age){
        User user = new User(name, surname, email, password, profession, age);
        if (userType.equalsIgnoreCase("I")){
            Account account = new IndividualAccount(user);
            accountManager.addAccount(account);
            System.out.println("User added succesfuly");
        }
        else if (userType.equalsIgnoreCase("E")){
            Account account = new EnterpriseAccount(user);
            accountManager.addAccount(account);
            System.out.println("Used added succesfuly");
        }
        else {
            System.out.println("Invalid user type, try again");
        }
    }

}
