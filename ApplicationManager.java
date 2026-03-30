import java.util.Scanner;
public class ApplicationManager
{
    Scanner inputFile;
    String inputFileLocation;
    Set<String> activityData;
    ArrayList activityList;
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

    public void loadFile()
    {
        inputFileLocation  = inputMangager.askUserForFileLocation();
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
            System.out.println('file not found check for spelling and make sure file directory location!');
        }
    }
    public void saveDataFromFile()
    {
        while(Scanner.hasNextLine())
        {
            activityDataInString.add(inputFile.nextLine());
        }
    }
    public void loadDataIntoActivityList()

    {
        for(int i=0;i<activityData.size();i++)
        {
            activityList.add(activityIdentifier.generateActivityFromString());
        }
    }

   public void showAllActivitiesInfo()
    {
        iterator= new Iterator(activityList.iterator())
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
        queryProcessor = new QueryProcess(activityList);
    }

    public void askUserForQuery()
    {
        String textInput=inputMangager.inputForQuery();
        while(textInput!.equals('exit') || textInput!='EXIT')
        {
            queryProcessor.processQuery(textInput);
        }
    }












}