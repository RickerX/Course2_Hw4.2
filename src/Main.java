import Transport.Autosport.*;
import Transport.Car;
import Transport.Drivers.Driver;
import Transport.Mechanic;
import Transport.ServiceStation;
import Transport.Sponsor;


import java.util.*;

public class Main {

    private static void separation() {
        System.out.println("=========================");
    }
    private static void separationTwo() {
        System.out.println("++++++++++++++++++++++++");
    }

    private static final List<String> PRODUCT = List.of("Помидор","Банан","Апельсин","Яблоко","Киви","Молоко","Газировка",
            "Вода","Кофе","Соль","Ручка","Фонарик");
    private static final List<String> RECIPES = List.of("Плов", "Щи", "Жренная картошка", "Макароны с сыром", "Драники");
    public static void main(String[] args) {
        taskOne();
        separation();
        taskRecipes();
        separation();
        taskTwo();
        homeWorkTreeTaskOne();
        separation();
        homeWorkTreeTaskTwo();
        separation();
        homeWorkTreeTaskTree();
    }
    private static void printInfo(Car car) {
        System.out.println("Информация по автомобилю " + car.getBrand() + " " + car.getModel());
        System.out.println("Водители: " + car.getDrivers());
        System.out.println("Механники: " + car.getMechanics());
        System.out.println("Спонсоры: " + car.getSponsors());
        System.out.println("");
    }

    public static void service(Car... cars) {
        for (Car car : cars) {
            serviceCars(car);
        }

    }

