package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService = new CarServiceImpl();

    @GetMapping()
    public String carsPage(@RequestParam(value = "count", required = false, defaultValue = "5") int a, ModelMap model) {

        List<Car> cars = carService.listCars();
        if (a<=0) {
            cars.clear();
        }
        else if (a <= cars.size()) {
            cars.subList(a, cars.size()).clear();
        }
        model.addAttribute("carList", cars);
        return "cars";
    }
}

