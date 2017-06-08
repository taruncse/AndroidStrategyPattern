package tkb.design.behaviour;

import tkb.design.behaviour.behaviour.FlyableBehaviour;
import tkb.design.behaviour.behaviour.QuackableBehaviour;

/**
 * Created by Tarun on 6/8/17.
 */

public abstract class Duck {

    private FlyableBehaviour flyableBehaviour;
    private QuackableBehaviour quackableBehaviour;
    public void swim(){
        System.out.print("All Ducks even Decoy can swim");

    }
    public void performFly(){
        flyableBehaviour.fly();
    }
    public void performQuack(){
        quackableBehaviour.quack();
    }

    public void setFlyableBehaviour(FlyableBehaviour flyableBehaviour){
        this.flyableBehaviour = flyableBehaviour;
    }
    public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour){
        this.quackableBehaviour = quackableBehaviour;
    }
    public abstract void display();
}
