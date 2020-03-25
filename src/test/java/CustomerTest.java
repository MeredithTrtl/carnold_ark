import Cars.NormalCar;
import Components.Engine;
import Components.Tyre;
import People.Customer;
import People.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    NormalCar car;
    Dealer dealer;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        customer = new Customer("Meredith", 1000);
        car = new NormalCar(engine, tyre, "Audi Normalcar", 100);
        dealer = new Dealer("Mr Carseller", 0);
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(1, customer.getNumberOfCars());
    }

    @Test
    public void canSellCar(){
        customer.buyCar(car);
        customer.sellCar(car);
        assertEquals(1000, customer.getTotalMoney());

    }
}
