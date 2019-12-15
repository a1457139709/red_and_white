package com.redandwhite.holding;

import java.util.*;
import static com.redandwhite.util.Print.*;
class myClass extends Object
{
    private int value;
    myClass(){value = 0;}
    myClass(int value)
    {
        this.value = value;
    }
    @Override
    public String toString()
    {
        return Integer.toString(value);
    }
    @Override
    public boolean equals(Object o)
    {
        return this.value == ((myClass)o).value;
    }
}
public class ListFeatures
{
    public static void main(String[] args)
    {
//        Random rand = new Random(47);
//        List<Integer> inte = new ArrayList<Integer>();
//        for(int i = 0;i < 10;i++)
//            inte.add(rand.nextInt(50));
//
//        print("1: " + inte);
//        Integer i = new Integer(2);
//        inte.add(i);
//        print("2: " + inte);
//        print("3: " + inte.contains(i));
//        inte.remove(i);
//        i = inte.get(2);
//        print("4: " + inte.indexOf(i));
//        Integer in = new Integer(5);
//        print("5: " + inte.indexOf(in));
//        print("6: " + inte.remove(in));
//        print("7: " + inte);
//        inte.add(4,5);
//        print("8: " + inte);
//
//        List<Integer> sub = inte.subList(1,5);
//        print("9: sublist" + sub);
//        Collections.sort(sub);
//        print("10: sort" + sub);
//        Collections.shuffle(sub,rand);
//        print("11: shuffle" + sub);
//        print("12: " + inte);
//
//        List<Integer> copy = new ArrayList<Integer>(sub);
//        sub = Arrays.asList(copy.get(1),copy.get(3));
//        print("13: " + sub);
//        copy.retainAll(sub);
//        print("14: " + copy);
//        copy = new ArrayList<Integer>(inte);
//        copy.remove(2);
//        print("15: " + copy);
//        copy.add(11);
//        copy.removeAll(sub);
//        print("16: " + copy);
//        copy.set(1, 23);
//        print("17: " + copy);
//        copy.addAll(5,sub);
//        print("18: " + copy);
//        print("19: " + copy.isEmpty());
//        copy.clear();
//        print("20: " + copy.isEmpty());
//        Object[] o = sub.toArray();
//        print("21: " + o[1]);
//        Integer[] intes = inte.toArray(new Integer[0]);
//        print("22: " + intes.length);
        Random rand = new Random(2);
        List<myClass> myList = new ArrayList<myClass>();
        for(int i = 0;i < 10;i++)
            myList.add(new myClass(rand.nextInt(50)));
        print(myList);
        List<myClass> newList = myList.subList(1,5);
        newList.add(new myClass(47));
        myList.removeAll(newList);
        print(myList);

    }
}
