import java.util.Scanner;

public class EnterpriseAccount extends Account{
    private final String enterprise = "Enterprise";

    public EnterpriseAccount(User user) {
        super(user);
    }


    public void addInsurance() {
        System.out.println("Our Insurances");
        System.out.println("1- Health Insurance");
        System.out.println("2- Car Insurance");
        System.out.println("3- Travel Insurance");
        System.out.println("4- Residence Insurance");
        System.out.println("*****************************");
        System.out.println("Please select one ");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1: {
                if (checkInsurance(new HealthInsurance(enterprise))){
                    getUser().setInsurance(new HealthInsurance(enterprise));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Health insurance");
                }
                else {
                    System.out.println("You already have health insurance");
                }
                break;
            }
            case 2:{
                if (checkInsurance(new CarInsurance(enterprise))){
                    getUser().setInsurance(new CarInsurance(enterprise));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Car insurance");
                }
                else {
                    System.out.println("You already have Car insurance");
                }
                break;
            }
            case 3:{if (checkInsurance(new TravelInsurance(enterprise))){
                getUser().setInsurance(new TravelInsurance(enterprise));
                getUser().getInsuranceList().add(getUser().getInsurance());
                System.out.println("You have new Travel insurance");
            }
            else {
                System.out.println("You already have Travel insurance");
            }
                break;
            }
            case 4: {
                if (checkInsurance(new ResidenceInsurance(enterprise))){
                    getUser().setInsurance(new ResidenceInsurance(enterprise));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Residence insurance");
                }
                else {
                    System.out.println("You already have Residence insurance");
                }
                break;
            }
            default:
                System.out.println("Please try again");
                break;
        }


    }


    private boolean checkInsurance(Insurance insurance){
        for (Insurance i : getUser().getInsuranceList()){
            if (i.getName().equals(insurance.getName())){
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Account other) {
        return super.compareTo(other);
    }
}
