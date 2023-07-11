import java.time.LocalDate;
import java.util.Date;

public class TravelInsurance extends Insurance{


    public TravelInsurance(String insuranceType) {
        super("Travel Insurance", 350.0, LocalDate.now(), LocalDate.now().plusDays(3));
        calculate(insuranceType);
    }

    @Override
    public void calculate(String insuranceType) {
        if (insuranceType.equals("Individual")){
            setFee(getFee() * 1.5);
        }
        if (insuranceType.equals("Enterprise")){
            setFee(getFee() * 0.75);
        }
    }

}
