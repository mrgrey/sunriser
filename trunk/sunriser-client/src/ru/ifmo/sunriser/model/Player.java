package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.view.GetItemsable;
import ru.ifmo.sunriser.net.GameState;
import java.util.Vector;


/**
 *
 * @author vbatygin
 */

public class Player implements IPlayer {
    private final GameState idbo;
    private Resources resources;

    //<IPlanet>
   // private Vector planets;

    private Planet planet;

    public Player(GameState idbo) {
        this.idbo = idbo;
        update();
    }

    public void update() {
        this.resources = idbo.getResources();
        this.planet = idbo.getPlanet();
    }

    public boolean build(Building building) {
        final Resources cost = building.getCost();
        boolean built = false;
        if (resources.getEnergy() >= cost.getEnergy() && resources.getMetal() >= cost.getMetal()) {
            built = idbo.build(building);
            update();
        }
        return built;
    }

    public Planet getPlanet() {
        return planet;
    }

}
