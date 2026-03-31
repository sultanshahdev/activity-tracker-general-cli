import java.time.*;
import java.util.*;
public class TotalTimeQuery extends Query implements QueryInterface
{
    Duration totalTime;


    public TotalTimeQuery(List<ActivityInterface> activitylist)
    {
        super(activitylist);
        totalTime = Duration.ZERO;
        performQuery();

    }

    public void performQuery()

    {
        consoleOutMessageTotalTime();
        calculateTotalTime();
        showTotalTime();
        showQueryInfoOfAllActivities();
    }
    public void consoleOutMessageTotalTime()
    {
        System.out.println(">>> Querying total activity time");
    }

    public void calculateTotalTime()

    {
        resetIterator();
        while (iterator.hasNext()) {
            totalTime.plus(iterator.next().getDuration());
        }
    }

    public void showQueryInfoOfAllActivities()

    {
        resetIterator();
        while (iterator.hasNext()) {
            iterator.next().showActivityInfo();
        }
    }



    public void showTotalTime()
    {
        System.out.println
                (
                    ">>> " + totalTime.toHoursPart()+ " hours and " + totalTime.toMinutesPart()+" minutes"
                );
    }
    
    public void showActivities()
    {
        super.resetIterator();
        System.out.println("========== Activities ==========");
        while(super.iterator.hasNext())
        {
            
                super.iterator.next().showActivityInfo();
           
        }
    }


}