public class Running extends LandActivity
{
    public final string ACTIVITY_TYPE= "RUNNING";

    public void Running(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
    }
    public void toString()
    {
        return ACTIVITY_TYPE + " " + super.toString();
    }

}