package edu.tbui1trinity.gymschedule;

public class SetEx implements TypeOfEx {
    private int sets;
    private int reps;

    public SetEx (int newSets, int newReps)
    {
        sets = newSets;
        reps = newReps;
    }

    public int getSets()
    {
        return sets;
    }

    public int getIntensity()
    {
        return reps;
    }

    public void setSets(int newSets)
    {
        sets = newSets;
    }

    public void setIntensity(int newReps)
    {
        reps = newReps;
    }
}
