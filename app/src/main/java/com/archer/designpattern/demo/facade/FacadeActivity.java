package com.archer.designpattern.demo.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.archer.designpattern.demo.R;

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);

        Computer computer = new Computer();
        Player player = new Player();
        Light light = new Light();
        Projector projector = new Projector();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(computer, player, light, projector, popper);
        System.out.println("---准备看电影---");
        homeTheaterFacade.watchMovie();
        System.out.println("---电影看完了---");
        homeTheaterFacade.stopMovie();
    }
}
