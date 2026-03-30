import java.util.Scanner;


public class ActivityIdentifier {
    Scanner scanner;
    ActivityInterface currentActivity;
    String currentActivityType;
    GeneralActivity dummyActivity;


    public ActivityIdentifier() {
        this.scaner = null;
        dummyActivity = new dummyActivity();
    }

    public void generateActivityFromString(String activityString)
    {
        setActivityType(activityString);
        generateTypOfeActivity();
    }
    public ActivityInterface
    public void setActivityType(String activityString) {
        scanner = new Scanner(activityString);
        currentActivityType = scanner.next();
    }

    public void generateTypeOfActivity() {
        if (currentActivityType.equals("CYCLING")) {
            generateCyclingActivity();
        } else if (currentActivityType.equals("RUNNING")) {
            genrateRunningActivity();
        } else if (currentActivityType.equals("WALKING")) {
            generatWalkingActivity();
        } else if (currentActivityType.equals("SWIMMING")) {
            generateSwimmingActivity();
        }
    }

    public ActivityInterface generateCyclingActivity
    {
        this.dummyActivity=new DummyActivity();
        setDataForLandActivity();
        return retriveCyclingActivity();

    }
    public ActivityInterface generateCyclingActivity
    {
        this.dummyActivity=new DummyActivity();
        setDataForLandActivity();
        return retriveCyclingActivity();

    }
    public ActivityInterface generateWalkingActivity
    {
        this.dummyActivity=new DummyActivity();
        setDataForLandActivity();
        return retriveWalkingActivity();

    }
    public ActivityInterface generateRunningActivity
    {
        this.dummyActivity=new DummyActivity();
        setDataForLandActivity();
        return retriveRunningActivity();

    }
    public ActivityInterface generateSwimmingActivity()
    {
        this.dummyActivity=new DummyActivity();
        setDataForOffLandActivity();
        return retriveSwimmingActivity();

    }
    public void setDataForOffLandActivity()
    {
        dummyActivity.setName(scanner.next());
        dummyActivity.setLocation(scanner.next());
        dummyActivity.setDate(LocalDate.parse(scanner.next()));
        dummyActivity.setDuration(Duration.parse(scanner.next()));
        dummyActivity.setLaps(Integer.parseInt(scanner.next()));
        dummyActivity.setLapLength(Integer.parseInt(scanner.next()));

    }

    public void setDataForLandActivity()
    {
        dummyActivity.setName(scanner.next());
        dummyActivity.setLocation(scanner.next());
        dummyActivity.setDate(LocalDate.parse(scanner.next()));
        dummyActivity.setDuration(Duration.parse(scanner.next()));
        dummyActivity.setDistance(Integer.parseInt(scanner.next()));
        dummyActivity.setElevation(Integer.parseInt(scanner.next()));
    }
    public ActivityInterface retriveCyclingActivity
    {
        return new CyclingActivity
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }
    public ActivityInterface retriveCyclingActivity
    {
        return new CyclingActivity
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }
    public ActivityInterface retriveWalkingActivity
    {
        return new WalkingActivity
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }
    public ActivityInterface retriveRunningActivity
    {
        return new RunningActivity
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }

    public ActivityInterface retriveSwimmingActivity
    {
        return new SwimmingActivity
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getLaps(),
                        dummyActivity.getLapLength()
                );
    }











}