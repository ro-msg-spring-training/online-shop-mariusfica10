package ro.msg.learning.shop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailId implements Serializable {  
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "order_ship")
    private Integer orderShip;

    @Column(name = "product")
    private Integer product;
}