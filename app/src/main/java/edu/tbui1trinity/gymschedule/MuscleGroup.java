package edu.tbui1trinity.gymschedule;
import java.util.*;

public class MuscleGroup {
    private String name;
    private int min;
    private int max;
    private int rec;
    private Set<Exercise> exeres;

    public MuscleGroup (String newName)
    {
        name = newName;
        exeres = new HashSet<Exercise>();
        min = 0;
        max = 0;
        rec = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getMin()
    {
        return min;
    }

    public int getMax()
    {
        return max;
    }

    public int getRec()
    {
        return rec;
    }

    public void addEx(Exercise newEx)
    {
        //maybe some checking involve?
        //check if newEx
        exeres.add(newEx);
    }

    public void removeEx(Exercise ex)
    {
        exeres.remove(ex);
    }

    public Set<String> getExNames()
    {
        Set<String> ans = new HashSet<String>();
        for (Exercise e : exeres)
            ans.add(e.getName());
        return ans;
    }

    public Set<Exercise> getExes()
    {
        return exeres;
    }

    public Schedule getRandomSchedule()
    {
        return new Schedule(" ", name);
    }

}
