import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public Account login(String email, String password) throws InvalidAuthenticationException{
        for (Account account : accounts){
            if(account.getAuthenticationStatus() == AuthenticationStatus.SUCCESS){
                throw new InvalidAuthenticationException("User already logged in");
            }

            if (account.getUser().getEmail().equals(email) &&
                    account.getUser().getPassword().equals(password)){
                account.login(email,password);
                return account;
            }
        }
        throw new InvalidAuthenticationException("Invalid email or password");
    }
}
