import java.time.*;
public class LandActivity extends Activity
{
    int distance;
    int elevation;

    public LandActivity(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration);
        this.distance=distance;
        this.elevation=elevation;
    }

    public String toString()
    {
        return super.toString() + " " + this.distance + " " + this.elevation;
    }


}
