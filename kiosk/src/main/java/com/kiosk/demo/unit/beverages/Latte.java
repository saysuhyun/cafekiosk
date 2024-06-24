package com.kiosk.demo.unit.beverages;

import com.kiosk.demo.unit.beverages.Beverage;

public class Latte implements Beverage {
    @Override
    public int getPrice() {
        return 4500;
    }

    @Override
    public String getName() {
        return "Latte";
    }
}
