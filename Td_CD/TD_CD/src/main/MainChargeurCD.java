package main;

import java.io.IOException;
import java.util.ArrayList;

import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import donnees.comparateurAlbum;

/**
 * un main permettant de charger un CD
 */
public class MainChargeurCD {

	/**
	 * methode principale qui charge un cd
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             si fichier inexistant
	 */
	public static void main(String args[]) throws IOException {

		ChargeurMagasin magasin = new ChargeurMagasin("TD_CD/musique/");
		Magasin m = magasin.chargerMagasin();
		comparateurAlbum comparateur = new comparateurAlbum();
		ArrayList<CD> a = new ArrayList<CD>();
		a = m.trouverNbPistes(13);
		for(int i = 0; i < a.size(); i++){
			System.out.println(a.get(i));
		}
	}

}
