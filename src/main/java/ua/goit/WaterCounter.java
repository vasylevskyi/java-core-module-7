package ua.goit;

/**
 * Task 22
 **/

public class WaterCounter {
    public double count(String text) {
        String spaces = text.replaceAll("\\S+", "");
        double waterlity = (double) spaces.length() / text.length();
        return waterlity;

    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}


