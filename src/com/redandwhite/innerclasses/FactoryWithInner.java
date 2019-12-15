package com.redandwhite.innerclasses;

import java.util.function.BinaryOperator;

interface Cycle
{
    int getWheel();
    void move();
}

interface CycleFactory
{
    Cycle getCycle();
}

class Unicycle implements Cycle
{
    private static final int wheelNumber = 1;
    @Override
    public int getWheel()
    {
        return wheelNumber;
    }
    @Override
    public void move()
    {
        System.out.println("Unicycle move");
    }
    public static CycleFactory factory = new CycleFactory(){
        @Override public Cycle getCycle(){
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle
{
    private static final int wheelNumber = 2;
    @Override
    public int getWheel() {
        return wheelNumber;
    }

    @Override
    public void move() {
        System.out.println("Bicycle move");
    }
    public static CycleFactory factory = new CycleFactory(){
        @Override public Cycle getCycle()
        {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle
{
    private static final int wheelNumber = 3;
    @Override
    public int getWheel() {
        return wheelNumber;
    }

    @Override
    public void move() {
        System.out.println("Tricycle move");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class FactoryWithInner
{
    static void printCycle(CycleFactory cycleFactory)
    {
        Cycle c = cycleFactory.getCycle();
        System.out.println(c.getWheel());
        c.move();
    }
    public static void main(String[] args)
    {
        printCycle(Unicycle.factory);
        printCycle(Bicycle.factory);
        printCycle(Tricycle.factory);
    }
}
