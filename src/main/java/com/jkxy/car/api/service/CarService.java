package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.Car;

import java.util.List;


public interface CarService {

    List<Car> findAll();

    Car findById(int id);

    Car findCarBookStatusById(int id);

    List<Car> findByCarName(String carName);
    List<Car> findByCarNameMohu(String carName);

    void deleteById(int id);
    void bookedByid(int id);

    void updateById(Car car);

    void insertCar(Car car);
}
