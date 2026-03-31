import java.time.*;

public class Swimming extends OfflandActivity implements ActivityInterface
{
    public final String ACTIVITY_TYPE="Swimming";
    public float pace;
    public int distance;

   public Swimming(String name,String location,LocalDate date, Duration duration, int laps,int lapLength)
    {
        super(name,location,date,duration,laps,lapLength);
        setDistance();
        setPace();

    }
    public void showActivityInfo()
    {
        System.out.println
        (
            "\n[" + super.date.toString() + "] "+ this.ACTIVITY_TYPE + ": " + super.name + " at " + super.location +"\n\n" +
            "     "+"duration:   "+ super.duration.toHoursPart()+" hour(s) and "+ super.duration.toMinutesPart() + " minute(s);\n" +
            "     "+"laps:       "+ super.laps+"km; \n"+
            "     "+"lap length: "+ super.lapsLength+"m; \n"+
            "     "+"pace:       " + getPaceString() + " min/km"
        );
    }
    public void setDistance()
    {
        this.distance=laps*lapsLength;
    }
     public void setPace()
    {
        this.pace=super.duration.toMinutes()/this.distance;
    }
    public String getPaceString()
    {
    return String.valueOf(pace);
    }
    public Duration getDuration()
    {
        return super.duration;
    }

     public String getActivityType()
    {
        return this.ACTIVITY_TYPE;
    }

    public LocalDate getDate()
    {
        return super.date;
    }
}
