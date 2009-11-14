package ru.ifmo.sunriser.model;

/**
 *
 * @author vbatygin
 */
public interface  IBuilding {

    public String getName();

    public int getState();

    public boolean build();

    public boolean cansel();

    public Resources getCost();

    public String getTime();

    public String getStatusAsString();

}
