package ru.ifmo.sunriser.view;

import ru.ifmo.sunriser.model.Resources;

/**
 *
 * @author vbatygin
 */
public interface GetItemsable {

    public GetItemsable [] getItems();

    public int getState();

    public String getStatusAsString();

    public String getName();

    public String getText();

    public Resources getCost();
}
