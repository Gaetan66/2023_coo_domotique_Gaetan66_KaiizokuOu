import XML.ChargeurMagasin;
import donnees.Magasin;
import org.junit.Test;

import java.io.FileNotFoundException;
import static org.junit.Assert.assertEquals;

public class TestChargeurMagasin {

    @Test
    public void testChargeurMagasin() throws FileNotFoundException {
        ChargeurMagasin magasin = new ChargeurMagasin("musique/");
        Magasin m = magasin.chargerMagasin();

        m.TrieSelection();

        assertEquals("Believe", m.getCd(0).getNomCD());
        assertEquals("Whitney Houston", m.getCd(11).getNomCD());
    }

}
