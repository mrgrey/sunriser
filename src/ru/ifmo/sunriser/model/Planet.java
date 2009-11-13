package ru.ifmo.sunriser.model;

import java.util.Vector;

/**
 *
 * @author vbatygin
 */
public class Planet implements IPlanet {

    //<IBuilding>
    public final Vector buildings;

    public Planet(Vector buildings) {
        this.buildings = buildings;
    }

    public Vector getBuildings() {
        return buildings;
    }

}
