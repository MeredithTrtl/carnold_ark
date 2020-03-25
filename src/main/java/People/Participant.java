package People;

import Cars.Car;

import java.util.ArrayList;

public abstract class Participant {

    private String name;
    private ArrayList<Car> cars;
    private int totalMoney;

    public Participant(String name, int totalMoney){
        this.name = name;
        this.totalMoney = totalMoney;
        this.cars = new ArrayList<Car>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public void removeCar(Car car){
        this.cars.remove(car);
    }

    public int getNumberOfCars(){
        return this.getCars().size();
    }


    public void buyCar(Car car){
        this.addCar(car);
        this.removeMoney(car.getPrice());
    }

    public void sellCar(Car car){
        this.removeCar(car);
        this.addMoney(car.getPrice());
    }

    public void addMoney(int money){
        this.totalMoney += money;
    }

    public void removeMoney(int money){
        this.totalMoney -= money;
    }

    public int getTotalMoney() {
        return totalMoney;
    }
}
