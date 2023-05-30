
public class PilotRecord extends Pilot{
    private int totalFlightHours;
    private int totalNumbersOfFlights;
    
    public PilotRecord()
    {
        super();
    }
    public PilotRecord(int hours, int flights, String name, int age) {
        super(name, age);
        this.totalFlightHours = hours;
        this.totalNumbersOfFlights = flights;
    }
    
    public int getTotalNumbersOfFlights()
    {
        return totalNumbersOfFlights;
    }
    
    public void setTotalumbersOfFlights(int flights)
    {
        totalNumbersOfFlights = flights;
    }

    @Override
    public int totalFlightHours() {
        if(totalFlightHours>0)
        {
            return totalFlightHours;    
        }
        else
        {
            return -1;
        }
        
    }
    
    public void setTotalFlightHours(int hours)
    {
        totalFlightHours = hours;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFlight Record{" + "total Flight Hours =" + totalFlightHours + ", total Numbers of Flights=" + totalNumbersOfFlights + '}';
    }

    
   
    
    
    
}
