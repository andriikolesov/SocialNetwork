package tranning.Task6.Car;

import tranning.Task6.Car.*;

import static tranning.Task6.Car.CarType.MAZDA;

public class Main {
    public static void main(String[] args) {

        Car car = select(MAZDA);
        car.drive();

    }

    private static Car select(CarType carType) {
        switch (carType) {
            case HONDA:
                return  new Honda();
            case MAZDA:
                return new Mazda();
            case TOYOTA:
                return new Toyota();
        }
        return null;

    }
}
