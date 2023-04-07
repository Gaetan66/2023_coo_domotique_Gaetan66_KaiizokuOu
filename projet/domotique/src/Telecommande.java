import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande(){
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }
    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre();
    }

    public void activerTout(){
        for(int i = 0; i < this.lampes.size(); i++){
            this.lampes.get(i).allumer();
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
            return (r);
        }
    }

    public Lampe getLampe(int index){
        return lampes.get(index);
    }
}
