import java.util.*;
import java.time.*;
public class QueryProcessor
{
    Scanner scanner;
    ArrayList<ActivityInterface> activityList;


    public QueryProcessor(ArrayList<ActivityInterface> arrayList)
    {
        this.activityList=activityList;
        this.scanner = null;
    }

    public void processQuery(String queryString)
    {
        scanner = new Scanner(queryString);
        String queryType = scanner.next();
        if(queryType.equals("ACTIVITY"))
        {
            String activityType = scanner.next();
            generateTypeQuery(activityList,activityType);
        }
        else if(queryType.equals("TOTAL_TIME"))
        {
            generateTotalTimeQuery(activityList);
        }
        else if(queryType.equals("BETWEEN"))
        {

            LocalTime startTime=LocalTime.parse(scanner.next());
            LocalTime endTime  =LocalTime.parse(scanner.next());

            generateBetweenTimeQuery(activityList,startTime,endTime);
        }

    }

    public void generateTypeQuery(ArrayList<ActivityInterface> activity,String activityType)
    {
        new TypeQuery(activityList,activityType);
    }

    public void generateTotalTimeQuery(ArrayList<ActivityInterface> activityList)
    {
        new TotalTimeQuery(activityList);

    }

    public void generateBetweenTimeQuery(ArrayList<ActivityInterface> activityList, LocalTime startTime,LocalTime endTime)
    {
        new BetweenTimeQuery(activityList,startTime,endTime);
    }



}
