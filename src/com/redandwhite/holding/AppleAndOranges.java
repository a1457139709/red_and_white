package com.redandwhite.holding;
import java.util.*;
class Gerbil
{
    private int gerbilNumber;
    Gerbil()
    {
        gerbilNumber = 0;
    }
    Gerbil(int gerbilNumber)
    {
        this.gerbilNumber = gerbilNumber;
    }
    public void hop()
    {
        System.out.println(gerbilNumber + " Gerbil is jumping");
    }
}
class Orange{}
public class AppleAndOranges
{
    public static void main(String[] args)
    {
       ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
       for(int i = 0; i < 10;i++)
           gerbils.add(new Gerbil(i));

        for(int i = 0;i < 10;i++)
            gerbils.get(i).hop();
    }
}
