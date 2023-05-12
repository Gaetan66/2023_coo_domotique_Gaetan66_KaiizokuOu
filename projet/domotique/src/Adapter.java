import thermos.Thermostat;

import java.util.ArrayList;

public class Adapter implements Appareil{

    public ArrayList<Thermostat> thermostats;

    public Adapter(){
        this.thermostats = new ArrayList<Thermostat>();
    }

    public void ajouter(Thermostat t) {
        this.thermostats.add(t);
    }

    public void eteindre(){
        for (Thermostat thermostat : this.thermostats) {
            thermostat.baisserTemperature();
        }
    }
    public void allumer(){
        for (Thermostat thermostat : this.thermostats) {
            thermostat.monterTemperature();
        }
    }

    public boolean isAllume() {
        return true;
    }
}
