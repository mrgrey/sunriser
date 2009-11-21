package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;
import ru.ifmo.sunriser.util.Time;
import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class Game {

    /**
     *
     * @return Vector<IBuilding>
     */
    public static GetItemsable [] getBuildings() {
        final Resources cost = new Resources(100, 700);
        GetItemsable []  v = new GetItemsable[] {
        new SimpleBuilding("solar battery", ItemState.BUILD, cost, new Time(0, 40), null),
        new SimpleBuilding("baracks", ItemState.UNDER_CONSTRUCTION, cost, new Time(1, 0), null),
        new SimpleBuilding("robot factory", ItemState.AVALIBLE, cost,new Time(1, 40),
                new GetItemsable[] {new StupidUnit()}),
        new SimpleBuilding("university", ItemState.AVALIBLE, cost, new Time(5, 0), null)};
        return v;
    }

}
