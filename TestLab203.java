
import java.util.Scanner;

public class TestLab203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Airline Name: ");
        String n;
        int age, hours, flights;
        n = input.next();
        Airline airline = new Airline(n);
        Boolean carryOn = true;
        do
        {
            System.out.println("Enter Pilot Name: ");
            n = input.next();
            System.out.println("Enter Pilot Age ");
            age = input.nextInt();
            System.out.println("Total Flight Hours: ");
            hours = input.nextInt();
            System.out.println("Total Numbers of Flights: ");
            flights = input.nextInt();
            PilotRecord pr = new PilotRecord(hours, flights, n, age);
            airline.addPilot(pr);
            System.out.println("Do you want to add another Pilot? (Yes/No) :");
            String answer = input.next();
            if(answer.equalsIgnoreCase("Yes"))
            {
                carryOn = true;
            }
            else 
            {
                carryOn = false;
            }
        }while(carryOn);
        airline.airlineInfo();
        airline.pilotWithTrophy();
    }
}
