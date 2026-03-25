import java.util.Scanner;
public class QueryProcessor
{
    Scanner scanner;
    String queryString;
    List<Query> queryList

    public void processQuery(String queryString)
    {
        scanner = new Scanner(queryString);
        String queryType = scanner.next();
        if(queryType.equals("ACTIVITY"))
        {
            String activityType = scanner.next();
            generateTypeQuery(activityType);
        }
        else if(queryType.equals("TOTAL_TIME")
        {
            generateTotalTimeQuery();
        }
        else if(queryType.equals("BETWEEN"))
        {

            LocalTime startTime=TotalTime.parse(scanner.next());
            LocalTime endTime  =TotalTime.parse(scanner.next());

            generateBetweenTimeQuery(startTime,endTime);


        }
        public void generateTypeQuery(String activityType)
        {
            this.queryList.add(new TypeQuery(activityType));
        }

        public void totalTimeQuery()
        {
            this.queryList.add(new totalTimeQuery());
        }

        public void betweenTimeQuery(LocalTime startTime,LocalTime endTime)
        {
            this.queryList.add(new betweenTimeQuery(startTime,endTime));
        }

    }



}
