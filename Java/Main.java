package Java;

class Main{

    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("USL98D",new Account("alejandro", "1045024"));
        car.passengenger=4;
        car.printDatacar();

        Car car2 = new Car("USL89D",new Account("Alejo", "pepe123"));
        car2.passengenger=2;
        car2.printDatacar();
    }
}