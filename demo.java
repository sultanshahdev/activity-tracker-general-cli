import java.util.*;
public class demo
{
    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<String>();


        hashSet.add("Hello");
        hashSet.add("helllo");
        hashSet.add("Hello");
        Iterator iterator= hashSet.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());

        }
    }

}