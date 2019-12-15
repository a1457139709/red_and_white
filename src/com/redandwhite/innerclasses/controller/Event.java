package com.redandwhite.innerclasses.controller;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime)
    {
        this.delayTime = delayTime;
    }
    public void start()
    {
        this.eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready()
    {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
