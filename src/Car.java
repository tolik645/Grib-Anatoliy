public class Car {
    public void start() {
        System.out.println("Запуск автомобіля...");
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль готовий до руху!\n");
    }
    private void startElectricity() {
        System.out.println("Електроніка увімкнена.");
    }
    private void startCommand() {
        System.out.println("Системи керування запущені.");
    }
    private void startFuelSystem() {
        System.out.println("Паливна система активована.");
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}
