import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Lampe l1 = new Lampe("Lampe 2");


        tel.ajouterLampe(l1);

        assertEquals(l1,tel.getLampe(0));
    }

}
