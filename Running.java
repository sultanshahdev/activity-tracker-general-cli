import java.time.*;
public class Running extends LandActivity implements ActivityInterface
{
    public final String ACTIVITY_TYPE= "Running";
    public float pace;

    public Running(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
        setPace();
    }
    
    public void showActivityInfo()
    {
        System.out.println
        (
            "[" + super.date.toString() + "] "+ this.ACTIVITY_TYPE + ": " + super.name + " at" + super.location +"\n" +
            "     "+" duration: "+ super.duration.toHoursPart()+" hour(s) and "+ super.duration.toMinutesPart() + " minute(s);\n" +
            "     "+"distance: "+ super.distance+"km; \n"+
            "     "+"elev: "+ super.elevation+"m; \n"+
            "     "+"pace: " + getPaceString() + " min/km"
        );
    }
    public void setPace()
    {
        this.pace=super.duration.toMinutes()/super.distance;
    }
    public String getPaceString()
    {
    return String.valueOf(pace);
    }

}