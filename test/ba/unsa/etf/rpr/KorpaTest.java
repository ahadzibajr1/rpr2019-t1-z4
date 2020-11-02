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
}
