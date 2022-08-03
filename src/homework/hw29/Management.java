package homework.hw29;

import java.util.LinkedList;
import java.util.Scanner;

public class Management {
    static Scanner a = new Scanner(System.in);
    static LinkedList<Flight> flights = new LinkedList<>();

    public static Aircraft newAircraft() {
        System.out.println("Which company?: \n1. Boing \n2. TU154");
        int comp = a.nextInt();
        System.out.println("Which model?:");
        a.nextLine();
        String model = a.nextLine();
        System.out.println("Is civil? if yes write 'true'. Else - false:");
        boolean type = a.nextBoolean();
        if (comp==1){
            Boing boing = new Boing(model,type);
            return boing;
        } else{
            Tu154 tu154 = new Tu154(model,type);
            return tu154;
        }

    }

    public static void newFlight(LinkedList<Flight>flights){
        System.out.println("do you want to add new plane? \n1. yes\n2. no");
        int y=a.nextInt();

        System.out.println("set departure time");
        a.nextLine();
        String departureTime =a.nextLine();
        System.out.println("set arrival time");
        String arrivalTime = a.nextLine();
        System.out.println("status;");
        String status = a.nextLine();
        if(y==1){
            Aircraft aircraft = newAircraft();
            Flight flight = new Flight(departureTime,arrivalTime,aircraft,status);
            flights.add(flight);
        }else if (y==2){
            showAll(flights);
            System.out.println("choose id");
            int id= a.nextInt();
            for(Flight i:flights){
                if (i.aircraft.getId()==id){
                    Flight flight = new Flight(departureTime,arrivalTime,i.aircraft,status);
                    flights.add(flight);
                }
            }
        }else{
            newFlight(flights);
        }
        menu();
    }

    public static void search(LinkedList<Flight> flights){
        System.out.println("Is civil? if yes write 'true'. Else - false:");
        boolean type = a.nextBoolean();
        for (Flight i : flights){
            if(i.aircraft.isType()==type){
                System.out.println(i.toString());
            }
        }
        menu();
    }

    public static void showAll(LinkedList<Flight> flights){
        for (Flight i : flights){
            System.out.println(i.toString());
            System.out.println();
        }
        menu();
    }

    public static void menu() {
        System.out.println("1. Add new flight\n" +
                "2. Show all flights\n" +
                "3. Flight search by aircraft type\n" +
                "4. exit");

        int chose = a.nextInt();
        if (chose==1){
            newFlight(Management.flights);
        }else if(chose==2){
            showAll(Management.flights);
        } else if (chose==3) {
            search(Management.flights);
        } else if (chose==4) {
        }
        else {
            menu();
        }

    }
}
