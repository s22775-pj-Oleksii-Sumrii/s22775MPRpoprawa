package pj.pjwstk.s22775MPRpoprawa;

import java.util.List;

public class Sklep {
    private Klient klient;

    public Sklep(Klient klient) {
        this.klient = klient;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
}
