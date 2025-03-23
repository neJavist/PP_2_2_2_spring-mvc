package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    List<Car> getCarsCount(int count);
}
