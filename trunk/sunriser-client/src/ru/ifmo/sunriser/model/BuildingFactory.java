package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.util.Time;
import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public class BuildingFactory {

    public static Building createYard(final int state) {
        return new SimpleBuilding("Yard", state, new Resources(100, 100), new Time(0, 40),
                null, new Resources(0, 50));
    }
    
    public static Building createSolarBattery(final int state) {
        return new SimpleBuilding("Solar battery", state, new Resources(100, 100, 0, 1), new Time(0, 40), null,
                new Resources(100, 0));
    }

    public static Building createBaracks(final int state) {
       return new SimpleBuilding("Baracks", state, new Resources(100, 100, 0, 1), new Time(1, 0),
               new GetItemsable[]{new UnitProduser(UnitFactory.createSolder())}, null);
    }

    public static Building createRobotFactory(final int state) {
        return new SimpleBuilding("Robot factory", state, new Resources(100, 100, 0, 0), new Time(1, 40),
                new GetItemsable[]{new UnitProduser(UnitFactory.createRobot())}, null);
    }

    public static Building createShipFactory(final int state) {
        return new SimpleBuilding("Ship factory", state, new Resources(100, 500, 0, 0), new Time(1, 40),
                null, null);
    }

    public static Building createUniversity(final int state) {
        return new SimpleBuilding("university", state, new Resources(100, 100), new Time(5, 0), null, null);
    }

}
