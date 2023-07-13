import java.util.ArrayList;
import java.util.Date;

public class User extends AdressManager{
    private String name;
    private String surname;
    private String email;
    private String password;
    private String profession;
    private int age;
    private ArrayList<IAdress> adresses;
    private ArrayList<Insurance> insuranceList;
    private Insurance insurance;
    private Date lastLoginDate;

    public User(String name, String surname, String email,
                String password, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.adresses = new ArrayList<>();

    }


    public void addAdress(IAdress adress){
        AdressManager.addAdress(this,adress);
    }

    public void removeAdress(IAdress adress){
        AdressManager.removeAdress(this,adress);
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }

    public ArrayList<IAdress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<IAdress> adresses) {
        this.adresses = adresses;
    }

    public String getName() {
        return name;
    }

    //Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }


}
