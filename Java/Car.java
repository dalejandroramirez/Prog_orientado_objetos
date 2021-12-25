package Java;


class Car {
    private Integer id;
    private Account driver;
    private String license;
    private Integer passengenger;
    public Car(String license, Account driver){
        this.license=license;
        this.driver=driver;

    }
    void printDatacar() {
        if(passengenger!= null){ 
            System.out.println("Car license: " + license + " Driver:" + driver.name + " Pasajeros " +passengenger);

        }
            }

    public Integer getpassenger(){
        return passengenger;    
    }
    public void setPassenger(Integer passenger){
        if(passenger>=4){ 
            this.passengenger=passenger;

        }else{
            System.out.println("No hay suficienes pasajeros");
        }
        

    }

    
}
