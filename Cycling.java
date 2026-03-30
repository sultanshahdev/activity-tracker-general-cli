import java.time.*;
public class Cycling extends LandActivity implements ActivityInterface
{
    public final String ACTIVITY_TYPE= "Cycling";
    public float averageSpeed;

    public Cycling(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
        setAverageSpeed();
    }
    public String toString()
    {
        return ACTIVITY_TYPE + " " + super.toString();
    }
    public void showActivityInfo()
    {
        System.out.println
        (
            "["+super.date.toString()+"] " + this.ACTIVITY_TYPE + ":" + super.name + " at" + super.location +"\n" +
            "     "+"duration: "+ super.duration.toHoursPart()+" hour(s) and "+ super.duration.toMinutesPart() + " minute(s);\n" +
            "     "+"distance: "+ super.distance+"km; \n"+
            "     "+"elev: "    + super.elevation+"m; \n"+
            "     "+"pace:"     + getSpeedString()+" min/km"
        );
    }
    public void setAverageSpeed()
    {
        
        this.averageSpeed=(super.distance)/(super.duration.toHours());
    }
    public String getSpeedString()
    {
        return String.valueOf(this.averageSpeed);
    }


}
