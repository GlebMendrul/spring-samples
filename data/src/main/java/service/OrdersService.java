package service;

import dao.IOrdersDAO;
import dao.OrdersDAO;
import domain.Order;

import java.util.List;

/**
 * Created by gleb on 19.08.15.
 */
public class OrdersService {

    private IOrdersDAO ordersDAO;
    private Integer start;
    private Integer resultPerPage;

    public void init() {
        this.start = 0;
    }

    public List<Order> getFirstResult() {
        return ordersDAO.getOrders(start, resultPerPage);
    }

    public List<Order> nextResult() {
        start += resultPerPage;
        return ordersDAO.getOrders(start, resultPerPage);
    }

    public List<Order> previousResult() {
        if (start != 0) {
            start -= resultPerPage;
        } else {
            return null;
        }
        return ordersDAO.getOrders(start, resultPerPage);
    }

    public void setOrdersDAO(OrdersDAO ordersDAO) {
        this.ordersDAO = ordersDAO;
    }

    public void setResultPerPage(Integer resultPerPage) {
        this.resultPerPage = resultPerPage;
    }

    public Integer getResultPerPage() {
        return resultPerPage;
    }

    public Integer getStart() {
        return start;
    }

}
