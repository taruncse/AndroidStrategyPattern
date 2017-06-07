package tkb.design.behaviour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tkb.design.behaviour.client.MallardDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
