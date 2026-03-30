public class Running extends LandActivity implements ActivityInterface
{
    public final string ACTIVITY_TYPE= "Running";
    public float pace;

    public void Running(String name,String location,LocalDate date, Duration duration, int distance,int elevation)
    {
        super(name,location,date,duration,distance,elevation);
    }
    public void toString()
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
    public float setPace()
    {
        this.pace=float(super.duration.toMinutes()/super.distance);
    }
    public String getPaceString{
    return this.pace.toString();
}

}