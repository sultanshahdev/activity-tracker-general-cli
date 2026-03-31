import java.util.Scanner;
public class InputManager
{
    Scanner scanner;

    public InputManager()
    {
        this.scanner=new Scanner(System.in);
    }


    public String askUserForInputFileLocation()
    {
        System.out.println("\nWelcome to the Activity Tracker.\n");
        System.out.print("Please enter the name of the file with your activities: ");
        return scanner.nextLine();
    }
    public String inputForQuery()
    {
        System.out.println("\n>>> QUERY [TOTAL-TIME] [BETWEEN (start date) (end date)] [ACTIVITY (activity type)]");
        System.out.print(">>> ");
        return scanner.nextLine();
    }


}