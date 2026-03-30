public class Cycling extends LandActivity implements ActivityInterface
{
    public final string ACTIVITY_TYPE= "Cycling";
    public float averageSpeed;

    public void Cycling(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
        this.averageSpeed=setAverageSpeed();
    }
    public String toString()
    {
        return ACTIVITY_TYPE + " " + super.toString();
    }
    public void showActivityInfo
    {
        System.out.println()
        {
            '['+super.date.toString()+'] '+ this.ACTIVITY_NAME ": + super.name " at" + super.location +'\n' +
            '     '+'duration: '+ super.duration.toHoursPart()+" hour(s) and "+ super.duration.toMinutesPart() + " minute(s);\n" +
                    '     '+'distance: '+ super.distance+'km; \n'+
                    '     '+'elev: '+ super.elevation+'m; \n'+
                    '     '+'pace:'+getPace()+' min/km';
        }
    }
    public float setAverageSpeed()
    {
        this.averageSpeed=float(float(super.distance)/float(super.duration.toHours()));
    }
    public String getSpeedString{
    return this.pace.toString();
}


}
