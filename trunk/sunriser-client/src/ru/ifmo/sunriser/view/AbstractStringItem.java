package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;

/**
 *
 * @author vbatygin
 */
public class AbstractStringItem extends StringItem {
    private final GetItemsable item;

    public AbstractStringItem(String label, String text, int appearanceMode, GetItemsable item) {
        super(label, text, appearanceMode);
        this.item = item;
    }

    public AbstractStringItem(String label, String text, GetItemsable items) {
        super(label, text);
        this.item = items;
    }

    public GetItemsable getObject() {
        return item;
    }


}
