package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.util.Time;
import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class SimpleBuilding implements Building {
    private final String name;
    private int state;
    private final Resources cost;
    private final Time time;
    private final GetItemsable[] items;

    public SimpleBuilding(final String name, final int state, final Resources cost, Time time, GetItemsable[] items) {
        this.name = name;
        this.state = state;
        this.cost = cost;
        this.time = time;
        this.items = items;

    }

    public int getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public boolean build() {
        state = ItemState.UNDER_CONSTRUCTION;
        return true;
    }

    public boolean cansel() {
        state = ItemState.AVALIBLE;
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
            case ItemState.AVALIBLE:
                return ": avalible,\nm: " + cost.getMetal() + " e: " +
                cost.getEnergy() + "\ntime: " + time.toString();
            case ItemState.UNDER_CONSTRUCTION:
                return ":under construction\ntime left: " + time.toString();
            case ItemState.BUILD :
                return "already built";
            case ItemState.CLOSED:
                return "not avaliabale";
        }
        throw new RuntimeException("cannot happend");
    }

    public GetItemsable[] getItems() {
        return items;
    }

    public String getText() {
        return getStatusAsString();
    }


}
