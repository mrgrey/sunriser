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
    public static GetItemsable [] getBuildings(Planet planet) {
        final Resources cost = new Resources(100, 700);
        GetItemsable []  v = new GetItemsable[] {
        BuildingFactory.createSolarBattery(ItemState.BUILD, planet),
        new SimpleBuilding("baracks", ItemState.UNDER_CONSTRUCTION, cost, new Time(1, 0), null),
        new SimpleBuilding("robot factory", ItemState.AVALIBLE, cost,new Time(1, 40),
                new GetItemsable[] {new StupidUnit()}),
        new SimpleBuilding("university", ItemState.AVALIBLE, cost, new Time(5, 0), null)};
        return v;
    }

}
