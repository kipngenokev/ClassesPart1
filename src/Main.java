public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.describeCar();
        car.setMake("Porsche");
        car.setModel("Cayenne");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.isConvertible());

        Car mitsubishi = new Car();
        mitsubishi.setMake("Mitsubishi");
        mitsubishi.setModel("RVR");
        mitsubishi.setColor("Red");
        mitsubishi.setDoors(4);
        mitsubishi.setConvertible(false);
        mitsubishi.describeCar();
    }
}
