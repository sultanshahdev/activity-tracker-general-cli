public class TypeQuery extends Query implements QueryInterface
{

    public string activityType;

    public TypeQuery(ArrayList<ActivityInterface> activitylist)
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
