package com.redandwhite.holding;
import java.util.*;
import static com.redandwhite.util.Print.*;
public class Interation
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        List<Integer> list2 = new ArrayList<Integer>();
        ListIterator<Integer> it = list1.listIterator(5);
        while(it.hasPrevious())
        {
            print(it.next());
            list2.add(it.previous());
        }
        print(list2);
    }
}
