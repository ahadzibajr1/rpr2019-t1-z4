package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class KorpaTest {
    @Test
    public void dodajArtikl () {
        Korpa k = new Korpa ();
        for (int i=0; i<50; i++)
            k.dodajArtikl(new Artikl("lopta", 10, "p"+i));

        assertFalse (k.dodajArtikl (new Artikl("lopta", 10, "p" +100)));

    }

    @Test
    public void izbaciArtiklSaKodom () {
        Korpa k = new Korpa ();
        Artikl a = new Artikl ("lopta", 10, "p1");
        k.dodajArtikl(a);

        assertEquals (a, k.izbaciArtiklSaKodom(a.getKod()));
        assertNull (k.izbaciArtiklSaKodom("p2"));

    }

    @Test
    public void dajUkupunuCijenuArtikala () {
        Korpa k = new Korpa();

        for (int i=0; i<10; i++)
            k.dodajArtikl(new Artikl("lopta", 10, "p"+i));
        assertEquals(100, k.dajUkupnuCijenuArtikala());
    }
}
