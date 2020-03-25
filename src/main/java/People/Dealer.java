package People;

import Cars.Car;

public class Dealer extends Participant {

    public Dealer(String name, int totalMoney){
        super(name, totalMoney);
    }

    public int getNumberOfCars(){
        return this.getCars().size();
    }

    public void buyCar(Car car, Customer customer){
        this.addCar(car);
        this.removeMoney(car.getPrice());
        customer.sellCar(car);
    }

    public void sellCar(Car car, Customer customer){
        this.removeCar(car);
        this.addMoney(car.getPrice());
        customer.buyCar(car);
    }

}
