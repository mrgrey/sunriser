package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;
import javax.wireless.messaging.BinaryMessage;

/**
 *
 * @author vbatygin
 */
public class MyBDOperations implements IDBOperations {

    public MyBDOperations() {
    }

    private int metal = 1000;
    private int energy = 1000;

    public Resources getResources() {
        return new Resources(energy, metal);
    }

    public boolean build(IBuilding building) {
        metal -= building.getCost().getMetal();
        energy -= building.getCost().getEnergy();
        return true;
    }

    public IPlanet getPlanet() {
       return new Planet(Game.getBuildings());
    }

    public Vector getPlanets() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
