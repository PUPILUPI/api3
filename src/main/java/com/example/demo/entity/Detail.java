package com.example.demo.entity;


import lombok.*;

@Data
public class Detail {
    private String name;
    private boolean inStockFlag;
    private String orderDays;
    private Integer quantity;
    private Integer minQuantity;
    private Double firstPrice;
    private Integer secondQuantity;
    private Double secondPrice;
    private Integer thirdQuantity;
    private Double thirdPrice;
}
