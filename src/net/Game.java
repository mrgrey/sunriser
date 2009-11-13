package net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;

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
        v.addElement(new SimpleBuilding("solar battery", BuildingState.BUILD, cost));
        v.addElement(new SimpleBuilding("baracks", BuildingState.UNDER_CONSTRUCTION, cost));
        v.addElement(new SimpleBuilding("robot factory", BuildingState.AVALIBLE, cost));
        v.addElement(new SimpleBuilding("university", BuildingState.AVALIBLE, cost));
        return v;
    }

}
