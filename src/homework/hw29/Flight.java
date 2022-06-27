package homework.hw29;

public class Flight extends Aircraft{
    int id;
    String departureTime;
    Aircraft aircraft;
    String status;


    public Flight(int id, String model, boolean type) {
        super(id, model, type);
    }
}
