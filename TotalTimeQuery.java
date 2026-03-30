import java.time.*;
public class TotalTimeQuery extends Query implements QueryInterface
{
    Duration totalTime;


    public TotalTimeQuery(ArrayList<ActivityInterface> activitylist)
    {
        super(activitylist);
        totalTime = new Duration(Duration.ZERO);

    }

    public void proccessQuery

    {
        consoleOutMessageTotalTime();
        calculateTotalTime();
        showTotalTime();
        showQueryInfoOfAllActivities();
    }
    public void consoleOutMessageTotalTime()
    {
        System.out.println(">>> Querying total activity time:\n')
    }

    public void calculateTotalTime

    {
        resetIterator();
        while (iterator.hasNext()) {
            totalTime.plus(iterator.next.getDuration());
        }
    }

    public void showQueryInfoOfAllActivities

    {
        resetIterator();
        while (iterator.hasNext()) {
            iterator.showActivityInfo();
        }
    }



    public void showTotalTime()
    {
        System.out.println
                (
                    '>>> ' + totalTime.toHoursPart()+ ' hours and ' + totalTime.toMinutesPart()+' minutes\n'
                )
    }
    public void outputQueryMessage
    {
        System.out.println('>>> Querying activities of type '+ activityType"\n" )
    }
    public void showActivities()
    {
        super.resetIterator();
        System.out.println("========== Activities ==========")
        while(super.iterator.hasNext())
        {
            if(super.iterator.next.ACTIVITY_TYPE.equals(this.activityType))
            {
                super.iterator.showActivityInfo();
            }
        }
    }


}