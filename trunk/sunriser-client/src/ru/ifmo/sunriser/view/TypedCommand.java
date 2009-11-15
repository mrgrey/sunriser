package ru.ifmo.sunriser.view;

import javax.microedition.lcdui.Command;

/**
 *
 * @author vbatygin
 */
public class TypedCommand extends Command {
    private final int actionType;

    public TypedCommand(String shortLabel, String longLabel, int commandType, int priority, int actionType) {
        super(shortLabel, longLabel, commandType, priority);
        this.actionType = actionType;
    }

    public TypedCommand(String label, int commandType, int priority, int actionType) {
        super(label, commandType, priority);
        this.actionType = actionType;
    }

    public int getActionType() {
        return actionType;
    }

}
