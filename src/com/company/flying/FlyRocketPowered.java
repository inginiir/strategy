package com.company.flying;

import com.company.flying.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm rocket!");
    }
}
