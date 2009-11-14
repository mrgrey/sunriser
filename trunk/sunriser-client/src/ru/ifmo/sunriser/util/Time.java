package ru.ifmo.sunriser.util;

/**
 *
 * @author vbatygin
 */
public class Time {

    private final int hours;
    private final int minuts;

    public Time(int hours, int minuts) {
        this.hours = hours;
        this.minuts = minuts;
    }

    public String toString() {
        return ((hours == 0) ? "" :   hours + "h ") +
                ((minuts == 0) ? "" : minuts + "m");
    }




}
