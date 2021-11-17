package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopMainTest {
    @Test
    public void Test(){
        //Given
        CarShop carShop = new CarShop("Best Car", 10_000_000);
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        car1.decreasePrice(10);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);


        //When-Then
        boolean success=carShop.addCar(car1);
        assertEquals(true,success);
        success=carShop.addCar(car2);
        assertEquals(false,success);
        carShop.addCar(car3);
        carShop.addCar(car4);

        int sumPrice=carShop.sumCarPrice();
        assertEquals(6270000,sumPrice);
        int amount=carShop.numberOfCarsCheaperThan(2_000_000);
        assertEquals(1,amount);
        amount=carShop.carsWithBrand("Toyota").size();
        assertEquals(2,amount);

    }

}