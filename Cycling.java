public class Cycling extends LandActivity
{
    public final string ACTIVITY_TYPE= "CYCLING";

    public void Cycling(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
    }
    public String toString()
    {
        return ACTIVITY_TYPE + " " + super.toString();
    }


}
