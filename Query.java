import java.util.*;
public class Query
{
    ArrayList<ActivityInterface> activityList;
    QueryProcessStatus queryProcessStatus;
    String queryOutput;
    Iterator iterator;


    public Query(ArrayList<ActivityInterface> activitylist)

    {
        this.activityList=activityList;
        this.iterator = this.activityList.iterator();
    }
    public void resetIterator() {
        iterator = null;
        this.iterator = this.activityList.iterator();
    }

}