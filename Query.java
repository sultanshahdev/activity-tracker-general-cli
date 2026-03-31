import java.util.*;
public class Query
{
    List<ActivityInterface> activityList;
    Iterator<ActivityInterface> iterator;


    public Query(List<ActivityInterface> activityList)

    {
        this.activityList =activityList;
        this.iterator = this.activityList.iterator();
    }
    public void resetIterator() {
        iterator = null;
        this.iterator = this.activityList.iterator();
    }

}