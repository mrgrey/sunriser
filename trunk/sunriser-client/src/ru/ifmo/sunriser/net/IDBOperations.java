package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;

/**
 *
 * @author vbatygin
 */
public interface IDBOperations {

    Resources getResources();

    boolean build(Building building);

    //<IPlanet>
    Vector getPlanets();

    IPlanet getPlanet();

    Player getPlayer();

}
