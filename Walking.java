import java.time.*;
public class Walking extends LandActivity implements ActivityInterface
{
    public final String ACTIVITY_NAME ="Walking";
    public float pace;

    public Walking(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
        this.pace=setPace();
    }
    public String toString()
    {
        return ACTIVITY_NAME + " " + super.toString();
    }


    public void showActivityInfo
    {
        System.out.println()
        {
            '['+super.date.toString()+'] '+ this.ACTIVITY_NAME ": + super.name " at" + super.location +'\n' +
            '     '+'duration: '+ super.duration.toHoursPart()+" hour(s) and "+ super.duration.toMinutesPart() + " minute(s);\n" +
            '     '+'distance: '+ super.distance+'km; \n'+
            '     '+'elev: '+ super.elevation+'m; \n'+
            '     '+'pace:'+getPace()+' min/km';
        }
    }
    public float setPace()
    {
        this.pace=float(super.duration.toMinutes()/super.distance);
    }
    public String getPaceString{
        return this.pace.toString();
    }
}