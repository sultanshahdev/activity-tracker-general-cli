import java.util.Scanner;
import java.time.*;

public class ActivityIdentifier {
    Scanner scanner;
    String currentActivityType;
    GeneralActivity dummyActivity;


    public ActivityIdentifier() {
        this.scanner = null;
        dummyActivity = new GeneralActivity();
    }

    public ActivityInterface generateActivityFromString(String activityString)
    {
        setActivityType(activityString);
        return generateTypeOfActivity();
    }

    public void setActivityType(String activityString) {
        scanner = new Scanner(activityString);
        currentActivityType = scanner.next();
    }

    public ActivityInterface generateTypeOfActivity() {
        if (currentActivityType.equals("CYCLING")) {
            return generateCyclingActivity();
        } else if (currentActivityType.equals("RUNNING")) {
            return generateRunningActivity();
        } else if (currentActivityType.equals("WALKING")) {
            return generateWalkingActivity();
        } else if(currentActivityType.equals("SWIMMING")) {
            return generateSwimmingActivity();
        }
        return new Cycling(null, null, null, null, 0, 0);
       

    }

    public ActivityInterface generateCyclingActivity()
    {
        this.dummyActivity=new GeneralActivity();
        setDataForLandActivity();
        return retriveCyclingActivity();

    }
    public ActivityInterface generateWalkingActivity()
    {
        this.dummyActivity=new GeneralActivity();
        setDataForLandActivity();
        return retriveWalkingActivity();

    }
    public ActivityInterface generateRunningActivity()
    {
        this.dummyActivity=new GeneralActivity();
        setDataForLandActivity();
        return retriveRunningActivity();

    }
    public ActivityInterface generateSwimmingActivity()
    {
        this.dummyActivity= new GeneralActivity();
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

    public ActivityInterface retriveCyclingActivity()
    {
        return new Cycling
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }
    public ActivityInterface retriveWalkingActivity()
    {
        return new Walking
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }
    public ActivityInterface retriveRunningActivity()
    {
        return new Running
                (
                        dummyActivity.getName(),
                        dummyActivity.getLocation(),
                        dummyActivity.getDate(),
                        dummyActivity.getDuration(),
                        dummyActivity.getDistance(),
                        dummyActivity.getElevation()
                );
    }

    public ActivityInterface retriveSwimmingActivity()
    {
        return new Swimming
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