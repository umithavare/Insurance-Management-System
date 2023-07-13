import com.sun.net.httpserver.Authenticator;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public Account(User user) {
        this.authenticationStatus = authenticationStatus;
        this.user = user;
        this.insurances = new ArrayList<>();
    }

    public void login(String email, String password) throws InvalidAuthenticationException{
        if (user.getEmail().equals(email) &&
                user.getPassword().equals(password)){
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        }
        else {
            throw new InvalidAuthenticationException("Invalid Account");
        }
    }

    public final void showUserInfo(){
        System.out.println("*****************************************");
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Profession: " + user.getProfession());
        System.out.println("Age: " + user.getAge());
        System.out.println("Adresses;");
        for (IAdress adress : user.getAdresses()){
            System.out.println(adress);
        }

        System.out.println("Insurances;");
        for (Insurance insurance : insurances){
            System.out.println(insurance);
        }


    }

    public void showAdress(){
        System.out.println(this.user.getAdresses());
    }

    public void addAdress(IAdress adress){
        if (authenticationStatus == AuthenticationStatus.SUCCESS){
            user.addAdress(adress);
        }
    }

    public void removeAdress(IAdress adress){
        showAdress();
        if (authenticationStatus == AuthenticationStatus.SUCCESS){
            user.removeAdress(adress);
        }
    }

    public abstract void addInsurance(Insurance insurance);

    @Override
    public int compareTo(Account other) {
        // You can compare account by mail
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        return this.user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj){
           return true;
       }
       if (!(obj instanceof Account)){
           return false;
       }
       Account others =  (Account) obj;
       // you can check the equal accounts by the email
       return this.user.getEmail().equals(others.user.getEmail());
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }
}
