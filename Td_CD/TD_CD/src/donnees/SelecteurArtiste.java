package donnees;

public class SelecteurArtiste implements Selecteur{

    private String nomArtiste;

    public SelecteurArtiste(String nom){
        this.nomArtiste = nom;
    }

    public boolean garderCD(CD cd){
        if(cd.getNomArtiste().equals(nomArtiste)){
            return true;
        }else{
            return false;
        }
    }

}
