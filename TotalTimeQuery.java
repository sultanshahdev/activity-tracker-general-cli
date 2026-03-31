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
        System.out.println("\n>>> Querying total activity time:");
    }

    public void calculateTotalTime()

    {
        ActivityInterface currentActivity;
        resetIterator();
        while (iterator.hasNext()) {
            currentActivity=iterator.next();

                totalTime=totalTime.plus(currentActivity.getDuration());
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
                    "\n>>> " + totalTime.toHoursPart()+ " hours and " + totalTime.toMinutesPart()+" minutes."
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