package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;
import ru.ifmo.sunriser.util.Time;

/**
 *
 * @author vbatygin
 */
public class Game {

    /**
     *
     * @return Vector<IBuilding>
     */
    public static Vector getBuildings() {
        final Resources cost = new Resources(100, 700);
        Vector v = new Vector();
        v.addElement(new SimpleBuilding("solar battery", BuildingState.BUILD, cost, new Time(0, 40)));
        v.addElement(new SimpleBuilding("baracks", BuildingState.UNDER_CONSTRUCTION, cost, new Time(1, 0)));
        v.addElement(new SimpleBuilding("robot factory", BuildingState.AVALIBLE, cost,new Time(1, 40)));
        v.addElement(new SimpleBuilding("university", BuildingState.AVALIBLE, cost, new Time(5, 0)));
        return v;
    }

}
