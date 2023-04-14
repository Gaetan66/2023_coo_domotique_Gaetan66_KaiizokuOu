import java.util.ArrayList;

public class Adaptateur implements Appareil{

    private ArrayList<Cheminee> cheminees;

    public Adaptateur(){
        this.cheminees = new ArrayList<Cheminee>();
    }

    public void ajouter(Cheminee c) {
        this.cheminees.add(c);
    }

    public void allumer() {
        for(int i = 0; i < this.cheminees.size(); i++){
            this.cheminees.get(i).changerIntensite(100);
        }
    }

    public void eteindre() {
        for(int i = 0; i < this.cheminees.size(); i++){
            this.cheminees.get(i).changerIntensite(0);
        }
    }

    public boolean isAllume() {
        boolean r = false;
        for(int i = 0; i < this.cheminees.size(); i++){
            if (this.cheminees.get(i).getLumiere() > 0){
                r = true;
            }
        }
        return r;
    }
}
