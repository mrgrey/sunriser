package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;

/**
 *
 * @author vbatygin
 */
public abstract class AbstractStringItem extends StringItem {
    private final View midlet;

    public AbstractStringItem(String label, String text, int appearanceMode, View midlet) {
        super(label, text, appearanceMode);
        this.midlet = midlet;
    }

    public AbstractStringItem(String label, String text, View midlet) {
        super(label, text);
        this.midlet = midlet;
    }

    public View getMidlet() {
        return midlet;
    }


}
