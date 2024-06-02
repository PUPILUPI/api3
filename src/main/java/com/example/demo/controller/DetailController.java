package com.example.demo.controller;


import com.example.demo.entity.Detail;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/detail")
@RequiredArgsConstructor
public class DetailController {
    private static final ArrayList<Detail> details = new ArrayList<>();

    {
        // First detail
        Detail detail1 = new Detail();
        detail1.setName("radioComponent_api3_name1");
        detail1.setInStockFlag(true);
        detail1.setOrderDays(3 + " дня");
        detail1.setQuantity(500);
        detail1.setMinQuantity(10);
        detail1.setFirstPrice(0.1);
        detail1.setSecondQuantity(100);
        detail1.setSecondPrice(0.09);
        detail1.setThirdQuantity(1000);
        detail1.setThirdPrice(0.08);
        details.add(detail1);

        // Second detail
        Detail detail2 = new Detail();
        detail2.setName("radioComponent_api3_name2");
        detail2.setInStockFlag(true);
        detail2.setOrderDays(5 + " дней");
        detail2.setQuantity(300);
        detail2.setMinQuantity(5);
        detail2.setFirstPrice(0.2);
        detail2.setSecondQuantity(50);
        detail2.setSecondPrice(0.18);
        detail2.setThirdQuantity(500);
        detail2.setThirdPrice(0.15);
        details.add(detail2);

        // Third detail
        Detail detail3 = new Detail();
        detail3.setName("radioComponent_api3_name3");
        detail3.setInStockFlag(true);
        detail3.setOrderDays(7 + " дней");
        detail3.setQuantity(200);
        detail3.setMinQuantity(20);
        detail3.setFirstPrice(0.5);
        detail3.setSecondQuantity(30);
        detail3.setSecondPrice(0.45);
        detail3.setThirdQuantity(300);
        detail3.setThirdPrice(0.4);
        details.add(detail3);
    }

    @GetMapping
    public List<Detail> getAll() throws InterruptedException {
//        Thread.sleep(50);
        return details;
    }
}
