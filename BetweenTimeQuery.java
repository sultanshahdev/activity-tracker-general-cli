import java.time.Duration;
import java.util.*;
import java.time.LocalDate;

public class BetweenTimeQuery extends Query implements QueryInterface
{
    public LocalDate startDate;
    public LocalDate endDate;
    public Duration totalTime;

    public BetweenTimeQuery(List<ActivityInterface> activitylist,LocalDate startDate,LocalDate endDate)
    {
        super(activitylist);
        this.startDate=startDate;
        this.endDate=endDate;
        performQuery();
    }

    public void performQuery()
    {
        calculateTotalTime();
        outputQueryMessage();
        showActivities();
    }
    public void outputQueryMessage()
    {
        System.out.println("\n>>> Querying activities between " + startDate.toString() + " and " +endDate.toString() + ":" );
        System.out.println(">\n>> Total activity time :" + totalTime.toHoursPart()+ " hours and " + totalTime.toMinutesPart()+" minutes");

    }
    public void calculateTotalTime()
    {
        totalTime = Duration.ZERO;
        ActivityInterface currentActivity;
        super.resetIterator();
        {
            while(super.iterator.hasNext())
            {
                currentActivity=iterator.next();
                if(currentActivity.getDate().isAfter(this.startDate) && currentActivity.getDate().isBefore(this.endDate))
                {
                    totalTime=totalTime.plus(currentActivity.getDuration());
                }
            }
        }

    }
    public void showActivities()
    {
        ActivityInterface currentActivity=null;
        super.resetIterator();
        System.out.println("\n========== Activities ==========");
        while(super.iterator.hasNext())
        {
            currentActivity=iterator.next();
            if(currentActivity.getDate().isAfter(startDate) && currentActivity.getDate().isBefore(endDate))
            {
                currentActivity.showActivityInfo();
            }
        }
    }

}