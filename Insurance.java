import javax.xml.namespace.QName;
import java.util.Calendar;
import java.util.Date;

public abstract class Insurance {
    private String name;
    private Double fee;
    private Date startDate;
    private Date endDate;

    Calendar calendar = Calendar.getInstance();

    public Insurance(String name,  Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void calculate();

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
