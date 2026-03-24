import java.util.Scanner;
import java.time.*;
public class demo
{
    public static String name;
    public static String location;
    public static LocalDate date;
    public static Duration duration;
    public static int distance;
    public static int elevation;
    public static String activity;

    public static void main(String[] args)
    {
        String input = "WALKING store Selkirk 2022-07-01 PT20M 2 1";
        Scanner sc = new Scanner(input);

        while(sc.hasNext())
        {
            activity=sc.next();
            name=sc.next();
            location=sc.next();
            date=LocalDate.parse(sc.next());
            duration=Duration.parse(sc.next());
            distance=Integer.parseInt(sc.next());
            elevation=Integer.parseInt(sc.next());
        }
        System.out.println(name+location+date+duration+distance+elevation);
        Walking activity1 = new Walking(name,location,date,duration,distance,elevation);
        System.out.println(activity1);
    }
}