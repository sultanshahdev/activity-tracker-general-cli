import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class ApplicationManager
{
    Scanner inputFile;
    String inputFileLocation;
    Iterator<ActivityInterface> listIterator;
    Set<String> activityDataInString;
    List<ActivityInterface> activityList;
    InputManager inputMangager;
    QueryProcessor queryProcessor;
    ActivityIdentifier activityIdentifier;
    Iterator<String> iterator;

    public ApplicationManager()
    {
        initializeInstanceVariables();
        loadFile();
        saveDataFromFile();
        loadDataIntoActivityList();
        setUpQueryProcessor();
        askUserForQuery();
    }
    public void initializeInstanceVariables()
    {
        inputFile=null;
        queryProcessor=null;
        iterator=null;
        inputFileLocation="";
        activityDataInString=new HashSet<String>();
        activityList=new ArrayList<ActivityInterface>();
        inputMangager=new InputManager();
        activityIdentifier= new ActivityIdentifier();
    }
    public void showDataFromFile()
    {
        iterator=activityDataInString.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
    public void loadFile()
    {
        inputFileLocation  = inputMangager.askUserForInputFileLocation();
        try
        {
            loadFileData();
        }
        catch(Exception exception)
        {
            System.out.print(exception);
        }
    }
    public void loadFileData() throws Exception
    {
        try
        {
            inputFile = new Scanner(Files.newInputStream(Path.of(this.inputFileLocation)));
        }
        catch (Exception e)
        {
            System.out.println("\nfile not found check for spelling and make sure file directory location!");
        }
    }
    public void saveDataFromFile()
    {
        System.out.println("\nGoing to read [" + this.inputFileLocation + "].");
        while(inputFile.hasNextLine())
        {
            activityDataInString.add(inputFile.nextLine());
        }
    }
    public void loadDataIntoActivityList()

    {
        iterator=activityDataInString.iterator();
        ActivityInterface currentActivity=null;
        while(iterator.hasNext())
        {
            currentActivity=activityIdentifier.generateActivityFromString(iterator.next());
            System.out.println("\nAdding activity: ");
            currentActivity.showActivityInfo();
            activityList.add(currentActivity);
            System.out.println();
        }
    }

  
    

    public void setUpQueryProcessor()
    {
        queryProcessor = new QueryProcessor(this.activityList);
    }

    public void askUserForQuery()
    {
        
        String textInput="";
        while(true)
        {

            textInput=inputMangager.inputForQuery();
            if(!textInput.equals("EXIT"))
            {
                queryProcessor.processQuery(textInput);
            }
            else
            {
                break;
            }
        }   
}












}