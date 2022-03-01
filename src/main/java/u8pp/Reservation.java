
package u8pp;

public class Reservation{
    // Instance Variables
    private String name;
    private boolean frequentFlyer;

    //Constructors

        
        public Reservation(String tempName, boolean frequentFlyerY){
            this.name = tempName;
            this.frequentFlyer = frequentFlyerY;
        }
    //Acessor
        public String getPassengerName(){
            return this.name;
        }

        public boolean isFrequentFlyer(){
            if(this.frequentFlyer == true){
               return true; 
            }
            else{
                return false;
            }
        }

}