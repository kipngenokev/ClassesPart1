public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car car = new Car();
        car.describeCar();
        System.out.println("make ="+car.getMake());
        System.out.println("model ="+car.getModel());
        car.setMake("Isuzu");
    }
}