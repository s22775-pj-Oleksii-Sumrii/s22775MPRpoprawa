package pj.pjwstk.s22775MPRpoprawa;

import java.util.ArrayList;
import java.util.List;

public class KlientStorage {
    private List<Klient> klientList = new ArrayList<>();

    public List<Klient> getKlientList() {
        return klientList;
    }

    public void addKlient(Klient klient) {
        klientList.add(klient);
    }

    public void removeKlient(Klient klient) {
        klientList.remove(klient);
    }

    public Klient findByKlient(String name) {
        for (Klient klient : klientList) {
            if (klient.getName().equals(name)) {
                return klient;
            }
        }
        return null;
    }

    public Klient odliczSaldo(String name, double amount) {
        Klient klient = findByKlient(name);
        klient.setBalance(klient.getBalance() - amount);
        return klient;
    }
}

