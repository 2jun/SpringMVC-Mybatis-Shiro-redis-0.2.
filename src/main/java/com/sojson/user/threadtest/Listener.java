package com.sojson.user.threadtest;

import java.util.Observable;
import java.util.Observer;

public class Listener implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("RunThread死机");

        RunThread run = new RunThread();

        run.addObserver(this);

        Thread thread = new Thread(run);
        thread.start();
        thread.interrupt();

        System.out.println("RunThread重启");
    }
}
