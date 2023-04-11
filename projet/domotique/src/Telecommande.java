import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;

    public Telecommande(){

        this.lampes = new ArrayList<Lampe>();
        this.hifis = new ArrayList<Hifi>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }

    public void ajouterHifi(Hifi h) {
        this.hifis.add(h);
    }
    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }

    public void activerHifi(int indiceHifi){
        this.hifis.get(indiceHifi).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre();
    }

    public void desactiverHifi(int indiceHifi){
        this.hifis.get(indiceHifi).eteindre();
    }

    public void activerTout(){
        for(int i = 0; i < this.lampes.size(); i++){
            this.lampes.get(i).allumer();
        }
        for(int i = 0; i < this.hifis.size(); i++){
            this.hifis.get(i).allumer();
        }
    }



    public String toString() {
        String r = "";
        for (int i = 0; i < this.lampes.size(); i++) {
            if (this.lampes.get(i).isAllume()){
                r = "On";
            } else {
                r = "Off";
            }
        }
        return r;
    }

    public Lampe getLampe(int index){
        return lampes.get(index);
    }
}
