import java.util.Scanner;
public class QueryProcessor
{
    Scanner scanner;
    ArrayList<ActivityInterface> activityList;


    public QueryProcessor(ArrayList<AcitivityInterface> arrayList)
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
        else if(queryType.equals("TOTAL_TIME")
        {
            generateTotalTimeQuery(activityList);
        }
        else if(queryType.equals("BETWEEN"))
        {

            LocalTime startTime=TotalTime.parse(scanner.next());
            LocalTime endTime  =TotalTime.parse(scanner.next());

            generateBetweenTimeQuery(activityList,startTime,endTime);
        }

    }

    public void generateTypeQuery(ArrayLis<ActivityInterface> activity,String activityType)
    {
        new TypeQuery(activityList,activityType));
    }

    public void generateTotalTimeQuery(ArrayLis<ActivityInterface> activityList)
    {
        new TotalTimeQuery(activityList);

    }

    public void betweenTimeQuery(ArrayLis<ActivityInterface> activityList, LocalTime startTime,LocalTime endTime)
    {
        new betweenTimeQuery(activityList,startTime,endTime);
    }



}
