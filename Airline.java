
import java.util.ArrayList;

public class Airline implements Trophy{
    private String airlineName;
    private ArrayList<PilotRecord> pilots;
    
    public Airline(String n)
    {
        this.airlineName = n;
        pilots = new ArrayList<>();
    }
    
    public void addPilot(PilotRecord pr)
    {
        pilots.add(pr);
    }
    
    public PilotRecord getPilot(int index)
    {
        return pilots.get(index);
    }

    @Override
    public Boolean isEnabled(PilotRecord pr) {
        int flights = pr.getTotalNumbersOfFlights();
        if(flights >= 1200)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void pilotWithTrophy()
    {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----List All Pilots with Trophy---------------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        for(int i = 0; i<pilots.size(); i++)
        {
            if(isEnabled(pilots.get(i)) == true)
            {
                System.out.println(pilots.get(i));
                System.out.println("Trophy: Platinum membership in class \"A\" hotels");
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }
    
    public void airlineInfo()
    {
        System.out.println("Airline Name: "+airlineName+" Airline");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----Pilots Participated in the Airline--------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        for(int i = 0; i<pilots.size(); i++)
        {
            System.out.println(pilots.get(i));
        }
    }
}
