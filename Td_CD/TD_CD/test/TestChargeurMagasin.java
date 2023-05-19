import XML.ChargeurMagasin;
import donnees.Magasin;
import donnees.comparateurAlbum;
import donnees.comparateurNbPiste;
import org.junit.Test;

import java.io.FileNotFoundException;
import static org.junit.Assert.assertEquals;

public class TestChargeurMagasin {

    @Test
    public void testChargeurMagasinGénérique() throws FileNotFoundException {
        ChargeurMagasin magasin = new ChargeurMagasin("TD_CD/musique/");
        Magasin m = magasin.chargerMagasin();
        comparateurAlbum comparateur = new comparateurAlbum();

        m.TrieArstiste(comparateur);

        assertEquals("Believe", m.getCd(0).getNomCD());
        assertEquals("Whitney Houston", m.getCd(11).getNomCD());
    }
    @Test
    public void testTrieNbPistes() throws FileNotFoundException {
        ChargeurMagasin magasin = new ChargeurMagasin("TD_CD/musique/");
        Magasin m = magasin.chargerMagasin();
        comparateurNbPiste comparateur = new comparateurNbPiste();

        m.TrieArstiste(comparateur);

        assertEquals("Whitney Houston", m.getCd(0).getNomCD());
        assertEquals("My Worlds", m.getCd(11).getNomCD());
    }

}
