package pj.pjwstk.s22775MPRpoprawa;

import java.util.List;

public class SklepService {
    public KlientStorage klientStorage;
    public ProductStorage productStorage;

    public Klient odliczZSaldo(String name, double amount){
        List<Products> productsList = productStorage.getProductsList();
        if (!productsList.isEmpty()) {
            Products products = productsList.get(0);
            if (amount >= klientStorage.findByKlient(name).getBalance()){
                return klientStorage.odliczSaldo(name,amount);
            }
            System.out.println("Nie ma tyle na koncie");
        } else {
            System.out.println("Brak transakcji");
        }
        return null;
    }

}
