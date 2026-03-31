import java.time.*;
public class GeneralActivity
{
    String name;
    String location;
    LocalDate date;
    Duration duration;
    int elevation;
    int distance;
    int laps;
    int lapsLength;

    public GeneralActivity() {
        this.name = "";
        this.location = "";
        this.date = null;
        this.duration = null;
        this.elevation = 0;
        this.distance = 0;
        this.laps = 0;
        this.lapsLength = 0;
    }

    public String getName(){return this.name;}
    public String getLocation(){return this.location;}
    public LocalDate getDate(){return this.date;}
    public Duration getDuration(){return this.duration;}
    public int getDistance(){return this.distance;}
    public int getElevation(){return this.elevation;}
    public int getLaps(){return this.laps;}
    public int getLapLength(){return this.lapsLength;}

    public void setName(String name){this.name=name;}
    public void setLocation(String location){this.location=location;}
    public void setDate(LocalDate date){this.date=date;}
    public void setDuration(Duration duration){this.duration=duration;}
    public void setElevation(int elevation){this.elevation=elevation;}
    public void setLaps(int laps){this.laps=laps;}
    public void setLapLength(int lapsLength){this.lapsLength=lapsLength;}
    public void setDistance(int distance){this.distance=distance;}


}