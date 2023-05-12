import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		Hifi h1 = new Hifi();
		Adaptateur a1 = new Adaptateur();
		Cheminee c1 = new Cheminee();

		Adapter a2 = new Adapter();
		Thermostat t1 = new Thermostat();

		a2.ajouter(t1);

		a1.ajouter(c1);
		t.ajouterAppareil(l1);
		t.ajouterAppareil(h1);
		t.ajouterAppareil(a1);
		t.ajouterAppareil(a2);


		TelecommandeGraphique tg=new TelecommandeGraphique(t);

		
	}
	
}
