import java.time.*;
public class OfflandActivity extends Activity
{
    int laps;
    int lapsLength;

    public OfflandActivity (String name,String location,LocalDate date, Duration duration, int laps,int lapsLength)
    {
        super(name,location,date,duration);
        this.laps=laps;
        this.lapsLength=lapsLength;

    }

    public String toString()
    {
        return super.toString() + " " + this.laps + " " + this.lapsLength;
    }

}