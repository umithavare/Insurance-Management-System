import java.time.LocalDate;

public class CarInsurance extends Insurance{


    public CarInsurance(String insuranceType) {
        super("Car Insurance",1500.0, LocalDate.now() , LocalDate.now().plusMonths(6));
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        if (insuranceType.equals("Individual")){
            setFee(getFee());
        }
        if (insuranceType.equals("Enterprise")){
            setFee(getFee() * 0.8);
        }

    }
}
