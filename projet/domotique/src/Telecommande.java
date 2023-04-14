import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Appareil> appareils;

    public Telecommande(){
        this.appareils = new ArrayList<Appareil>();
    }

    public void ajouter(Appareil l) {
        this.appareils.add(l);
    }

    public void activer(int indice){
        this.appareils.get(indice).allumer();
    }


    public void desactiver(int indice){
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
}
