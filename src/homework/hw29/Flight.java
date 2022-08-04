package homework.hw29;

public class Flight{
    static int counter=0;
    int id;
    String departureTime;
    String arrivalTime;
    Aircraft aircraft;
    String status;
    Boing b;
    Tu154 t;

    public Flight(String departureTime,String arrivalTime, Aircraft aircraft, String status) {
        this.counter++;
        this.departureTime = departureTime;
        this.aircraft = aircraft;
        this.status = status;
        this.arrivalTime=arrivalTime;
        id=counter;
    }

    public int getId() {
        return id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureTime='" + departureTime + '\'' +
                ", aircraft=" + aircraft.toString() +
                ", status='" + status + '\'' +
                '}';
    }
}
