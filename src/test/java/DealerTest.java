import Cars.NormalCar;
import Components.Engine;
import Components.Tyre;
import People.Customer;
import People.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Customer customer;
    NormalCar car;
    Dealer dealer;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        customer = new Customer("Meredith", 1000);
        car = new NormalCar(engine, tyre, "Audi Normalcar", 100);
        dealer = new Dealer("Mr Carseller", 1000);
    }

    @Test
    public void canSellCarToCustomer(){
        dealer.addCar(car);
        dealer.sellCar(car, customer);
        assertEquals(1100, dealer.getTotalMoney());
        assertEquals(1, customer.getNumberOfCars());
    }

    @Test
    public void canBuyCarFromCustomer(){
        customer.addCar(car);
        dealer.buyCar(car, customer);
        assertEquals(900, dealer.getTotalMoney());
        assertEquals(1100, customer.getTotalMoney());
        assertEquals(1, dealer.getNumberOfCars());
        assertEquals(0, customer.getNumberOfCars());

    }
}
