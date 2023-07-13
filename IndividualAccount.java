import java.util.Scanner;

public class IndividualAccount extends Account{
    private final String individual = "Individual";
    public IndividualAccount(User user) {
        super(user);
    }

    @Override
    public void addInsurance() {
        System.out.println("Our Insurances");
        System.out.println("1- Health Insurance");
        System.out.println("2- Car Insurance");
        System.out.println("3- Travel Insurance");
        System.out.println("4- Residence Insurance");
        System.out.println("*****************************");
        System.out.println("Please select one ");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1: {
                if (checkInsurance(new HealthInsurance(individual))) {
                    getUser().setInsurance(new HealthInsurance(individual));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Health insurance");
                } else {
                    System.out.println("You already have health insurance");
                }
                break;
            }
            case 2: {
                if (checkInsurance(new CarInsurance(individual))) {
                    getUser().setInsurance(new CarInsurance(individual));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Car insurance");
                } else {
                    System.out.println("You already have Car insurance");
                }
                break;
            }
            case 3: {
                if (checkInsurance(new TravelInsurance(individual))) {
                    getUser().setInsurance(new TravelInsurance(individual));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Travel insurance");
                } else {
                    System.out.println("You already have Travel insurance");
                }
                break;
            }
            case 4: {
                if (checkInsurance(new ResidenceInsurance(individual))) {
                    getUser().setInsurance(new ResidenceInsurance(individual));
                    getUser().getInsuranceList().add(getUser().getInsurance());
                    System.out.println("You have new Residence insurance");
                } else {
                    System.out.println("You already have Residence insurance");
                }
                break;
            }
            default:
                System.out.println("Please try again");
                break;
        }
    }

    @Override
    public int compareTo(Account other) {
        return this.getUser().getName().compareTo(other.getUser().getName());
    }

    public boolean checkInsurance(Insurance insurance){
        for (Insurance i : getUser().getInsuranceList()){
            if (i.getName().equals(insurance.getName())){
                return false;
            }
        }
        return true;
    }
}
