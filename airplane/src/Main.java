import java.time.LocalTime;

public class Main {
    public static void main(String args[]){
        airplane flight1 = new airplane("CD4923", "Dubai", LocalTime.of(10, 30));

        System.out.println("flight status: ");
        System.out.println("scheduled departure: "  + flight1.getScheduledDeparture());
        flight1.checkStatus();
        flight1.setDelayTime(50);
        flight1.checkStatus();
    }
}