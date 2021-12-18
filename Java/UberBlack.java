package Java;

import java.util.Map;
import java.util.ArrayList;

class UberBlack extends Car{
    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatMaterial;
    
    public UberBlack(String license, Account driver, 
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial=seatMaterial;
    }
}