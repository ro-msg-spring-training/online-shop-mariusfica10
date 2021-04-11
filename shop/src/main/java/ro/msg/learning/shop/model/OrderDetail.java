package ro.msg.learning.shop.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "order_detail")
@NoArgsConstructor
@AllArgsConstructor
@Table(name="order_detail")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("orderShip")
    @JoinColumn(name = "order_ship")
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("product")
    @JoinColumn(name = "product")
    private Location location;
    
    @Column(name="quantity")
    private Integer quantity;

}
