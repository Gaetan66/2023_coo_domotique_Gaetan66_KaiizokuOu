import thermos.Thermostat;

public class Main2 {

    public static void main(String args[])
    {
        Telecommande t=new Telecommande();
        Adapter a2 = new Adapter();
        Thermostat t1 = new Thermostat();

        a2.ajouter(t1);
        t.ajouterAppareil(a2);


        TelecommandeGraphique tg=new TelecommandeGraphique(t);


    }

}
