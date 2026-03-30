import java.time.*;
public class BetweenTimeQuery extends Query implements QueryInterface
{
    public LocalDate startDate;
    public LocalDate endDate;
    public Duration totalTime;

    public BetweenTimeQuery(ArrayList<ActivityInterface> activitylist)
    {
        super(activitylist);
    }

    public void performQuery()
    {
        outputQueryMessage();
        showActivities();
    }
    public void outputQueryMessage
    {
        System.out.println('>>> Querying activities between '+ startDate.toString + ' and + 'endDate.toString()':' );
        System.out.print('>>> Total activity time :' + totalTime.toHoursPart()+ ' hours and ' + totalTime.toMinutesPart()+' minutes');

    }
    public void showActivities()
    {
        ActivityInterface currentActivity=null;
        super.resetIterator();
        ActivityInterface currentActivity;
        System.out.println("========== Activities ==========")
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