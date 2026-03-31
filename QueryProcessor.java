import java.util.*;
import java.time.*;
public class QueryProcessor
{
    Scanner scanner;
    List<ActivityInterface> activityList;


    public QueryProcessor(List<ActivityInterface> activityList)
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
        else if(queryType.equals("TOTAL-TIME"))
        {
            generateTotalTimeQuery(activityList);
        }
        else if(queryType.equals("BETWEEN"))
        {

            LocalDate startDate=LocalDate.parse(scanner.next());
            LocalDate endDate =LocalDate.parse(scanner.next());

            generateBetweenTimeQuery(activityList,startDate,endDate);
        }

    }

    public void generateTypeQuery(List<ActivityInterface> activity,String activityType)
    {
        new TypeQuery(activityList,activityType);
    }

    public void generateTotalTimeQuery(List<ActivityInterface> activityList)
    {
        new TotalTimeQuery(activityList);

    }

    public void generateBetweenTimeQuery(List<ActivityInterface> activityList, LocalDate startDate,LocalDate endDate)
    {
        new BetweenTimeQuery(activityList,startDate,endDate);
    }



}
