package donnees;

public class comparateurAlbum implements comparateurCD{


    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        //Si le nom de l'artiste du cd1 est avant le nom de l'artiste du cd2
        return cd1.getNomCD().compareTo(cd2.getNomCD()) < 0;
    }
}
