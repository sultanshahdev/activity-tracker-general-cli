import java.time.*;
public class Activity
{

    String name;
    String location;
    LocalDate date;
    Duration duration;

    public Activity(String name,String location,LocalDate date, Duration duration)
    {
        this.name= name;
        this.location=location;
        this.date = date;
        this.duration=duration;

    }

    public String toString()
    {
        return this.name+" " + this.location + " "+ this.date + " " + this.duration;
    }






}
