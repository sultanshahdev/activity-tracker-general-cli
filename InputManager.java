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
        System.out.println("Please enter the name of the file with your activities: activities.txt")
        return scanner.nextLine();
    }
    public String inputForQuery
    {
        return scanner.nextLine();
    }


}