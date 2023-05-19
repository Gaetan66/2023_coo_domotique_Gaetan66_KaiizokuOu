package donnees;

public class SelecteurTitrePiste implements Selecteur{

    private String nomTitre;

    public SelecteurTitrePiste(String nom){
        this.nomTitre = nom;
    }

    @Override
    public boolean garderCD(CD cd) {
        boolean b = false;
        for (InfoPiste piste : cd.getPistes()) {
            if (piste.getNomPiste().equals(nomTitre)) {
                b = true;
            }
        }
        return b;
    }
}


