package edu.tbui1trinity.gymschedule;

public class TimeEx implements TypeOfEx {
    private int duration;
    private int sets;
    public TimeEx(int newSets, int newDuration)
    {
        sets = newSets;
        duration = newDuration;
    }

    public int getIntensity()
    {
        return duration;
    }

    public int getSets()
    {
        return sets;
    }

    public void setSets(int newSets)
    {
        sets = newSets;
    }

    public void setIntensity(int newDuration)
    {
        duration = newDuration;
    }
}
