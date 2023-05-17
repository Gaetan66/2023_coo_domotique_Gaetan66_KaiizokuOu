import XML.ChargeurMagasin;
import donnees.Magasin;
import donnees.comparateurAlbum;
import org.junit.Test;

import java.io.FileNotFoundException;
import static org.junit.Assert.assertEquals;

public class TestChargeurMagasin {

    @Test
    public void testChargeurMagasinGénérique() throws FileNotFoundException {
        ChargeurMagasin magasin = new ChargeurMagasin("musique/");
        Magasin m = magasin.chargerMagasin();
        comparateurAlbum comparateur = new comparateurAlbum();

        m.TrieArstiste(comparateur);

        assertEquals("Believe", m.getCd(0).getNomCD());
        assertEquals("Whitney Houston", m.getCd(11).getNomCD());
    }


}
