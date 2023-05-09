import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande(){
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouterAppareil(Appareil l) {
        this.appareils.add(l);
    }

    public void activerAppareil(int indice){
        this.appareils.get(indice).allumer();
    }


    public void desactiverAppareil(int indice){
        this.appareils.get(indice).eteindre();
    }

    public void activerTout(){
        for(int i = 0; i < this.appareils.size(); i++){
            this.appareils.get(i).allumer();
        }
    }

    public String toString() {
        String r = "";
        for (int i = 0; i < this.appareils.size(); i++) {
            if (this.appareils.get(i).isAllume()){
                r = "On";
            } else {
                r = "Off";
            }
        }
        return r;
    }

    public int getNombre(){
        return this.appareils.size();
    }
}
