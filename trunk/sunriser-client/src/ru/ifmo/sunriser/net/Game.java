package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
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
        BuildingFactory.createSolarBattery(ItemState.ALREADY_BUILD),
            BuildingFactory.createRobotFactory(ItemState.UNDER_CONSTRUCTION),
            BuildingFactory.createBaracks(ItemState.AVALIBLE),
            BuildingFactory.createShipFactory(ItemState.AVALIBLE),
            BuildingFactory.createUniversity(ItemState.AVALIBLE),};
        return v;
    }

}
