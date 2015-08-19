package dao;


import domain.Order;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by gleb on 17.08.15.
 */
public class OrdersDAO implements IOrdersDAO{

    private JdbcTemplate jdbcTemplate;

    public List<Order> getOrders(int start, int end) {
        return jdbcTemplate.query("SELECT * FROM orders LIMIT ?,?", preparedStatement -> {
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, end);
        }, (resultSet, i) -> {
            Order order = new Order();
            order.setId(resultSet.getInt("id"));
            order.setDescription(resultSet.getString("description"));
            order.setDateIns(resultSet.getDate("date_ins"));
            order.setPrice(resultSet.getDouble("price"));
            order.setCustomerId(resultSet.getInt("customer_id"));
            return order;
        });
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
