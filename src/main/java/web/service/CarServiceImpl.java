package web.service;

import java.util.List;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

public class CarServiceImpl implements CarService{

    private final CarDao carDao = new CarDaoImpl();


    public List<Car> listCars() {
        return carDao.listCars();
    }
}
