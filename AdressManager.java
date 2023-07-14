import java.util.ArrayList;

public class AdressManager {
    public static void addAdress( User user, IAdress adress){
        ArrayList<IAdress> adresses = user.getAdresses();
        adresses.add(adress);
    }
    public static void removeAdress( User user, IAdress adress){
        ArrayList<IAdress> adresses = user.getAdresses();
        adresses.remove(adress);
    }
}
