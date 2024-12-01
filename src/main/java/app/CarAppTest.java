package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CarService;

public class CarAppTest {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        CarService carService=context.getBean(CarService.class);
        carService.drive();
    }
}
