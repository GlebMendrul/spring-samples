package controller;

import domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrdersService;

import java.util.List;

/**
 * Created by gleb on 19.08.15.
 */
@Controller
@ImportResource("classpath:beans.xml")
@RequestMapping("/data")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/orders")
    @ResponseBody
    public List<Order> getOrders() {
        return ordersService.getFirstResult();
    }

    @RequestMapping("/next")
    @ResponseBody
    public List<Order> getNextOrders() {
        return ordersService.nextResult();
    }

    @RequestMapping("/previous")
    @ResponseBody
    public List<Order> getPreviousOrders() {
        return ordersService.previousResult();
    }

    @RequestMapping("/resultPerPage")
    @ResponseBody
    public Integer getResultPerPage() {
        return ordersService.getResultPerPage();
    }

    @RequestMapping("/firstIndex")
    @ResponseBody
    public Integer getFirstIndex() {
        return ordersService.getStart();
    }
}
