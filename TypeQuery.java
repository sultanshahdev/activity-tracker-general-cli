import java.util.*;
class TypeQuery extends Query implements QueryInterface
{

    public String activityType;

    public TypeQuery(ArrayList<ActivityInterface> activitylist,String activityType)
    {
        super(activitylist);
        this.activityType=activityType;
    }

    public void performQuery()
    {
        outputQueryMessage();
        showActivities();
    }
    public void outputQueryMessage()
    {
        System.out.println(">>> Querying activities of type "+ activityType );
    }
    public void showActivities()
    {
        super.resetIterator();
        System.out.println("========== Activities ==========");
        while(super.iterator.hasNext())
        {
            if(super.iterator.next.ACTIVITY_TYPE.equals(this.activityType))
            {
                super.iterator.showActivityInfo();
            }
        }
    }
}
