package donnees;

public class SelecteurNbPistes implements Selecteur{

    public int nbpistes;

    public SelecteurNbPistes(int nb){
        this.nbpistes = nb;
    }
    @Override
    public boolean garderCD(CD cd){
        if(cd.getNbPistes() == nbpistes){
            return true;
        }else{
            return false;
        }
    }
}
