package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl [] artikli = new Artikl [50];
    private int brojArtikala = 0;

    public boolean dodajArtikl (Artikl artikl) {
        if (brojArtikala+1 > 50)
            return false;
        artikli [brojArtikala] = artikl;
        brojArtikala++;
        return true;
    }
    public Artikl[] getArtikli () {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl artikl;
        for (int i=0; i<brojArtikala; i++)
            if (artikli[i]!= null && artikli[i].getKod().equals(kod) ) {
                artikl = artikli[i];
                artikli[i] = null;
                return artikl;
            }
    return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena=0;
        for (int i=0; i<brojArtikala; i++){
            if (artikli[i]!=null)
            ukupnaCijena = ukupnaCijena + artikli[i].getCijena();
        }

        return ukupnaCijena;
    }
}
