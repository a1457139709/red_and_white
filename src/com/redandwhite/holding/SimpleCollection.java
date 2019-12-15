package com.redandwhite.holding;
import java.util.*;
public class SimpleCollection
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i < 10;i++)
            set.add(i);
        for(Integer i : set)
            System.out.print(i + " ");
    }
}
