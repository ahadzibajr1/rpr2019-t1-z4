package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SupermarketTest {
    @Test
    public void dodajArtikl () {
        Supermarket s = new Supermarket ();
        for (int i=0; i<1000; i++)
            s.dodajArtikl(new Artikl("lopta", 10, "p"+i));

        assertFalse (s.dodajArtikl (new Artikl("lopta", 10, "p" +2000)));

    }

    @Test
    public void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl ("lopta", 10, "p1");
        s.dodajArtikl(a);

        assertEquals (a, s.izbaciArtiklSaKodom(a.getKod()));
        assertNull (s.izbaciArtiklSaKodom("p2"));
    }
}
