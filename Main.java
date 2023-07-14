public class Main {
    public static void main(String[] args) throws InvalidAuthenticationException {

                // Adreslerin oluşturulması
                IAdress homeAddress = new HomeAddress("İstiklal Cad. No: 123", "İstanbul", "34700");
                IAdress businessAddress = new BusinessAddress("Atatürk Bulv. No: 456", "Ankara", "06500");

                // Kullanıcıların oluşturulması
                User user1 = new User("Ahmet", "Yılmaz", "ahmet.yilmaz@example.com", "123456", "Mühendis", 30);
                User user2 = new User("Mehmet", "Yılmaz", "Mehmet.yilmaz@example.com", "123456", "Mühendis", 30);

                user1.addAdress(homeAddress);
                user1.addAdress(businessAddress);

                // AccountManager'ın oluşturulması ve hesap eklenmesi
                AccountManager accountManager = new AccountManager();
                IndividualAccount individualAccount = new IndividualAccount(user1);
                EnterpriseAccount enterpriseAccount = new EnterpriseAccount(user2);
                accountManager.addAccount(individualAccount);
                accountManager.addAccount(enterpriseAccount);

                Insurance healthInsurance = new HealthInsurance("Health insurance");
                Insurance residenceInsurance = new ResidenceInsurance("Residence İnsurance");

                // Sigorta poliçelerinin eklenmesi
                individualAccount.addInsurance(healthInsurance);
                individualAccount.addInsurance(residenceInsurance);
                // Kullanıcı bilgilerinin gösterilmesi
                accountManager.getAccounts();


    }
}

