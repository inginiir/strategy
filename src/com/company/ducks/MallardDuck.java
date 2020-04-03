package com.company.ducks;

import com.company.flying.FlyWithWings;
import com.company.quacking.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
