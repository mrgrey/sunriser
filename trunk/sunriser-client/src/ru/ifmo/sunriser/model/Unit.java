package ru.ifmo.sunriser.model;

import ru.ifmo.sunriser.util.Time;

/**
 *
 * @author vbatygin
 */
public class Unit {
    
    private final String name;
    private final int helth;
    private final int armor;
    private final int attack;
    private final Resources cost;
    private final Time time;

    public Unit(String name, int helth, int armor, int attack, Resources cost, Time time) {
        this.name = name;
        this.helth = helth;
        this.armor = armor;
        this.attack = attack;
        this.cost = cost;
        this.time = time;
    }

    public int getArmor() {
        return armor;
    }

    public int getAttack() {
        return attack;
    }

    public Resources getCost() {
        return cost;
    }

    public int getHelth() {
        return helth;
    }

    public String getName() {
        return name;
    }

    public Time getTime() {
        return time;
    }

    

}
