package ru.ifmo.sunriser.view.forms;

import javax.microedition.lcdui.Form;
import ru.ifmo.sunriser.model.Player;
import ru.ifmo.sunriser.view.View;

/**
 *
 * @author vbatygin
 */
public class BuildingForm extends AbstractForm {

    public BuildingForm(String title, View midlet, PlanetForm prevForm, Player player) {
        super(title, midlet, prevForm, player);
       
    }

}
