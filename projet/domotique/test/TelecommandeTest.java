import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelecommandeTest {

    @Test
    public void test_telecommande_ajout_vide(){
        Telecommande tel = new Telecommande();
        Lampe l1 = new Lampe("Lampe 1");

        tel.ajouterLampe(l1);

        assertEquals(l1,tel.getLampe(0));
    }

    @Test
    public void test_telecommande_ajout_1elem(){
        Telecommande tel = new Telecommande();
        Lampe l1 = new Lampe("Lampe 1");
        Lampe l2 = new Lampe("Lampe 2");

        tel.ajouterLampe(l1);
        tel.ajouterLampe(l2);

        assertEquals(l2,tel.getLampe(1));
    }

    @Test
    public void test_telecommande_activer_pos0(){
        Telecommande tel = new Telecommande();
        Lampe l1 = new Lampe("Lampe 1");

        tel.activerLampe(0);

        assertTrue(tel.getLampe(0).isAllume());
    }

    @Test
    public void test_telecommande_activer_pos1(){
        Telecommande tel = new Telecommande();
        Lampe l1 = new Lampe("Lampe 1");
        Lampe l2 = new Lampe("Lampe 2");

        tel.ajouterLampe(l1);
        tel.ajouterLampe(l2);
        tel.activerLampe(1);


        assertTrue(tel.getLampe(1).isAllume());
    }

    @Test
    public void test_telecommande_activer_pos0_inexistante(){
        Telecommande tel = new Telecommande();

        tel.activerLampe(0);

        assertTrue(tel.getLampe(0).isAllume());
    }

    @Test
    public void test_telecommande_activer_inexistante(){
        Telecommande tel = new Telecommande();
        Lampe l1 = new Lampe("Lampe 1");
        Lampe l2 = new Lampe("Lampe 2");

        tel.activerLampe(50);

        assertTrue(tel.getLampe(1).isAllume());
    }

}
