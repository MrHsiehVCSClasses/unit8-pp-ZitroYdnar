package u8pp;
public class Main 
{
    public static void main( String[] args ) {
        //System.out.println("Hi!\nIf you're seeing this message, you've successfully run the main method."
       // + "\nUse it to test your code during development.");
       
        Flight testFlight = new Flight(2,2);

        testFlight.reserveNextAvailableSeat("TestName1", true);
        testFlight.reserveNextAvailableSeat("TestName2", true);
        testFlight.reserveNextAvailableSeat("TestName3", false);

        System.out.println(testFlight.getFrequentFlyers());
    
    }
}
