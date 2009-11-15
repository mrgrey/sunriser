package ru.ifmo.sunriser.model;

import java.util.Vector;
import javax.microedition.lcdui.Item;

/**
 *
 * @author vbatygin
 */
public interface  Building {

    public String getName();

    public int getState();

    public boolean build();

    public boolean cansel();

    public Resources getCost();

    public String getTime();

    public String getStatusAsString();

    public Item[] getItems();

}
