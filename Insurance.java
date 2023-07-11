import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Insurance {
    private String name;
    private Double fee;
    private LocalDate startDate;
    private LocalDate endDate;

    Calendar calendar = Calendar.getInstance();

    public Insurance(String name,Double fee, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.fee = fee;
        this.startDate = startDate;
        this.endDate = endDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public abstract void calculate(String insuranceType);
}
