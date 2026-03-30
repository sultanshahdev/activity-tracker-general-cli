import java.time.LocalDate;

public class Swimming extends OfflandActivity implements ActivityInterface
{
    public final String ACTIVITY_TYPE="Swimming";

   public Swimming(String name,String location,LocalDate date, Duration duration, int laps,int lapLength)
    {
        super(name,location,date,duration,laps,lapLength);
                

    }
    
}
