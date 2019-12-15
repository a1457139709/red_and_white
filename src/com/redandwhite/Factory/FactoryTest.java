package com.redandwhite.Factory;
interface Cycle
{
    int getWheel();
    void move();
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
}
interface CycleFactory
{
    Cycle getCycle();
}
class UnicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Unicycle();
    }
}
class BicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Bicycle();
    }
}
class TricycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Tricycle();
    }
}

public class FactoryTest
{
    static void printCycle(CycleFactory cycleFactory)
    {
        Cycle c = cycleFactory.getCycle();
        System.out.println(c.getWheel());
        c.move();
    }
    public static void main(String[] args)
    {
        printCycle(new UnicycleFactory());
        printCycle(new BicycleFactory());
        printCycle(new TricycleFactory());
    }
}
