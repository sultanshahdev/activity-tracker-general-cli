import java.util.Scanner;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class ApplicationManager
{
    Scanner inputFile;
    String inputFileLocation;
    Set<String> activityDataInString;
    List activityList;
    InputManager inputMangager;
    QueryProcessor queryProcessor;
    ActivityIdentifier activityIdentifier;
    Iterator iterator;

    public ApplicationManager()
    {

        setUpQueryProcessor();
        loadFile();
        saveDataFromFile();
        loadDataIntoActivityList();
        setUpQueryProcessor();
        showAllActivitiesInfo();
        promptForQuery();
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

    public void loadFile()
    {
        inputFileLocation  = inputMangager.askUserForInputFileLocation();
        loadFileData(inputFileLocation);
    }
    public void loadFileData(String inputFileLocation) throws Exception
    {
        try
        {
            inputFile = new Scanner(Files.newInputStream(Path.of(inputFileLocation)));
        }
        catch (Exception e)
        {
            System.out.println("file not found check for spelling and make sure file directory location!");
        }
    }
    public void saveDataFromFile()
    {
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
            activityList.add(currentActivity);
        }
    }

   public void showAllActivitiesInfo()
    {
        iterator= activityList.iterator();
        while(iterator.hasNext())
        {
            iterator.next().showActivityInfo();
        }
    }
    public void promptForQuery()
    {
        System.out.println(">>> QUERY : (read the manual for instructions)");
    }

    public void setUpQueryProcessor()
    {
        queryProcessor = new QueryProcessor(activityList);
    }

    public void askUserForQuery()
    {
        String textInput=inputMangager.inputForQuery();
        while(!(textInput.equals("exit")))
        {
            queryProcessor.processQuery(textInput);
        }
    }












}