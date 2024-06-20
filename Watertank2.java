package org.example.Exercices;

public class Watertank2 {
    private int fillLevel;
    private int maxCapacity;
    private  int weightEmpty;
    private static int totalFillLevels =0;

    public Watertank2(int fillLevel, int maxCapacity, int weightEmpty) {
        //totalFillLevels +=fillLevel;
        //this.fillLevel = fillLevel;
        this.setFillLevel((fillLevel));
        this.maxCapacity = maxCapacity;
        this.weightEmpty = weightEmpty;
    }

    public void setFillLevel(int fillLevel) {
        totalFillLevels -= this.fillLevel;
        this.fillLevel = fillLevel;
        totalFillLevels += fillLevel;
    }



    public static int getTotalFillLevels() {
        return totalFillLevels;
    }

    public int getFillLevel() {
        return fillLevel;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getWeightEmpty() {
        return weightEmpty;
    }
    public  int fill(int amount) {
        if (amount <= 0)
            return 0;

        if (fillLevel + amount >maxCapacity) {
            int excessWater = fillLevel + amount - maxCapacity;
            setFillLevel(maxCapacity);
            return excessWater;

        }
        else {
            setFillLevel (fillLevel + amount);
            return 0 ;
        }
    }
}
