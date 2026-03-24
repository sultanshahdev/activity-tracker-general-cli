public class Swimming extends OfflandActivity
{
    public final string ACTIVITY_TYPE= "SWIMMING";
    public void Swimming(String name,String location,LocalDate date, Duration duration, int laps,int lapsLength)
    {
        super(name,location,date,duration,laps,lapsLength);
    }

    public String toString()
    {
        return ACTIVITY_TYPE + "" + super.toString();
    }

}
