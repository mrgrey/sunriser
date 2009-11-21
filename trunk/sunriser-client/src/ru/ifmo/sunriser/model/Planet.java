package ru.ifmo.sunriser.model;

import java.util.Vector;
import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class Planet implements GetItemsable {

    public final GetItemsable[] buildings;

    public Planet(GetItemsable[] buildings) {
        this.buildings = buildings;
    }

    public GetItemsable[] getItems() {
        return buildings;
    }

    public int getState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean build() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean cansel() {
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

}
