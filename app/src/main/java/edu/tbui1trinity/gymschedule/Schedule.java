package edu.tbui1trinity.gymschedule;
import java.util.*;

public class Schedule
{
    private String name;
    private String muscle;
    private Set<Exercise> dyn;
    private Set<Exercise> lift;
    private Set<Exercise> sta;

    public Schedule(String newName, String newMuscle)
    {
        name = newName;
        muscle = newMuscle;
    }

    public void addExer(Exercise ex)
    {
        //maybe check for muscle compatibility
        if (ex.getMuscle().toLowerCase().trim() == muscle.toLowerCase().trim() || muscle.toLowerCase().trim() == "compound")
        {
            if (ex.getWhen() == WhenToEx.DYNAMIC.toString())
                dyn.add(ex);
            if (ex.getWhen() == WhenToEx.LIFT.toString())
                lift.add(ex);
            else
                sta.add(ex);
        }
    }

    public Set<Exercise> getDyn()
    {
        return dyn;
    }

    public Set<Exercise> getLift()
    {
        return lift;
    }

    public Set<Exercise> getSta()
    {
        return sta;
    }



}
