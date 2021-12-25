package Java;

class Main{

    public static void main(String[] args) {
        System.out.println("hola mundo");
        UberX carX = new UberX("USL98D",new Account("alejandro", "1045024"),"sonic","spark");
        carX.setPassenger(4);
        carX.printDatacar();

        Ubervan  ubervan =new Ubervan("USL98d",new Account("alejo", "321"));
        ubervan.setPassenger(6);
        ubervan.printDatacar();
        

        //Car car2 = new Car("USL89D",new Account("Alejo", "pepe123"));
        //car2.passengenger=2;
        //car2.printDatacar();
    }
}