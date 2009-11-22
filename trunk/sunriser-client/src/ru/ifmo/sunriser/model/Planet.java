package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class Planet implements GetItemsable {

    private GetItemsable[] buildings;

    public Planet(GetItemsable[] buildings) {
        this.buildings = buildings;
    }

    public GetItemsable[] getItems() {
        return buildings;
    }

    public void setBuildings(GetItemsable[] buildings) {
        this.buildings = buildings;
    }

    public int getState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getStatusAsString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Resources getCost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isCreatable() {
        return false;
    }

    public boolean isInfomable() {
        return true;
    }

    public void create() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void cansel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
