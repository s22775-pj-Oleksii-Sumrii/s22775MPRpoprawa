package pj.pjwstk.s22775MPRpoprawa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KlientStorageTest {
    @Test
    void testGetKlient() {
        KlientStorage klientStorage = new KlientStorage();
        Klient klient = new Klient("Alex", 1000);
        klientStorage.addKlient(klient);

        assertEquals(klient, klientStorage.findByKlient("Alex"));
    }

    @Test
    void testOdliczSaldo(){
        KlientStorage klientStorage = new KlientStorage();
        Klient klient = new Klient("Alex", 1000);
        klientStorage.addKlient(klient);

        assertEquals(1000, klientStorage.findByKlient("Alex"));

        Klient klient1 = klientStorage.odliczSaldo("Alex", 50.0);
        assertEquals(950.0, klient1.getBalance());
    }
}