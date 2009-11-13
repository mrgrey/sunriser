package net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;

/**
 *
 * @author vbatygin
 */
public interface IDBOperations {

    Resources getResources();

    boolean build(IBuilding building);

    //<IPlanet>
    Vector getPlanets();

    public IPlanet getPlanet();

}