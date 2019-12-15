package com.redandwhite.innerclasses.controller;
import com.redandwhite.innerclasses.controller.*;
public class GreenhouseController
{
    public static void main(String[] args)
    {
        GreenhouseControls gc = new GreenhouseControls();
        Event[] events = {
                gc.new WindOn(1000),
                gc.new WindOff(200),
                gc.new WindOn(300),
                new GreenhouseControls.Terminate(2)
        };
        gc.addEvent(gc.new Restart(events, 2000));
        gc.run();

    }
}

