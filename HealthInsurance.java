import java.time.LocalDate;
import java.util.Date;

public class HealthInsurance extends Insurance{


    public HealthInsurance(String insuranceType ) {
        super("Health Insurance", 150.0, LocalDate.now(), LocalDate.now().plusYears(1));

        calculate(insuranceType);
    }


    @Override
    public void calculate(String insuranceType) {
        if (insuranceType.equals("Individual")){
            setFee(getFee() * 2);
        }
        if (insuranceType.equals("Enterprise")){
            setFee(getFee() * 0.5);
        }
    }

}
