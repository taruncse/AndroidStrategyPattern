package tkb.design.behaviour.encapsulate_behaviour;

import tkb.design.behaviour.behaviour.QuackableBehaviour;
import tkb.design.behaviour.utility.Print;

/**
 * Created by Tarun on 6/8/17.
 */

public class Squeak implements QuackableBehaviour{
    @Override
    public void quack() {
        Print.printall("Squeak");

    }
}
