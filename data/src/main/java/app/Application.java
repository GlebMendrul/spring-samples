package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import service.OrdersService;

/**
 * Created by gleb on 17.08.15.
 */
@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Application {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        OrdersService ordersService = context.getBean(OrdersService.class);
        System.out.println(ordersService.nextResult());
        System.out.println(ordersService.nextResult());
        System.out.println(ordersService.previousResult());
    }
}
