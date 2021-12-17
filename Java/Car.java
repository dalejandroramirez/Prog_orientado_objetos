package Java;

class Car {
    Integer id;
    Account driver;
    String license;
    Integer passengenger;
    public Car(String license, Account driver){
        this.license=license;
        this.driver=driver;
    }
    void printDatacar() {
        System.out.println("Car license: " + license + " Driver:" + driver.name);
    }
}
