package com.example.GameNest.model;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "Orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "UserId", referencedColumnName = "userId")
    private User user;

    @Column(name = "OrderDate", nullable = false)
    private LocalDateTime orderDate = LocalDateTime.now();

    @Column(name = "TotalPrice", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalPrice;
}