package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.util.Time;

/**
 *
 * @author vbatygin
 */
public class UnitFactory {

    public static  Unit createRobot() {
        return new Unit("robot", 0, 0, 0, new Resources(5, 5, 1), new Time(0, 10));
    }

    public static Unit createSolder() {
        return new Unit("solder", 10, 10, 10, new Resources(15, 5, 1), new Time(0, 30));
    }

}
