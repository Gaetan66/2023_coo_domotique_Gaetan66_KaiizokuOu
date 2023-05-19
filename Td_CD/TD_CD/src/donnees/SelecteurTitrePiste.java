package donnees;

public class SelecteurTitrePiste implements Selecteur{

    private String nomTitre;

    public SelecteurTitrePiste(String nom){
        this.nomTitre = nom;
    }

    @Override
    public boolean garderCD(CD cd) {

        if(.equals(nomTitre)){
            return true;
        }else{
            return false;
    }
}
