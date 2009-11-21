package ru.ifmo.sunriser.net;

import ru.ifmo.sunriser.model.*;
import java.util.Vector;
import ru.ifmo.sunriser.view.GetItemsable;

/**
 *
 * @author vbatygin
 */
public interface GameState {

    Resources getResources();

    //<IPlanet>
    Vector getPlanets();

    Planet getPlanet();

    Player getPlayer();

    public boolean build(GetItemsable object);

    public boolean cansel(GetItemsable object);

}
