package ru.ifmo.sunriser.model;

/**
 *
 * @author vbatygin
 */
public class RobotResources {

    private final Planet planet;
    private final int amount;

    public RobotResources(Planet planet, int amount) {
        this.planet = planet;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Planet getPlanet() {
        return planet;
    }

    
}