    private static void serviceCars(Car car) {
        if (car.service()) {
            try {
                throw new RuntimeException("Автомобиль не прошел Т/О " + " " + car.getBrand() + " " + car.getModel());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void taskTwo() {
        Set<Integer> number = new HashSet<>();

        for (int i = 0; i < 19; i++) {
            number.add(new Random().nextInt(1000));
        }
        for (Iterator<Integer> iterator = number.iterator(); iterator.hasNext();) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(number.size());
        separationTwo();
        for (Iterator<Integer> iterator = number.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next() + " ");
        }
    }

    private static void taskOne() {
        Product pomidor = new Product("Помидор");
        Product banana = new Product("Банан");
        Product orange = new Product("Апельсин");
        Product apple = new Product("Яблоко");
        Product kiwi = new Product("Киви");
        Product milk = new Product("Молоко");
        Product soda = new Product("Газировка");
        Product water = new Product("Вода");
        Product cofe = new Product("Кофе");
        Product salt = new Product("Соль");
        Product pen = new Product("Ручка");
        Product flashlight = new Product("Фонарик");
        Set<Product> product = new HashSet<>();
        product.add(pomidor);
        product.add(banana);
        product.add(orange);
        product.add(apple);
        product.add(kiwi);
        product.add(milk);
        product.add(soda);
        product.add(water);
        product.add(cofe);
        product.add(salt);
        product.add(pen);
        product.add(flashlight);
        for (Product p:product) {
            System.out.println(p);
        }
    }

    private static void taskRecipes() {
        Recipes plov = new Recipes("Рис,мясо,овощи", 1000, "Плов");
        System.out.println(RECIPES);
        System.out.println(plov);
    }

    private static void homeWorkTreeTaskOne() {
        Mechanic<PassengerCars> gena = new Mechanic<>("Гена", "Иванов", "Вольво-моторс");
        Mechanic<PassengerCars> dima = new Mechanic<>("Дима", "Иванов", "Вольво-bus");
        Mechanic<PassengerCars> timur = new Mechanic<>("Тимур", "Иванов", "Вольво-truck");
        Sponsor bernard = new Sponsor("Бернард", 10_000);
        Sponsor gazprom = new Sponsor("Газпром", 10_000_000);
        Bus volvoBus = new Bus("Вольво", "А1", 5.5, Capacity.AVERAGE);
        volvoBus.addDriver(new Driver<>("Олег", "15", "права категории D"));
        volvoBus.addMechanic(dima);
        volvoBus.addSponsor(bernard,gazprom);
        Bus audiBus = new Bus("Ауди", "А2", 6,Capacity.BIG);
        Bus bmwBus = new Bus("БМВ", "А3", 7,Capacity.SMALL);
        Bus mersedesBus = new Bus("Мерседес", "А4", 5,Capacity.ESPECIALLY_SMALL);
        PassengerCars volvo = new PassengerCars("Вольво", "S 90", 2.5, TypeOfBody.SEDAN);
        volvo.addDriver(new Driver<>("Артем", "5", "права категории В"));
        volvo.addMechanic(gena);
        volvo.addSponsor(bernard);
        PassengerCars audi = new PassengerCars("Ауди", "RS 6", 4.0,TypeOfBody.COUPE);
        PassengerCars bmw = new PassengerCars("БМВ", "M5 CS", 4.4,TypeOfBody.CROSSOVER);
        PassengerCars mersedes = new PassengerCars("Мерседес", "С 63 AMG", 6.3,TypeOfBody.MINIVAN);
        Trucks volvoTruck = new Trucks("Вольво", "Б1", 10,LoadCapacity.N1);
        volvoTruck.addDriver(new Driver<>("Иван", "10", "права категории С"));
        volvoTruck.addMechanic(timur);
        volvoTruck.addSponsor(bernard,gazprom);
        Trucks audiTruck = new Trucks("Ауди", "Б2", 12,LoadCapacity.N1);
        Trucks bmwTruck = new Trucks("БМВ", "Б3", 11,LoadCapacity.N2);
        Trucks mersedesTruck = new Trucks("Мерседес", "Б4", 15,LoadCapacity.N3);
        separation();
        System.out.println(volvoBus);
        volvoBus.printType();
        System.out.println(audiBus);
        audiBus.printType();
        System.out.println(bmwBus);
        bmwBus.printType();
        System.out.println(mersedesBus);
        mersedesBus.printType();
        separation();
        System.out.println(volvoTruck);
        volvoTruck.printType();
        System.out.println(audiTruck);
        audiTruck.printType();
        System.out.println(bmwTruck);
        bmwTruck.printType();
        System.out.println(mersedesTruck);
        mersedesTruck.printType();
        separation();
        System.out.println(volvo);
        volvo.printType();
        System.out.println(audi);
        audi.printType();
        System.out.println(bmw);
        bmw.printType();
        System.out.println(mersedes);
        mersedes.printType();
        separation();
        System.out.println(mersedesBus + " лучший круг: " + mersedesBus.bestLapTime() +
                " максимальная скорость: " + mersedesBus.maxSpeed() + " " + mersedesBus.pitStop());
        System.out.println(mersedes + " лучший круг: " + mersedes.bestLapTime() +
                " максимальная скорость: " + mersedes.maxSpeed() + " " + mersedes.pitStop());
        System.out.println(mersedesTruck + " лучший круг: " + mersedesTruck.bestLapTime() +
                " максимальная скорость: " + mersedesTruck.maxSpeed() + " " + mersedesTruck.pitStop());
        separation();
        Driver<PassengerCars> artem = new Driver<>("Артем", "5", "права категории В");
        artem.driveCar(mersedes);
        Driver<Trucks> ivan = new Driver<>("Иван", "10", "права категории С");
        ivan.driveCar(volvoTruck);
        Driver<Bus> oleg = new Driver<>("Олег", "15", "права категории D");
        oleg.driveCar(mersedesBus);
        separation();
        service(volvo,audi,mersedes,bmw,volvoBus,audiBus,mersedesBus,bmwBus,volvoTruck,audiTruck,mersedesTruck,bmwTruck);
        separation();
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassengerCars(volvo);
        serviceStation.addTruck(volvoTruck);
        serviceStation.service();
        serviceStation.service();
        List<Car> cars = List.of(volvo,volvoTruck,volvoBus);
        for (Car car: cars) {
            printInfo(car);
        }
        separation();
        Set<Sponsor> sponsors = new HashSet<>();
        sponsors.add(bernard);
        sponsors.add(gazprom);
        for (Sponsor sponsor: sponsors) {
            System.out.println(sponsor);
        }
        separation();
        Set<Driver> drivers = new HashSet<>();
        drivers.add(artem);
        drivers.add(artem);
        drivers.add(oleg);
        drivers.add(oleg);
        drivers.add(oleg);
        drivers.add(ivan);
        drivers.add(ivan);
        drivers.add(ivan);
        drivers.add(ivan);
        for (Driver driver:drivers) {
            System.out.println(driver);
        }
        separation();
        Set<Car> carSet = new HashSet<>();
        carSet.add(volvo);
        carSet.add(volvo);
        carSet.add(audi);
        carSet.add(bmw);
        carSet.add(bmw);
        carSet.add(bmw);
        carSet.add(mersedes);
        carSet.add(mersedes);
        for (Car car: cars) {
            System.out.println(car);
        }
        separation();
        Set<Mechanic> mechanics = new HashSet<>();
        mechanics.add(dima);
        mechanics.add(dima);
        mechanics.add(dima);
        mechanics.add(timur);
        for (Mechanic mechanic: mechanics) {
            System.out.println(mechanic);
        }
    }

    private static void homeWorkTreeTaskTwo() {
        Set<String> task = new HashSet<>();
        task.add("2 * 2");
        task.add("2 * 3");
        task.add("2 * 4");
        task.add("2 * 5");
        task.add("2 * 6");
        task.add("2 * 7");
        task.add("2 * 8");
        task.add("2 * 9");
        task.add("3 * 3");
        task.add("3 * 4");
        task.add("3 * 5");
        task.add("3 * 6");
        task.add("3 * 7");
        task.add("3 * 8");
        task.add("3 * 9");
        task.add("4 * 4");
        task.add("4 * 5");
        task.add("4 * 6");
        task.add("4 * 7");
        task.add("4 * 8");
        task.add("4 * 9");
        task.add("5 * 5");
        task.add("5 * 6");
        task.add("5 * 7");
        task.add("5 * 8");
        task.add("5 * 9");
        task.add("6 * 6");
        task.add("6 * 7");
        task.add("6 * 8");
        task.add("6 * 9");
        task.add("7 * 7");
        task.add("7 * 8");
        task.add("7 * 9");
        task.add("8 * 8");
        task.add("8 * 9");
        task.add("9 * 9");
        for (String s:task) {
            System.out.println(s);
        }
    }
    // Не пойму как ограничить цикл

    private static void homeWorkTreeTaskTree() {
        Passport ivanovPetrIvanivich = new Passport("4646_123456", "Иванов", "Петр", "Иванович", "30.11.1988");
        Passport ivanovAlexIvanivich = new Passport("4747_123456", "Иванов", "Алекс", "Иванович", "30.11.1989");
        Passport ivanovOlegIvanivich = new Passport("4848_123456", "Иванов", "Олег", "Иванович", "30.11.1989");
        Set<Passport> passports = new HashSet<>();
        passports.add(ivanovPetrIvanivich);
        passports.add(ivanovAlexIvanivich);
        passports.add(ivanovOlegIvanivich);
        for (Passport passport:passports) {
            System.out.println(passport);
        }
    }
}