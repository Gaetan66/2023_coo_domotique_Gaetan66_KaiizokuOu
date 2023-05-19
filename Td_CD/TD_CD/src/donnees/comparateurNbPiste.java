package donnees;

public class comparateurNbPiste implements comparateurCD{


    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        //Si le nom de l'artiste du cd1 est avant le nom de l'artiste du cd2
        if(cd1.getNbPistes() < cd2.getNbPistes()){
            return true;
        } else {
            return false;
        }
    }
}
