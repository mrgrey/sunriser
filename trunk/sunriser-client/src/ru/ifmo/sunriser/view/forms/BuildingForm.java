package ru.ifmo.sunriser.view.forms;

import javax.microedition.lcdui.Form;
import ru.ifmo.sunriser.model.Player;
import ru.ifmo.sunriser.view.View;

/**
 *
 * @author vbatygin
 */
public class BuildingForm extends Form {
    private final View midlet;
    private final PlanetForm prevForm;
    private final Player player;

    public BuildingForm(String title, View midlet, PlanetForm prevForm, Player player) {
        super(title);
        this.midlet = midlet;
        this.prevForm = prevForm;
        this.player = player;
    }

}
