package ru.ifmo.sunriser.model;

import net.IDBOperations;
import java.util.Vector;


/**
 *
 * @author vbatygin
 */

public class Player implements IPlayer {
    private final IDBOperations idbo;
    private Resources resources;

    //<IPlanet>
   // private Vector planets;

    private IPlanet planet;

    public Player(IDBOperations idbo) {
        this.idbo = idbo;
        update();
    }

    public void update() {
        this.resources = idbo.getResources();
        this.planet = idbo.getPlanet();
    }

    public boolean build(IBuilding building) {
        final Resources cost = building.getCost();
        boolean built = false;
        if (resources.getEnergy() >= cost.getEnergy() && resources.getMetal() >= cost.getMetal()) {
            built = idbo.build(building);
            update();
        }
        return built;
    }

    public IPlanet getPlanet() {
        return planet;
    }

}
