package com.company;

import com.company.ducks.Duck;
import com.company.ducks.MallardDuck;
import com.company.ducks.ModelDuck;
import com.company.flying.FlyRocketPowered;
import com.company.quacking.MuteQuack;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performedQuack();
        mallard.performFly();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performedQuack();

        System.out.println("____________________");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
