import java.util.*;
class TypeQuery extends Query implements QueryInterface
{

    public String activityType;

    public TypeQuery(List<ActivityInterface> activitylist,String activityType)
    {
        super(activitylist);
        this.activityType=activityType;
        performQuery();
    }

    public void performQuery()
    {
        outputQueryMessage();
        showActivities();
    }
    public void outputQueryMessage()
    {
        System.out.println("\n>>> Querying activities of type "+ activityType );
    }
    public void showActivities()
    {
        
        System.out.println("\n========== Activities ==========");
        ActivityInterface currentActivity;
        while(super.iterator.hasNext())
        {
            currentActivity=iterator.next();
            if(currentActivity.getActivityType().equals(this.activityType))
            {
                currentActivity.showActivityInfo();
            }
        }
    }
}
