import java.time.LocalTime;

public class airplane {
    private String flightNumber;
    private String destenation;
    private LocalTime scheduledDeparture;
    private int delayTime;
    public airplane(String flightNumber, String destenation, LocalTime scheduledDeparture){
        this.flightNumber = flightNumber;
        this.destenation = destenation;
        this.scheduledDeparture = scheduledDeparture;
        this.delayTime = 0;
    }
    public LocalTime getScheduledDeparture(){
        return scheduledDeparture;
    }
    public void setDelayTime(int minutes) {
        this.delayTime = minutes;
        this.scheduledDeparture = this.scheduledDeparture.plusMinutes(minutes);
    }
    public void checkStatus(){
        if(delayTime == 0){
            System.out.println("flight " + flightNumber + "is on time");
        }
        else
            System.out.println("flight " + flightNumber + " is deleyed by " + delayTime + " minutes");
    }
}
