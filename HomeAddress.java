public class HomeAddress implements IAdress{
    private String street;
    private String city;
    private String postalCode;

    public HomeAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String getAdressType() {
        return "Home Adress";
    }
    @Override
    public String toString(){
        return "Home adress :  [ street: " + street + " city: " + city +
                " postal code: " + postalCode + " ]";
    }
}


