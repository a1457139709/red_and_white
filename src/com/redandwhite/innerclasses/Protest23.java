package com.redandwhite.innerclasses;
import java.util.*;
interface U
{
    void what();
    @Override
    String toString();
    void move();
}
class A
{
    private int value;
    A()
    {
        value = 0;
    }
    A(int value)
    {
        this.value = value;
    }
    public U getU()
    {
        return new U() {
            private Random r = new Random(45);
            @Override
            public void what() {
                System.out.println(getClass());
            }
            @Override
            public String toString()
            {
                return Integer.toString(r.nextInt());
            }
            @Override
            public void move() {
                System.out.println("Move it");
            }
        };
    }
}
class B
{
    private U[] arrayU;
    private int count = 0;
    public B()
    {
        arrayU = null;
    }
    public B(int size)
    {
        arrayU = new U[size];
    }
    public void add(U u)
    {
        if(count < arrayU.length)
            arrayU[count++] = u;
    }
    public void add(U[] us)
    {
        for(U u: us)
            add(u);
    }
    public void setNull(int pos)
    {
        arrayU[pos] = null;
    }
    public void viewArrayU()
    {
        for(U u : arrayU)
        {
            u.what();
            u.move();
            System.out.println(u);
        }
    }
}
public class Protest23 {
    public static void main(String[] args)
    {
        A[] arrayA = {new A(), new A(2), new A(4)};
        B b = new B(3);
        for(A a : arrayA)
            b.add(a.getU());

        b.viewArrayU();
        b.setNull(2);
    }
}
