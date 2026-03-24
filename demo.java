import java.util.Scanner;
public class demo
{
    public static void main(String[] args)
    {
        String input = "WALKING store Selkirk 2022-07-01 PT20M 2 1";
        Scanner sc = new Scanner(input);

        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }
    }
}