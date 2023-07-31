package web.service;

import java.util.List;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao = new CarDaoImpl();


    public List<Car> listCars() {
        return carDao.listCars();
    }
}
