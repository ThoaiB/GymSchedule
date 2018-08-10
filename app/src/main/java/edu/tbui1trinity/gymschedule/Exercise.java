package edu.tbui1trinity.gymschedule;

enum WhenToEx
{
    DYNAMIC, LIFT, STATIC, IDC;
}

public class Exercise {
    private WhenToEx when;
    private String name;
    private String muscle;
    private String link;
    private TypeOfEx type;

    public Exercise (WhenToEx newWhen, String newName, String newMuscle, String newLink, TypeOfEx newType)
    {
        when = newWhen;
        name = newName;
        muscle = newMuscle;
        link = newLink;
        type = newType;
    }

    //
    //
    //Get
    //Methods
    //
    //

    public String getName()
    {
        return name;
    }

    public String getMuscle()
    {
        return muscle;
    }

    public String getLink()
    {
        return link;
    }

    public String getWhen()
    {
        return when.toString();
    }

    public int getSets()
    {
        return type.getSets();
    }

    public int getIntensity()
    {
        return type.getIntensity();
    }


    //
    //
    //Set
    //Methods
    //
    //

    public void setName(String newName)
    {
        name = newName;
    }

    public void setMuscle(String newMuscle)
    {
        muscle = newMuscle;
    }

    public void setLink(String newLink)
    {
        link = newLink;
    }


    public void setSets(int newSets)
    {
        type.setSets(newSets);
    }

    public void setIntensity(int newIntensity)
    {
        type.setIntensity(newIntensity);
    }
}
