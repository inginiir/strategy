package com.company.ducks;

import com.company.flying.FlyNoWay;
import com.company.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
