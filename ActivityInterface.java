import java.time.Duration;
import java.time.LocalDate;

public interface ActivityInterface
{
    public void showActivityInfo();

    public Duration getDuration();

    public Object getActivityType();

    public LocalDate getDate();
}