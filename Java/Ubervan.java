package Java;

import java.util.Map;
import java.util.ArrayList;

class Ubervan extends Car{
    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatMaterial;
    private Integer passenger;
        public Ubervan(String license, Account driver) {
               super(license, driver);
               
        }
    public void setPassenger(Integer passenger) {
        if(passenger>=6){ 
            this.passenger=passenger;    
        }else{
            System.out.println("No hay suficienes pasajeros");
        }

    }
    ///   public UberBlack(String license, Account driver, 
 ///   Map<String, Map<String, Integer>> typeCarAccepted,
 ///   ArrayList<String> seatMaterial) {
 ///       super(license, driver);
 ///       this.typeCarAccepted = typeCarAccepted;
 ///       this.seatMaterial=seatMaterial;
 ///   }

}