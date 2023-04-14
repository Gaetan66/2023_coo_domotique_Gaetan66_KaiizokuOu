import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		// creation de la telecommande
		Telecommande t = new Telecommande();
		// creation de 3 lampes
		Lampe l1 = new Lampe("Lampe1");
		Lampe l2 = new Lampe("Lampe2");
		Lampe l3 = new Lampe("Lampe3");
		// creation d'une chaine hifi
		Hifi h = new Hifi();
		// ajout des lampes et de la chaine a la telecommande
		t.ajouter(l1);
		t.ajouter(l2);
		t.ajouter(l3);
		t.ajouter(h);
		// affichage de l'etat des appareils
		System.out.println(t);
		// activation de la chaine
		t.activer(3);
		// affichage de l'etat des appareils
		System.out.println(t);
		// activation de la lampe 2
		t.activer(1);
		// affichage de l'etat des appareils
		System.out.println(t);
		// activation de toutes les lampes
		t.activerTout();
		// affichage de l'etat des appareils
		System.out.println(t);
		// desactivation de la chaine
		t.desactiver(3);
		// affichage de l'etat des appareils
		System.out.println(t);
		// desactivation de toutes les lampes
		t.desactiver(0);
		t.desactiver(1);
		t.desactiver(2);
		// affichage de l'etat des appareils
		System.out.println(t);
	}

}
