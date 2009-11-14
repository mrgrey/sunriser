package ru.ifmo.sunriser.model;

import java.util.Calendar;
import java.util.Date;
import ru.ifmo.sunriser.util.Time;

/**
 *
 * @author vbatygin
 */
public class SimpleBuilding implements IBuilding {
    private final String name;
    private int state;
    private final Resources cost;
    private final Time time;

    public SimpleBuilding(final String name, final int state, final Resources cost, Time time) {
        this.name = name;
        this.state = state;
        this.cost = cost;
        this.time = time;

    }

    public int getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public boolean build() {
        state = BuildingState.UNDER_CONSTRUCTION;
        return true;
    }

    public boolean cansel() {
        state = BuildingState.AVALIBLE;
       return true;
    }

    public Resources getCost() {
        return cost;
    }

    public String getTime() {
        return time.toString();
    }

    public String getStatusAsString() {
        switch (state) {
            case BuildingState.AVALIBLE:
                return ": avalible,\nm: " + cost.getMetal() + " e: " +
                cost.getEnergy() + "\ntime: " + time.toString();
            case BuildingState.UNDER_CONSTRUCTION:
                return ":under construction\ntime left: " + time.toString();
            case BuildingState.BUILD :
                return "already built";
            case BuildingState.CLOSED:
                return "not avaliabale";
        }
        throw new RuntimeException("cannot happend");
    }


}
