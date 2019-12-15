package com.redandwhite.innerclasses;

import java.util.*;

interface Selector
{
    boolean end();
    Object current();
    void next();
}

class Human
{
    private String name;
    Human(String s)
    {
        name = s;
    }
    Human()
    {
        name = null;
    }
    private void Fuck()
    {
        System.out.println("Fuck ");
    }
    private class Inner
    {
        public void setNameAndFuck()
        {
            name = "Inner";
            Fuck();
        }
    }
    public void InvokeInnerToSet()
    {
        System.out.println(name);
        Inner i = new Inner();
        i.setNameAndFuck();
        System.out.println(name);
    }
    @Override
    public String toString()
    {
        return name;
    }
}
public class Sequence
{
    private List<Object> list;
    private int next = 0;
    public Sequence()
    {
        list = new ArrayList<Object>();
    }
    public void add(Object element)
    {
        list.add(element);
    }
    public void add(Object[] element)
    {
        for(Object o : element)
            add(o);
    }
    protected class SequenceSelector implements Selector
    {
        private int count = 0;
        @Override
        public boolean end()
        {
            return false;
        }
        @Override
        public Object current()
        {
            return list.get(count);
        }
        @Override
        public void next()
        {
            count++;
        }
    }
    public SequenceSelector selector()
    {
        return new SequenceSelector();

    }
//    public class ReverseSelector implements Selector
//    {
//        private int count = list.length - 1;
//        @Override
//        public boolean end() {
//            return count <= -1;
//        }
//
//        @Override
//        public Object current() {
//
//                return list[count];
//        }
//
//        @Override
//        public void next() {
//            if(count >= 0)
//                count--;
//        }
//    }
//    public Selector reverseSelector()
//    {
//        return new ReverseSelector();
//    }
    public int getCount()
    {
        return this.selector().count;
    }
    public static void main(String[] atgs)
    {
        Sequence sequence = new Sequence();
        Human[] humans = {new Human("zhangsan"),new Human(), new Human("lisi")};
        sequence.add(humans);
        Selector selector = sequence.selector();
        while(!selector.end())
        {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
