package Transport.Autosport;

import Transport.Car;

import java.util.Random;

public class Trucks extends Car {

    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("данных по авто не достаточно");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность: " + from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " отремонтирован!");
    }

    @Override
    public String pitStop() {
        return "Еду на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "3 минуты 56 секунд";
    }

    @Override
    public int maxSpeed() {
        return new Random().nextInt(200);
    }
}
