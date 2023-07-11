import java.util.ArrayList;

public class AdressManager {
    static void addAdress( User user, IAdress adress){
        ArrayList<IAdress> adresses = user.getAdresses();
        adresses.add(adress);
    }
    static void removeAdress( User user, IAdress adress){
        ArrayList<IAdress> adresses = user.getAdresses();
        adresses.remove(adress);
    }
}
