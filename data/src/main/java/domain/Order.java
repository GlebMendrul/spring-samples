package domain;

import java.util.Date;

/**
 * Created by gleb on 17.08.15.
 */
public class Order {

    private Integer id;
    private String description;
    private Date dateIns;
    private Double price;
    private Integer customerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateIns() {
        return dateIns;
    }

    public void setDateIns(Date dateIns) {
        this.dateIns = dateIns;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dateIns=" + dateIns +
                ", price=" + price +
                ", customerId=" + customerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (description != null ? !description.equals(order.description) : order.description != null) return false;
        if (dateIns != null ? !dateIns.equals(order.dateIns) : order.dateIns != null) return false;
        if (price != null ? !price.equals(order.price) : order.price != null) return false;
        return !(customerId != null ? !customerId.equals(order.customerId) : order.customerId != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dateIns != null ? dateIns.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        return result;
    }
}
