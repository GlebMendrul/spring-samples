package dao;

import domain.Order;

import java.util.List;

/**
 * Created by gleb on 19.08.15.
 */
public interface IOrdersDAO {
    List<Order> getOrders(int start, int end);
}
