package tkb.design.behaviour.client;

import tkb.design.behaviour.Duck;
import tkb.design.behaviour.behaviour.FlyableBehaviour;
import tkb.design.behaviour.behaviour.QuackableBehaviour;
import tkb.design.behaviour.encapsulate_behaviour.FlyWithWings;
import tkb.design.behaviour.encapsulate_behaviour.Quack;
import tkb.design.behaviour.utility.Print;

/**
 * Created by Tarun on 6/8/17.
 */

public class RedheadDuck extends Duck {

    private QuackableBehaviour quackableBehaviour;
    private FlyableBehaviour flyableBehaviour;

    public RedheadDuck(){
        quackableBehaviour = new Quack();
        flyableBehaviour = new FlyWithWings();

        setFlyableBehaviour(flyableBehaviour);
        setQuackableBehaviour(quackableBehaviour);
    }

    @Override
    public void display() {
        Print.printall("I'm really a Redhead Duck");
    }
}
