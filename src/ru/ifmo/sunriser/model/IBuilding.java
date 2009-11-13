package ru.ifmo.sunriser.model;

/**
 *
 * @author vbatygin
 */
public interface  IBuilding {

    public String getName();

    public int getState();

    public boolean build();

    public void cansel();

    public Resources getCost();

}
