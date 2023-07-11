import java.time.LocalDate;
import java.util.Date;

public class ResidenceInsurance extends Insurance{


    public ResidenceInsurance(String insuranceType) {
        super("Residence Insurance", 500.0, LocalDate.now(), LocalDate.now().plusDays(7));
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        if (insuranceType.equals("Individual")){
            setFee(getFee() * 3);
        }
        if (insuranceType.equals("Enterprise")){
            setFee(getFee() * 5);
        }
    }


}
