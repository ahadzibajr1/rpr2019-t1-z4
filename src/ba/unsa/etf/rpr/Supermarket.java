package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl [] artikli = new Artikl [1000];
    private int brojArtikala = 0;

    public void dodajArtikl (Artikl artikl) {
        artikli[brojArtikala] = artikl;
        brojArtikala++;
    }

    public Artikl[] getArtikli () {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom (String kod) {
        Artikl artikl;
        for (int i=0; i<brojArtikala; i++)
            if (artikli[i]!= null && artikli[i].getKod().equals(kod)) {
                artikl = artikli[i];
                artikli[i] = null;
                return artikl;
            }
        return null;
    }


}
