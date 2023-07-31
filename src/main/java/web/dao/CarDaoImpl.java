package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private List<Car> carList;
    @Override
    public List<Car> listCars() {
        carList = new ArrayList<>();

        carList.add(new Car(1, "Toyota", 10));
        carList.add(new Car(2, "Ferrari", 1));
        carList.add(new Car(3, "BMW", 7));
        carList.add(new Car(4, "Mercedes-Benz", 3));
        carList.add(new Car(5, "Audi", 6));

        return carList;
    }
}
