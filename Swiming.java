public class Swimming extends OfflandActivity implements ActivityInterface
{
    public final string ACTIVITY_TYPE= "Swimming";
    public float pace;
    public void Swimming(String name,String location,LocalDate date, Duration duration, int laps,int lapsLength)
    {
        super(name,location,date,duration,laps,lapsLength);
    }

    public String toString()
    {
        return ACTIVITY_TYPE + "" + super.toString();
    }
    public void showActivityInfo
    {
        System.out.println()
        {
            '['+super.date.toString()+'] '+ this.ACTIVITY_NAME ": + super.name " at" + super.location +'\n' +
            '     '+'duration: '+ super.duration.toHoursPart()+" hour(s) and "+ super.duration.toMinutesPart() + " minute(s);\n" +
                    '     '+'laps: '+ super.laps+' \n'+
                    '     '+'lap length: '+ super.lapLength+' \n'+
                    '     '+'pace:'+getPace()+' min/km';
        }
    }
    public float setPace()
    {
        this.pace=float(float(super.duration.toMinutes())/float(super.distance));
    }
    public String getPaceString{
    return this.pace.toString();
}

}
