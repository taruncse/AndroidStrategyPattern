package tkb.design.behaviour.encapsulate_behaviour;

import tkb.design.behaviour.behaviour.FlyableBehaviour;
import tkb.design.behaviour.utility.Print;

/**
 * Created by Tarun on 6/8/17.
 */

public class FlyWithWings implements FlyableBehaviour{
    @Override
    public void fly() {
        Print.printall("I'm flying");

    }
}
