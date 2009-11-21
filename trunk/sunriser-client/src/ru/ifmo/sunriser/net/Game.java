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
        GetItemsable []  v = new GetItemsable[] {
        BuildingFactory.createSolarBattery(ItemState.BUILD),
            BuildingFactory.createRobotFactory(ItemState.BUILD),
            BuildingFactory.createBaracks(ItemState.BUILD),
            BuildingFactory.createShipFactory(ItemState.BUILD),
            BuildingFactory.createUniversity(ItemState.BUILD),};
        return v;
    }

}
