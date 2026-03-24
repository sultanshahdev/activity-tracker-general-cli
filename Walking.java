import java.time.*;
public class Walking extends LandActivity
{
    public final String ACTIVITY_NAME ="WALKING";

    public Walking(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
    }
    public String toString()
    {
        return ACTIVITY_NAME + " " + super.toString();
    }

}