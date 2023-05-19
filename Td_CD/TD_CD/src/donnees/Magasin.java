package donnees;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * 
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 * 
 */
public class Magasin {

	/**
	 * la liste des CDs disponibles en magasin
	 */
	private ArrayList<CD> listeCds;

	/**
	 * construit un magasin par defaut qui ne contient pas de CD
	 */
	public Magasin() {
		listeCds = new ArrayList<CD>();
	}

	/**
	 * ajoute un cd au magasin
	 * 
	 * @param cdAAjouter
	 *            le cd a ajouter
	 */
	public void ajouteCd(CD cdAAjouter) {
		listeCds.add(cdAAjouter);
	}

	@Override
	/**
	 * affiche le contenu du magasin
	 */
	public String toString() {
		String chaineResultat = "";
		//parcours des Cds
		for (int i = 0; i < listeCds.size(); i++) {
			chaineResultat += listeCds.get(i);
		}
		chaineResultat += "nb Cds: " + listeCds.size();
		return (chaineResultat);

	}

	/**
	 * @return le nombre de Cds du magasin
	 */
	public int getNombreCds() {
		return listeCds.size();
	}
	
	/**
	 * permet d'acceder � un CD
	 * 
	 * @return le cd a l'indice i ou null si indice est non valide
	 */
	public CD getCd(int i)
	{
		CD res=null;
		if ((i>=0)&&(i<this.listeCds.size()))
			res=this.listeCds.get(i);
		return(res);
	}

	public void TrieArstiste(comparateurCD C){
		ArrayList<CD> listeTrier = new ArrayList<CD>();
		while(listeCds.size() > 0){
			int min = 0;
			for(int i = 1; i < listeCds.size() ; i++){
				if(!C.etreAvant(listeCds.get(min),listeCds.get(i))){
					min = i;
				}
			}
			listeTrier.add(listeCds.get(min));
			listeCds.remove(min);
		}
		listeCds = listeTrier;
	}

	public ArrayList<CD> chercherArtiste(String artiste){
		ArrayList<CD> albums = new ArrayList<CD>();
		for (int i = 0; i < listeCds.size(); i++) {
			if (artiste.equals(listeCds.get(i).getNomArtiste())) {
				albums.add(listeCds.get(i));
			}
		}
		return albums;
	}

	public ArrayList<CD> trouverArtiste(String artiste){
		SelecteurArtiste s = new SelecteurArtiste(artiste);
		ArrayList<CD> albums = new ArrayList<CD>();
		for (int i = 0; i < listeCds.size(); i++) {
			if(s.garderCD(listeCds.get(i))){
				albums.add(listeCds.get(i));
			}
		}
		return albums;
	}

	public ArrayList<CD> trouverNbPistes(int nb){
		SelecteurNbPistes s = new SelecteurNbPistes(nb);
		ArrayList<CD> albums = new ArrayList<CD>();
		for (int i = 0; i < listeCds.size(); i++) {
			if(s.garderCD(listeCds.get(i))){
				albums.add(listeCds.get(i));
			}
		}
		return albums;
	}

	public ArrayList<CD> trouverTitrePistes(String nom){
		SelecteurTitrePiste s = new SelecteurTitrePiste(nom);
		ArrayList<CD> albums = new ArrayList<CD>();
		for (int i = 0; i < listeCds.size(); i++) {
			if(s.garderCD(listeCds.get(i))){
				albums.add(listeCds.get(i));
			}
		}
		return albums;
	}

}
